/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class ViewEtudiantPanel extends javax.swing.JPanel {
    private JTabbedPane addtionalInfo;
    private JPanel pfeEncadre;
    private JPanel pfeRapporte;
    private JPanel this2;
    private JPanel panel1;
    private JLabel titreAjout;
    private JLabel cin;
    private JTextField cinField;
    private JLabel prenom;
    private JTextField prenomField;
    private JLabel nom;
    private JTextField nomField;
    private JLabel grad;
    private JTextField gradField;
    private JButton AjouterBtn;
    private JLayeredPane lpane;
    private JPanel buttonPanel;
    private JButton toggleAjouterPanelBtn;
    private JScrollPane scrollPane1;
    private JTable table1;
    private boolean estVisible = false;
    private JButton modifyBtn= new JButton("Modifier"), deleteBtn= new JButton("Supprimer");
    public ViewEtudiantPanel() {
		init();
	}

	private void init() {
		// JFormDesigner - Component initialization - DO NOT MODIFY                                            
		addtionalInfo = new JTabbedPane();
		pfeEncadre = new JPanel();
		pfeRapporte = new JPanel();
		this2 = new JPanel();
		panel1 = new JPanel();
		titreAjout = new JLabel();
		cin = new JLabel();
		cinField = new JTextField();
		prenom = new JLabel();
		prenomField = new JTextField();
		nom = new JLabel();
		nomField = new JTextField();
		grad = new JLabel();
		gradField = new JTextField();
		AjouterBtn = new JButton();
		lpane = new JLayeredPane();
		buttonPanel = new JPanel();
		toggleAjouterPanelBtn = new JButton();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
                JLabel title = new JLabel();

		//======== this ========
		setLayout(new BorderLayout());

		//======== addtionalInfo ========
		{
			addtionalInfo.setPreferredSize(new Dimension(224, 500));

			//======== pfeEncadre ========
			{
				pfeEncadre.setLayout(new BorderLayout());
			}
			addtionalInfo.addTab("PFE (1)", pfeEncadre);

			//======== pfeRapporte ========
			{
				pfeRapporte.setLayout(new BorderLayout());
			}
			addtionalInfo.addTab("Bin\u00f4me (0)", pfeRapporte);
		}
		add(addtionalInfo, BorderLayout.SOUTH);

		//======== this2 ========
		{
			this2.setBackground(Color.white);
			this2.setLayout(new BorderLayout());

			//======== panel1 ========
			{
				panel1.setPreferredSize(new Dimension(500, 0));
				panel1.setBackground(Color.white);
                                panel1.setVisible(estVisible);
				panel1.setBorder(LineBorder.createBlackLineBorder());
				panel1.setLayout(new MigLayout(
					"insets 50 4 0 0,hidemode 3,alignx center",
					// columns
					"[80,fill]" +
					"[97,fill]",
					// rows
					"[40,shrink 0,top]" +
					"[42]0" +
					"[32]" +
					"[42]0" +
					"[32,fill]" +
					"[41]" +
					"[32,fill]" +
					"[42]" +
					"[32,fill]" +
					"20[41]" 
                                        ));

				//---- titreAjout ----
				titreAjout.setText("Ajouter etudiant");
				titreAjout.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
				panel1.add(titreAjout, "cell 0 0 2 1,height 100:100:100");

				//---- cin ----
				cin.setText("cin ");
				cin.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
				panel1.add(cin, "cell 0 1");
				panel1.add(cinField, "cell 0 2,growy");

				//---- prenom ----
				prenom.setText("Prenom");
				panel1.add(prenom, "cell 0 3");
				panel1.add(prenomField, "cell 0 4 2 1, width 200px");

				//---- nom ----
				nom.setText("Nom");
				panel1.add(nom, "cell 0 5");
				panel1.add(nomField, "cell 0 6 2 1,width 200px");

				//---- grad ----
				grad.setText("photo");
				panel1.add(grad, "cell 0 7");
				panel1.add(gradField, "cell 0 8 2 1,width 200px");

				//---- AjouterBtn ----
				AjouterBtn.setText("Ajouter enseignant");
				panel1.add(AjouterBtn, "cell 0 10 2 1");
                                
			}
			this2.add(panel1, BorderLayout.EAST);

			//======== lpane ========
			{

				//======== buttonPanel ========
				{
					buttonPanel.setBackground(Color.white);
					buttonPanel.setLayout(null);
                                        title.setText("Consulter Etudiant");
                                        title.setFont(MyComponents.h1);
                                        title.setBounds(10,10,400,60);
                                        buttonPanel.add(title);
					//---- toggleAjouterPanelBtn ----
					toggleAjouterPanelBtn.setText("Ajouter");
					buttonPanel.add(toggleAjouterPanelBtn);
					toggleAjouterPanelBtn.setBounds(new Rectangle(new Point(1100, 55), toggleAjouterPanelBtn.getPreferredSize()));
                                        toggleAjouterPanelBtn.addActionListener(l->{
                                            estVisible = !estVisible;
                                            panel1.setVisible(estVisible);
                                        });
					{
						// compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < buttonPanel.getComponentCount(); i++) {
							Rectangle bounds = buttonPanel.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = buttonPanel.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						buttonPanel.setMinimumSize(preferredSize);
						buttonPanel.setPreferredSize(preferredSize);
					}
				}
				lpane.add(buttonPanel, JLayeredPane.DEFAULT_LAYER);
				buttonPanel.setBounds(new Rectangle(new Point(0, 0), buttonPanel.getPreferredSize()));

				//======== scrollPane1 ========
				{
					scrollPane1.setBackground(Color.orange);
					scrollPane1.setViewportBorder(null);
					scrollPane1.setDoubleBuffered(true);
					scrollPane1.setBorder(null);

					//---- table1 ----
					table1.setModel(new DefaultTableModel(
						new Object[][] {
							{null, null, null, null, null, "Binome", "Interne",modifyBtn, deleteBtn},
							{null, null, null, null, null, "Monome", "Externe", modifyBtn, deleteBtn},
						},
						new String[] {
							"Prenom", "Nom", "CIN", "Photo", "Groupe et Sp\u00e9cialit\u00e9", "Projet/Stage trait\u00e9 en:", "Nature du projet", "Modifier", "Supprimer"
						}
					) {
						Class<?>[] columnTypes = new Class<?>[] {
							String.class, String.class, String.class, Object.class, Object.class, String.class, Object.class, JButton.class, JButton.class
						};
						boolean[] columnEditable = new boolean[] {
							false, false, false, false, false, false, false, false, false
						};
						@Override
						public Class<?> getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						@Override
						public boolean isCellEditable(int rowIndex, int columnIndex) {
							return columnEditable[columnIndex];
						}
					});
                                        TableCellRenderer tableRenderer = table1.getDefaultRenderer(JButton.class);
                                table1.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
					{
						TableColumnModel cm = table1.getColumnModel();
						cm.getColumn(1).setPreferredWidth(125);
					}
					table1.setShowGrid(true);
					table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					table1.setBorder(null);
                                        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table1.setFillsViewportHeight(true);
					table1.setRowHeight(40);
					table1.setPreferredSize(new Dimension(900, 80));
                                        table1.getTableHeader().setDefaultRenderer( new MyComponents.MyHeaderRenderer());
					table1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
					scrollPane1.setViewportView(table1);
				}
				lpane.add(scrollPane1, JLayeredPane.DEFAULT_LAYER);
				scrollPane1.setBounds(0, 79, 1200, 525);
			}
			this2.add(lpane, BorderLayout.CENTER);
		}
		add(this2, BorderLayout.CENTER);
		// JFormDesigner - End of component initialization                                         
	}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
