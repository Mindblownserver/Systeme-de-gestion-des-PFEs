package net.miginfocom.swt;
/*
 * License (BSD):
 * ==============
 *
 * Copyright (c) 2004, Mikael Grev, MiG InfoCom AB. (miglayout (at) miginfocom (dot) com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or other
 * materials provided with the distribution.
 * Neither the name of the MiG InfoCom AB nor the names of its contributors may be
 * used to endorse or promote products derived from this software without specific
 * prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
 * OF SUCH DAMAGE.
 *
 * @version 1.0
 * @author Mikael Grev, MiG InfoCom AB
 *         Date: 2006-sep-08
 */

import net.miginfocom.layout.*;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;

import java.io.*;
import java.util.*;

/** A very flexbile layout manager.
 * <p>
 * Read the documentation that came with this layout manager for information on usage.
 */
public final class MigLayout extends Layout implements Externalizable
{
	// ******** Instance part ********

	/** The component to string constraints mappings.
	 */
	private final Map<Control, Object> scrConstrMap = new IdentityHashMap<Control, Object>(8);

	/** Hold the serializable text representation of the constraints.
	 */
	private Object layoutConstraints = "", colConstraints = "", rowConstraints = "";    // Should never be null!

	// ******** Transient part ********

	private transient ContainerWrapper cacheParentW = null;

	private transient final Map<ComponentWrapper, CC> ccMap = new HashMap<ComponentWrapper, CC>(8);

	private transient LC lc = null;
	private transient AC colSpecs = null, rowSpecs = null;
	private transient Grid grid = null;

	private transient java.util.Timer debugTimer = null;
	private transient long curDelay = -1;
	private transient int lastModCount = PlatformDefaults.getModCount();
	private transient int lastHash = -1;

	public MigLayout()
	{
		this("", "", "");
	}

	public MigLayout(String layoutConstraints)
	{
		this(layoutConstraints, "", "");
	}

	public MigLayout(String layoutConstraints, String colConstraints, String rowConstraints)
	{
		setLayoutConstraints(layoutConstraints);
		setColumnConstraints(colConstraints);
		setRowConstraints(rowConstraints);
	}

	public MigLayout(LC layoutConstraints)
	{
		this(layoutConstraints, null, null);
	}

	public MigLayout(LC layoutConstraints, AC colConstraints, AC rowConstraints)
	{
		setLayoutConstraints(layoutConstraints);
		setColumnConstraints(colConstraints);
		setRowConstraints(rowConstraints);
	}

	public Object getLayoutConstraints()
	{
		return layoutConstraints;
	}

	public void setLayoutConstraints(Object s)
	{
		if (s == null || s instanceof String) {
			s = ConstraintParser.prepare((String) s);
			lc = ConstraintParser.parseLayoutConstraint((String) s);
		} else if (s instanceof LC) {
			lc = (LC) s;
		} else {
			throw new IllegalArgumentException("Illegal constraint type: " + s.getClass().toString());
		}
		layoutConstraints = s;
		grid = null;
	}

	public Object getColumnConstraints()
	{
		return colConstraints;
	}

	public void setColumnConstraints(Object constr)
	{
		if (constr == null || constr instanceof String) {
			constr = ConstraintParser.prepare((String) constr);
			colSpecs = ConstraintParser.parseColumnConstraints((String) constr);
		} else if (constr instanceof AC) {
			colSpecs = (AC) constr;
		} else {
			throw new IllegalArgumentException("Illegal constraint type: " + constr.getClass().toString());
		}
		colConstraints = constr;
		grid = null;
	}

	public Object getRowConstraints()
	{
		return rowConstraints;
	}

	public void setRowConstraints(Object constr)
	{
		if (constr == null || constr instanceof String) {
			constr = ConstraintParser.prepare((String) constr);
			rowSpecs = ConstraintParser.parseRowConstraints((String) constr);
		} else if (constr instanceof AC) {
			rowSpecs = (AC) constr;
		} else {
			throw new IllegalArgumentException("Illegal constraint type: " + constr.getClass().toString());
		}
		rowConstraints = constr;
		grid = null;
	}

	public Object getComponentConstraints(Control comp)
	{
		return scrConstrMap.get(comp);
	}

	public void setComponentConstraints(Control comp, Object constr)
	{
		setComponentConstraintsImpl(comp, constr, false);
	}

	private void setComponentConstraintsImpl(Control comp, Object constr, boolean noCheck)
	{
		if (noCheck == false && scrConstrMap.containsKey(comp) == false)
			throw new IllegalArgumentException("Component must already be added to parent!");

		ComponentWrapper cw = new SwtComponentWrapper(comp);

		if (constr == null || constr instanceof String) {
			String cStr = ConstraintParser.prepare((String) constr);

			scrConstrMap.put(comp, cStr);
			ccMap.put(cw, ConstraintParser.parseComponentConstraint(cStr));

		} else if (constr instanceof CC) {

			scrConstrMap.put(comp, constr);
			ccMap.put(cw, (CC) constr);

		} else {
			throw new IllegalArgumentException("Constraint must be String or ComponentConstraint: " + constr.getClass().toString());
		}

		grid = null;
	}

	public boolean isManagingComponent(Control c)
	{
		return scrConstrMap.containsKey(c);
	}

	private synchronized void setDebug(final ComponentWrapper parentW, boolean b)
	{
		if (b && (debugTimer == null || curDelay != lc.getDebugMillis())) {
			if (debugTimer != null)
				debugTimer.cancel();

			final Composite parent = (Composite) parentW.getParent().getComponent();

			TimerTask debugTask = new TimerTask() {
				public void run()
				{
				   Display.getDefault ().asyncExec (new Runnable () {
					  public void run () {
						 grid.paintDebug();
					  }
				   });
				}
			};

			debugTimer = new Timer("layout_debug_repaint", true);
			curDelay = lc.getDebugMillis();
			debugTimer.schedule(debugTask, curDelay, curDelay);

			parent.layout();
		} else if (!b && debugTimer != null) {
			debugTimer.cancel();
			debugTimer = null;
		}
	}

	private boolean getDebug()
	{
		return debugTimer != null;
	}

	private final void checkCache(Composite parent)
	{
		if (parent == null)
			return;

		checkConstrMap(parent);

		ContainerWrapper par = checkParent(parent);

		// Check if the grid is valid
		int mc = PlatformDefaults.getModCount();
		if (lastModCount != mc) {
			grid = null;
			lastModCount = mc;
		}

		int hash = 0;
		for (Iterator<ComponentWrapper> it = ccMap.keySet().iterator(); it.hasNext();)
			hash += it.next().getLayoutHashCode();

		if (hash != lastHash) {
			grid = null;
			lastHash = hash;
		}

		setDebug(par, lc.getDebugMillis() > 0);

		if (grid == null)
			grid = new Grid(par, lc, rowSpecs, colSpecs, ccMap);
	}

	private boolean checkConstrMap(Composite parent)
	{
		Control[] comps = parent.getChildren();
		boolean changed = comps.length != scrConstrMap.size();

		for (int i = 0; changed == false && i < comps.length; i++) {
			Control c = comps[i];
			if (scrConstrMap.get(c) != c.getLayoutData())
				changed = true;
		}

		if (changed) {
			scrConstrMap.clear();
			for (int i = 0; i < comps.length; i++) {
				Control c = comps[i];
				setComponentConstraintsImpl(c, c.getLayoutData(), true);
			}
		}
		return changed;
	}

	private final ContainerWrapper checkParent(Composite parent)
	{
		if (parent == null)
			return null;

		if (cacheParentW == null || cacheParentW.getComponent() != parent)
			cacheParentW = new SwtContainerWrapper(parent);

		return cacheParentW;
	}

	public float getLayoutAlignmentX(Composite parent)
	{
		return lc != null && lc.getAlignX() != null ? lc.getAlignX().getPixels(1, checkParent(parent), null) : 0;
	}

	public float getLayoutAlignmentY(Composite parent)
	{
		return lc != null && lc.getAlignY() != null ? lc.getAlignY().getPixels(1, checkParent(parent), null) : 0;
	}

	protected Point computeSize(Composite parent, int wHint, int hHint, boolean flushCache)
	{
		checkCache(parent);

		int w = LayoutUtil.getSizeSafe(grid != null ? grid.getWidth() : null, LayoutUtil.PREF);
		int h = LayoutUtil.getSizeSafe(grid != null ? grid.getHeight() : null, LayoutUtil.PREF);

		return new Point(w, h);
	}

	protected void layout(Composite parent, boolean flushCache)
	{
		checkCache(parent);

		Rectangle r = parent.getClientArea();
		int[] b = new int[] {r.x, r.y, r.width, r.height};

		grid.layout(b, lc.getAlignX(), lc.getAlignY(), getDebug());
	}

	protected boolean flushCache(Control control)
	{
		if (lc.isNoCache())
			grid = null;

		return true;
	}

	// ************************************************
	// Persistence Delegate and Serializable combined.
	// ************************************************

	private Object readResolve() throws ObjectStreamException
	{
		return LayoutUtil.getSerializedObject(this);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
	{
		LayoutUtil.setSerializedObject(this, LayoutUtil.readAsXML(in));
	}

	public void writeExternal(ObjectOutput out) throws IOException
	{
		if (getClass() == MigLayout.class)
			LayoutUtil.writeAsXML(out, this);
	}
}