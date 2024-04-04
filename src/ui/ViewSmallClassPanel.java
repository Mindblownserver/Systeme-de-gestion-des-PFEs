package ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import models.Specialite;
import net.miginfocom.swing.MigLayout;
import ui.Components.MyButton;

public class ViewSmallClassPanel extends JPanel {
	private JScrollPane scrollPane1;
	private JLabel title;
	private JTable table1;
	private JPanel border2;
	private JPanel centerContent;
	private JPanel buttonPanel;
	private JButton modifyBtn=new JButton("Modifier");
	private JButton deleteBtn = new JButton("Delete");
	private JButton ajouterBtn = new JButton("Ajouter");
	
	private JPanel ajouterPanel;
	private JLabel ajouterTitle;
	private JLabel idGrp;
	private JTextField idGrpField;
	private JLabel libelle;
	private JTextField libelleField;
	private JLabel sp;
	private JComboBox<String> spCB;
	private JButton AjouterGroupe;
	private Boolean estVisible=false;

	public ViewSmallClassPanel(String nomDuClasse,Object [][] info) {
		initComponents(nomDuClasse,info);
	}

	private void initComponents(String nomDuClasse, Object [][] info) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		border2 = new JPanel();
		centerContent = new JPanel();
		buttonPanel = new JPanel();
		title = new JLabel("Consulter "+nomDuClasse);
		
		ajouterPanel = new JPanel();
		ajouterTitle = new JLabel("Section de l'ajout");
		idGrp = new JLabel("Id "+nomDuClasse);
		idGrpField = new JTextField();
		libelle = new JLabel("Libelle");
		libelleField = new JTextField();
		sp = new JLabel("Specialite");
		spCB = new JComboBox<>();
		AjouterGroupe = new JButton(); 
		//======== this ========
		setBackground(Color.white);
		setLayout(new BorderLayout());
		//======== centerContent ======
		
                centerContent.setLayout(new BoxLayout(centerContent, BoxLayout.Y_AXIS));

                //======== buttonPanel ========

                buttonPanel.setBackground(Color.white);
                buttonPanel.setLayout(null);
                buttonPanel.add(ajouterBtn);
                buttonPanel.add(title);
                title.setFont(MyComponents.h1);
                title.setBounds(10,10,400,50);
                ajouterBtn.setBounds(new Rectangle(new Point(500, 80), new Dimension(100,30)));
                ajouterBtn.addActionListener(ee->{
                        estVisible = !estVisible;
                        ajouterPanel.setVisible(estVisible);
                });
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

                centerContent.add(buttonPanel);

		//======== scrollPane1 ========

                scrollPane1.setBackground(Color.white);
                scrollPane1.setViewportBorder(null);
                scrollPane1.setDoubleBuffered(true);
                scrollPane1.setBorder(null);
                scrollPane1.getViewport().setBackground(Color.WHITE);
                scrollPane1.setPreferredSize(new Dimension(getPreferredSize().width,10000));

                //---- table1 ----
                // In terms with genericity, you need to get the TableInfo of
                // the object that we desire to display and manipulate (add, remove, edit)
                table1.setModel(new DefaultTableModel(
                        new Object[][] {
                                {null, null, null, null, modifyBtn, deleteBtn},
                                {null, null, null, null, null, null},
                        },
                        new String[] {
                                "ID Groupe", "Libelle", "ID Filliere", "Filliere", "Modifier", "Supprimer"
                        }
                ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, String.class, JButton.class, JButton.class
                        };
                        boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false
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
                TableCellRenderer tableRenderer = table1.getDefaultRenderer(deleteBtn.getClass());
                table1.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));

                //========Table Column Model=========
                
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(1).setPreferredWidth(125);
                cm.getColumn(3).setPreferredWidth(125);
                cm.getColumn(4).setPreferredWidth(100);
                cm.getColumn(5).setPreferredWidth(100);

                /* =========Table Roww Model==========
                {
                        for(int i=0;i<table1.getRowCount();i++){
                                table1.getRow(i).setBAckground(Color.grey);
                        }
                }*/
                table1.setGridColor(Color.black);
                table1.setFillsViewportHeight(true);
                table1.setRowHeight(40);
                table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                table1.setBorder(null);
                scrollPane1.setViewportView(table1);
			
		
		centerContent.add(scrollPane1);
		add(centerContent, BorderLayout.CENTER);

		//======== ajouterPanel ========
		
                ajouterPanel.setPreferredSize(new Dimension(900,ajouterPanel.getPreferredSize().height));
                ajouterPanel.setLayout(new MigLayout(
                        "insets 50 50 0 0,hidemode 3,alignx left",
                            // columns
                            "[80,fill]" +
                            "[97,fill]",
                            // rows
                            "[40,shrink 0,top]" +
                            "[42]0" +
                            "[32, fill]" +
                            "[42]0" +
                            "[32,fill]" +
                            "[42]0" +
                            "[32,fill]" +
                            "[]2sp" +
                            "[]"));
                ajouterPanel.setBackground(Color.WHITE);
                ajouterPanel.setOpaque(true);
                ajouterTitle.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
                ajouterPanel.add(ajouterTitle, "cell 0 0 2 1,height 100:100:100");

                //---- label2 ----
                idGrp.setText("Id Groupe");
                idGrp.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
                ajouterPanel.add(idGrp, "cell 0 1");
                ajouterPanel.add(idGrpField, "cell 0 2");

                //---- label3 ----
                ajouterPanel.add(libelle, "cell 0 3");
                ajouterPanel.add(libelleField, "cell 0 4 2 1, width 200px");

                //---- label4 ----
                ajouterPanel.add(sp, "cell 0 5");
                ajouterPanel.add(spCB, "cell 0 6 2 1, width 200px");

                //---- button3 ----
                AjouterGroupe.setText("Ajouter "); 
                ajouterPanel.add(AjouterGroupe, "cell 0 8 2 1");
                ajouterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                ajouterPanel.setVisible(false);
		
                
		add(ajouterPanel, BorderLayout.EAST);

		//======== border2 ========
		
                border2.setPreferredSize(new Dimension(200, 100));
                border2.setBackground(Color.white);
                border2.setLayout(new BorderLayout());

		add(border2, BorderLayout.SOUTH);

	}
}

