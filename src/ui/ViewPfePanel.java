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
public class ViewPfePanel extends JPanel{
    private JPanel title;
    private JLabel label5;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JButton button4;
    private JButton button2;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    public ViewPfePanel() {
	initComponents();
	}

	private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            title = new JPanel();
            label5 = new JLabel();
            textField3 = new JTextField();
            comboBox2 = new JComboBox();
            button4 = new JButton();
            button2 = new JButton();
            panel3 = new JPanel();
            scrollPane1 = new JScrollPane();
            table1 = new JTable();

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
            add(title, BorderLayout.NORTH);

            //======== panel3 ========
            {
                panel3.setLayout(null);

                //======== scrollPane1 ========
                {
                    scrollPane1.setBackground(Color.orange);
                    scrollPane1.setViewportBorder(null);
                    scrollPane1.setDoubleBuffered(true);
                    scrollPane1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                    //---- table1 ----
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, "", "", null, null, null, null, null, null, null},
                            {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        },
                        new String[] {
                            "ID ", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage", "Modifier", "Supprimer"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false, false, false, false, false, false, false, true, true
                        };
                        public Class<?> getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = table1.getColumnModel();
                        cm.getColumn(0).setPreferredWidth(85);
                        cm.getColumn(1).setPreferredWidth(80);
                        cm.getColumn(2).setPreferredWidth(90);
                        cm.getColumn(3).setPreferredWidth(125);
                        cm.getColumn(4).setPreferredWidth(85);
                        cm.getColumn(5).setPreferredWidth(60);
                        cm.getColumn(6).setPreferredWidth(70);
                        cm.getColumn(7).setPreferredWidth(70);
                        cm.getColumn(8).setPreferredWidth(150);
                        cm.getColumn(9).setPreferredWidth(70);
                        cm.getColumn(10).setPreferredWidth(90);
                    }
                    table1.setGridColor(Color.black);
                    table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    table1.setBorder(null);
                    table1.setFillsViewportHeight(true);
                    scrollPane1.setViewportView(table1);
                }
                panel3.add(scrollPane1);
                scrollPane1.setBounds(0, 0, 1145, 500);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            add(panel3, BorderLayout.CENTER);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
}
