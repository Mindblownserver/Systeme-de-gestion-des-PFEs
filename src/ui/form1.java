package ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/*
 * Created by JFormDesigner on Thu Mar 28 11:17:52 WAT 2024
 */



/**
 * @author Exclusive
 */
public class form1 extends JFrame {
	public form1() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		scrollPane1 = new JScrollPane();
		panel2 = new JPanel();
		label1 = new JLabel();
		idField = new JTextField();
		label2 = new JLabel();
		libelleField = new JTextField();
		label3 = new JLabel();
		spCB = new JComboBox();
		toggleSp = new JButton();
		specialPanel = new JPanel();
		scrollPane2 = new JScrollPane();
		panel4 = new JPanel();
		label6 = new JLabel();
		idFillField = new JTextField();
		label7 = new JLabel();
		filliereField = new JTextField();
		label5 = new JLabel();
		Ajouter = new JButton();
		label4 = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setBackground(Color.white);
			dialogPane.setLayout(new BorderLayout());

			//======== scrollPane1 ========
			{
				scrollPane1.setBorder(null);
				scrollPane1.setPreferredSize(new Dimension(800, 553));
				scrollPane1.setViewportBorder(Borders.BUTTON_BAR_PAD);
				scrollPane1.setBackground(new Color(0, 153, 153));
				scrollPane1.setForeground(Color.orange);
				scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

				//======== panel2 ========
				{
					panel2.setBackground(Color.white);
					panel2.setLayout(new FormLayout(
						"9dlu, $lcgap, 29dlu, $lcgap, 22dlu, $lcgap, 32dlu, $lcgap, 326dlu, $lcgap, 29dlu, $lcgap, 14dlu",
						"default, $lgap, 20dlu, 5*($lgap, default), $lgap, fill:88dlu, $lgap, 33dlu"));

					//---- label1 ----
					label1.setText("id:");
					panel2.add(label1, CC.xywh(3, 5, 3, 1));
					panel2.add(idField, CC.xywh(7, 5, 5, 1));

					//---- label2 ----
					label2.setText("Libelle");
					panel2.add(label2, CC.xywh(3, 9, 3, 1));
					panel2.add(libelleField, CC.xywh(7, 9, 5, 1));

					//---- label3 ----
					label3.setText("Specialite");
					panel2.add(label3, CC.xywh(3, 13, 4, 1));
					panel2.add(spCB, CC.xywh(7, 13, 3, 1));

					//---- toggleSp ----
					toggleSp.setText("+");
					panel2.add(toggleSp, CC.xy(11, 13));

					//======== specialPanel ========
					{
						specialPanel.setBackground(new Color(248, 250, 253));
						specialPanel.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));
						specialPanel.setLayout(new BorderLayout());

						//======== scrollPane2 ========
						{
							scrollPane2.setBorder(Borders.DIALOG);
							scrollPane2.setViewportBorder(null);
							scrollPane2.setBackground(new Color(248, 248, 248));

							//======== panel4 ========
							{
								panel4.setBackground(new Color(248, 250, 253));
								panel4.setLayout(new FormLayout(
									"57dlu, default:grow",
									"17dlu, 13dlu, 17dlu"));

								//---- label6 ----
								label6.setText("id");
								panel4.add(label6, CC.xy(1, 1));
								panel4.add(idFillField, CC.xy(2, 1));

								//---- label7 ----
								label7.setText("fillier");
								panel4.add(label7, CC.xy(1, 3));
								panel4.add(filliereField, CC.xy(2, 3));
							}
							scrollPane2.setViewportView(panel4);
						}
						specialPanel.add(scrollPane2, BorderLayout.CENTER);

						//---- label5 ----
						label5.setText("Ajouter Sp\u00e9cialit\u00e9");
						label5.setFont(new Font("Liberation Sans", Font.PLAIN, 20));
						label5.setBackground(new Color(248, 248, 248));
						label5.setOpaque(true);
						specialPanel.add(label5, BorderLayout.NORTH);
					}
					panel2.add(specialPanel, CC.xywh(3, 15, 9, 2));

					//---- Ajouter ----
					Ajouter.setText("Ajouter");
					panel2.add(Ajouter, CC.xywh(3, 17, 5, 1));
				}
				scrollPane1.setViewportView(panel2);
			}
			dialogPane.add(scrollPane1, BorderLayout.CENTER);

			//---- label4 ----
			label4.setText("Ajouter Groupe");
			label4.setFont(new Font("Liberation Sans", Font.PLAIN, 30));
			dialogPane.add(label4, BorderLayout.NORTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JScrollPane scrollPane1;
	private JPanel panel2;
	private JLabel label1;
	private JTextField idField;
	private JLabel label2;
	private JTextField libelleField;
	private JLabel label3;
	private JComboBox spCB;
	private JButton toggleSp;
	private JPanel specialPanel;
	private JScrollPane scrollPane2;
	private JPanel panel4;
	private JLabel label6;
	private JTextField idFillField;
	private JLabel label7;
	private JTextField filliereField;
	private JLabel label5;
	private JButton Ajouter;
	private JLabel label4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
