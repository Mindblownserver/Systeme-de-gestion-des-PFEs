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

import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.ContainerWrapper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.*;

/**
 */
public class SwtComponentWrapper implements ComponentWrapper
{
	/** Debug color for component bounds outline.
	 */
	private static Color DB_COMP_OUTLINE = new Color(Display.getCurrent(), 0, 0, 200);

	private static boolean vp = true;

	private final Control c;
	private int compType = TYPE_UNSET;

	public SwtComponentWrapper(Control c)
	{
		this.c = c;
	}

	public final int getBaseline(int width, int height)
	{
		return -1;
	}

	public final Object getComponent()
	{
		return c;
	}

	public final float getPixelUnitFactor(boolean isHor)
	{
		GC gc = new GC(c);
		FontMetrics fm = gc.getFontMetrics();
		float f = isHor ? fm.getAverageCharWidth() / 5f : fm.getHeight() / 13f;
		gc.dispose();
		return f;
	}

//	/** Cache.
//	 */
//	private final static IdentityHashMap<FontMetrics, Point.Float> FM_MAP2 = new IdentityHashMap<FontMetrics, Point.Float>(4);
//	private final static Font SUBST_FONT2 = new Font("sansserif", Font.PLAIN, 11);
//
//	public float getDialogUnit(boolean isHor)
//	{
//		Font font = c.getFont();
//		FontMetrics fm = c.getFontMetrics(font != null ? font : SUBST_FONT2);
//		Point.Float dluP = FM_MAP2.get(fm);
//		if (dluP == null) {
//			float w = fm.charWidth('X') / 4f;
//			int ascent = fm.getAscent();
//			float h = (ascent > 14 ? ascent : ascent + (15 - ascent) / 3) / 8f;
//
//			dluP = new Point.Float(w, h);
//			FM_MAP2.put(fm, dluP);
//		}
//		return isHor ? dluP.x : dluP.y;
//	}

	public final int getX()
	{
		return c.getLocation().x;
	}

	public final int getY()
	{
		return c.getLocation().y;
	}

	public final int getWidth()
	{
		return c.getSize().x;
	}

	public final int getHeight()
	{
		return c.getSize().y;
	}

	public final int getScreenLocationX()
	{
		return c.toDisplay(0, 0).x;
	}

	public final int getScreenLocationY()
	{
		return c.toDisplay(0, 0).y;
	}

	public final int getMinimumHeight()
	{
		return computeSize().y;
	}

	public final int getMinimumWidth()
	{
		return computeSize().x;
	}

	public final int getPreferredHeight()
	{
		return computeSize().y;
	}

	public final int getPreferredWidth()
	{
		return computeSize().x;
	}

	public final int getMaximumHeight()
	{
		return Short.MAX_VALUE;
	}

	public final int getMaximumWidth()
	{
		return Short.MAX_VALUE;
	}

	private final Point computeSize()
	{
		return c.computeSize(SWT.DEFAULT, SWT.DEFAULT);
	}

	public final ContainerWrapper getParent()
	{
		return new SwtContainerWrapper(c.getParent());
	}

	public int getHorizontalScreenDPI()
	{
		return c.getDisplay().getDPI().x;
	}

	public int getVerticalScreenDPI()
	{
		return c.getDisplay().getDPI().y;
	}

	public final int getScreenWidth()
	{
		return c.getDisplay().getBounds().width;
	}

	public final int getScreenHeight()
	{
		return c.getDisplay().getBounds().height;
	}

	public final boolean hasBaseline()
	{
		return getBaseline(10, 10) != -1;
	}

	public final boolean isLeftToRight()
	{
		return (c.getStyle() & SWT.LEFT_TO_RIGHT) > 0;
	}

	public final String getLinkId()
	{
		return null;
	}

	public final void setBounds(int x, int y, int width, int height)
	{
		c.setBounds(x, y, width, height);
	}

	public boolean isVisible()
	{
		return c.isVisible();
	}

	public final int[] getVisualPadding()
	{
		return null;
	}

	public final static boolean isUseVisualPadding()
	{
		return SwtComponentWrapper.vp;
	}

	public final static void setUseVisualPadding(boolean b)
	{
		SwtComponentWrapper.vp = b;
	}

	public int getLayoutHashCode()
	{
		if (c.isDisposed())
			return -1;

		Point p = c.computeSize(SWT.DEFAULT, SWT.DEFAULT, false);
		int h = p.x + (p.y << 12);

		if (c.isVisible())
			h |= (1 << 25);

		if (isLeftToRight())
			h |= (1 << 26);

		String id = getLinkId();
		h += id != null ? id.hashCode() : (1 << 27);
		return h;
	}

	public final void paintDebugOutline()
	{
		if (c.isDisposed())
			return;

		GC gc = new GC(c);

		gc.setLineJoin(SWT.JOIN_MITER);
		gc.setLineCap(SWT.CAP_SQUARE);
		gc.setLineStyle(SWT.LINE_DOT);

		gc.setForeground(DB_COMP_OUTLINE);
		gc.drawRectangle(0, 0, getWidth() - 1, getHeight() - 1);

		gc.dispose();
	}

	public int getComponetType(boolean disregardScrollPane)
	{
		if (compType == TYPE_UNSET)
			compType = checkType();

		return compType;
	}

	private final int checkType()
	{
		int s = c.getStyle();

		if (c instanceof Text) {
			return (s & SWT.MULTI) > 0 ? TYPE_TEXT_AREA : TYPE_TEXT_FIELD;
		} else if (c instanceof Label) {
			return (s & SWT.SEPARATOR) > 0 ? TYPE_SEPARATOR : TYPE_LABEL;
		} else if (c instanceof Button) {
			if ((s & SWT.CHECK) > 0 || (s & SWT.RADIO) > 0)
				return TYPE_CHECK_BOX;
			return TYPE_BUTTON;
		} else if (c instanceof Canvas) {
			return TYPE_PANEL;
		} else if (c instanceof List) {
			return TYPE_LIST;
		} else if (c instanceof Table) {
			return TYPE_TABLE;
		} else if (c instanceof Spinner) {
			return TYPE_SPINNER;
		} else if (c instanceof ProgressBar) {
			return TYPE_PROGRESS_BAR;
		} else if (c instanceof Slider) {
			return TYPE_SLIDER;
		} else if (c instanceof Composite) {    // only AWT components is not containers.
			return TYPE_CONTAINER;
		}
		return TYPE_UNKNOWN;
	}

	public final int hashCode()
	{
		return getComponent().hashCode();
	}

	public final boolean equals(Object o)
	{
		if (o == null || o instanceof ComponentWrapper == false)
			return false;

		return getComponent().equals(((ComponentWrapper) o).getComponent());
	}
}
