package ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

public class ViewGroupePanel extends JPanel {
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

	public ViewGroupePanel(Object [][] info) {
		initComponents(info);
	}

	private void initComponents(Object [][] info) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		border2 = new JPanel();
		centerContent = new JPanel();
		buttonPanel = new JPanel();
		title = new JLabel("Consulter Groupe");
		
		ajouterPanel = new JPanel();
		ajouterTitle = new JLabel();
		idGrp = new JLabel();
		idGrpField = new JTextField();
		libelle = new JLabel();
		libelleField = new JTextField();
		sp = new JLabel();
		spCB = new JComboBox<>();
		AjouterGroupe = new JButton(); 

		//======== this ========
		setBackground(Color.white);
		setLayout(new BorderLayout());
		//======== centerContent ======
		{
			centerContent.setLayout(new BoxLayout(centerContent, BoxLayout.Y_AXIS));

			//======== buttonPanel ========
			{
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
			
			}
			centerContent.add(buttonPanel);

		}	
		//======== scrollPane1 ========
		{
			scrollPane1.setBackground(Color.white);
			scrollPane1.setViewportBorder(null);
			scrollPane1.setDoubleBuffered(true);
			scrollPane1.setBorder(null);
			scrollPane1.getViewport().setBackground(Color.WHITE);
			scrollPane1.setPreferredSize(new Dimension(getPreferredSize().width,10000));

			//---- table1 ----
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
			{
				TableColumnModel cm = table1.getColumnModel();
				cm.getColumn(1).setPreferredWidth(125);
				cm.getColumn(3).setPreferredWidth(125);
				cm.getColumn(4).setPreferredWidth(100);
				cm.getColumn(5).setPreferredWidth(100);
			}
			/* =========Table Roww Model==========
			{
				for(int i=0;i<table1.getRowCount();i++){
					table1.getRow(i).setBAckground(Color.grey);
				}
			}*/
			table1.setGridColor(Color.black);
			table1.setFillsViewportHeight(true);
			table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table1.setBorder(null);
			scrollPane1.setViewportView(table1);
			
		}
		centerContent.add(scrollPane1);
		add(centerContent, BorderLayout.CENTER);

		//======== ajouterPanel ========
		{
			ajouterPanel.setPreferredSize(new Dimension(300, 0));
			ajouterPanel.setBackground(Color.white);
			ajouterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			ajouterPanel.setLayout(new FormLayout(
				"7dlu, $lcgap, 39dlu, 51dlu, $lcgap, 28dlu",
				"30dlu, 2*(default, 25dlu), default, fill:35dlu, 2*($lgap, default)"));

			//---- ajouterTitle ----
			ajouterTitle.setText("Ajouter Groupe");
			ajouterTitle.setFont(new Font("Liberation Sans", Font.PLAIN, 26));
			ajouterPanel.add(ajouterTitle, CC.xywh(2, 1, 5, 1, CC.DEFAULT, CC.BOTTOM));

			//---- idGrp ----
			idGrp.setText("Id Groupe");
			ajouterPanel.add(idGrp, CC.xy(3, 3));
			ajouterPanel.add(idGrpField, CC.xy(4, 3));

			//---- libelle ----
			libelle.setText("Libelle");
			ajouterPanel.add(libelle, CC.xy(3, 5));
			ajouterPanel.add(libelleField, CC.xywh(4, 5, 3, 1));

			//---- sp ----
			sp.setText("Sp\u00e9cialit\u00e9");
			ajouterPanel.add(sp, CC.xy(3, 7));
			ajouterPanel.add(spCB, CC.xywh(4, 7, 3, 1, CC.DEFAULT, CC.CENTER));

			//---- AjouterGroupe ----
			AjouterGroupe.setText("Ajouter");
			ajouterPanel.add(AjouterGroupe, CC.xywh(3, 11, 2, 1));
			ajouterPanel.setVisible(false);
		}
		add(ajouterPanel, BorderLayout.EAST);

		//======== border2 ========
		{
			border2.setPreferredSize(new Dimension(200, 100));
			border2.setBackground(Color.white);
			border2.setLayout(new BorderLayout());
		}
		add(border2, BorderLayout.SOUTH);

	}
}

