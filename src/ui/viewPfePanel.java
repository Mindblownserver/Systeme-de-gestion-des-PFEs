/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author yassine
 */
public class viewPfePanel extends JPanel{
    private JPanel title;
    private JLabel label5;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JButton button4;
    private JButton button2;
    private JPanel eastBorder;
    private MyComponents.PFETable table;
    private AjouterPage.AjouterPFEDialog ajouterPfeD;
    public viewPfePanel() {
	initComponents();
	}

	private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            title = new JPanel();
            label5 = new JLabel();
            textField3 = new JTextField();
            comboBox2 = new JComboBox();
            button4 = new JButton();
            button2 = new JButton();//ajouter
            eastBorder = new JPanel();
            table = new MyComponents.PFETable();
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            ajouterPfeD = new AjouterPage.AjouterPFEDialog(topFrame);
            JPanel westBorder = new JPanel();

            //======== this ========
            setLayout(new BorderLayout());

            //======== title ========
            {

                title.setBackground(Color.white);
                title.setPreferredSize(new Dimension(75, 150));
                title.setLayout(new FormLayout(
                    "166dlu, $lcgap, 56dlu, 3dlu, 42dlu, default",
                    "26dlu, $lgap, fill:20dlu, $lgap, 21dlu"));

                //---- label5 ----
                label5.setText("Consulter Groupe");
                label5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
                label5.setHorizontalAlignment(SwingConstants.LEFT);
                title.add(label5, CC.xywh(1, 1, 3, 1));
                title.add(textField3, CC.xy(1, 3));
                title.add(comboBox2, CC.xy(3, 3));

                //---- button4 ----
                button4.setText("chercher");
                title.add(button4, CC.xy(5, 3));

                //---- button2 ----
                button2.setText("Ajouter");
                title.add(button2, CC.xy(5, 5, CC.DEFAULT, CC.FILL));
            }
            
            button2.addActionListener(l->{
                ajouterPfeD.setVisible(true);
            });
            eastBorder.setPreferredSize(new Dimension(10,0));
            westBorder.setPreferredSize(new Dimension(10,0));
            add(table, BorderLayout.CENTER);
            add(eastBorder, BorderLayout.EAST);
            add(westBorder,BorderLayout.WEST);
            add(title, BorderLayout.NORTH);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
}
