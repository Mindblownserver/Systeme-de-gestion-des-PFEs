/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

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
    
    public class LeftAdditionalInfoPfe extends JPanel {
        public LeftAdditionalInfoPfe() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            themeField = new JTextField();
            label3 = new JLabel();
            sujetField = new JTextField();
            label4 = new JLabel();
            descScroll = new JScrollPane();
            descArea = new JTextArea();

            //======== plusInfoPane ========
            {
                this.setLayout(new MigLayout(
                    "insets 0 20 0 0,hidemode 3",
                    // columns
                    "[78,fill]0" +
                    "[141,grow,fill]0" +
                    "[0,fill]" +
                    "[fill]",
                    // rows
                    "[40,center]rel" +
                    "[35,center]rel" +
                    "[35,center]rel" +
                    "[215,grow,center]rel" +
                    "[center]"));

                //---- label1 ----
                label1.setText("Plus D'informations:");
                label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
                this.add(label1, "cell 0 0 2 1");

                //---- label2 ----
                label2.setText("th\u00e8me");
                this.add(label2, "cell 0 1");

                //---- themeField ----
                themeField.setEditable(false);
                themeField.setText("Architecture des micro services");
                themeField.setBackground(Color.white);
                this.add(themeField, "cell 1 1,growy");

                //---- label3 ----
                label3.setText("Sujet");
                this.add(label3, "cell 0 2,aligny center,growy 0");

                //---- sujetField ----
                sujetField.setText("Migration d'une application vers une architecture micro services");
                sujetField.setEditable(false);
                sujetField.setBackground(Color.white);
                this.add(sujetField, "cell 1 2,growy");

                //---- label4 ----
                label4.setText("Description");
                this.add(label4, "cell 0 3,aligny top,growy 0");

                //======== descScroll ========
                {

                    //---- descArea ----
                    descArea.setText("M\u00e9moire de fin de cycle pour l'obtention du dipl\u00f4me de master en sciences commerciales\nOption : Marketing Th\u00e8me : R\u00e9alis\u00e9 par : Encadr\u00e9 par : AMROUCHI Kaci Mr. KHERRI Abdenacer Maitre de conf\u00e9rences \u00e0 HEC Alger 5 \u00e8me promotion Juin 2018 \n\u00c9cole des Hautes \u00c9tudes Commerciales \nL'impact de la communication digitale sur la fid\u00e9lisation de la client\u00e8le \n\u00c9tude de cas : Formation-dz R\u00e9sum\u00e9 I R\u00e9sum\u00e9 : \nLe monde a chang\u00e9, la soci\u00e9t\u00e9 a \u00e9volu\u00e9, l'av\u00e8nement du digital a modifi\u00e9 nos habitudes et notre fa\u00e7on de vivre.");
                    descArea.setRows(13);
                    descArea.setLineWrap(true);
                    descArea.setEditable(false);
                    descArea.setBackground(Color.white);
                    descScroll.setViewportView(descArea);
                }
                this.add(descScroll, "cell 1 3,growy");
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JLabel label2;
        private JTextField themeField;
        private JLabel label3;
        private JTextField sujetField;
        private JLabel label4;
        private JScrollPane descScroll;
        private JTextArea descArea;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public class TabbedPfePane extends JPanel{
        public TabbedPfePane() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            pfeTabPanel = new JTabbedPane();
            etudiantTab = new JPanel();
            etudiantScroll = new JScrollPane();
            etudiantTable = new JTable();
            juryTab = new JPanel();
            juryScroll = new JScrollPane();
            juryTable = new JTable();
            soutTab = new JPanel();
            soutScroll = new JScrollPane();
            soutTable = new JTable();

            //======== pfeTabPanel ========
            {

                //======== etudiantTab ========
                {
                    etudiantTab.setLayout(new BorderLayout());

                    //======== etudiantScroll ========
                    {

                        //---- etudiantTable ----
                        etudiantTable.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, null, "Binome", "Interne"},
                                {null, null, null, null, null, "Monome", "Externe"},
                            },
                            new String[] {
                                "Prenom", "Nom", "CIN", "Photo", "Groupe et Sp\u00e9cialit\u00e9", "Projet/Stage trait\u00e9 en:", "Nature du projet"
                            }
                        ) {
                            Class<?>[] columnTypes = new Class<?>[] {
                                String.class, String.class, String.class, Object.class, Object.class, String.class, Object.class
                            };
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false, false, false
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
                        {
                            TableColumnModel cm = etudiantTable.getColumnModel();
                            cm.getColumn(1).setPreferredWidth(125);
                        }
                        etudiantTable.setGridColor(Color.black);
                        etudiantTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                        etudiantTable.setBorder(null);
                        etudiantTable.setFillsViewportHeight(true);
                        etudiantTable.setRowHeight(40);
                        etudiantTable.setPreferredSize(new Dimension(775, 80));
                        etudiantTable.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                        etudiantTable.setCellSelectionEnabled(true);
                        etudiantScroll.setViewportView(etudiantTable);
                    }
                    etudiantTab.add(etudiantScroll, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Etudiant (2)", etudiantTab);

                //======== juryTab ========
                {
                    juryTab.setLayout(new BorderLayout());

                    //======== juryScroll ========
                    {

                        //---- juryTable ----
                        juryTable.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, ""},
                                {null, null, null, null, null},
                            },
                            new String[] {
                                "ID", "Local", "Filli\u00e8re", "CIN president", "nom et prenom president"
                            }
                        ));
                        juryScroll.setViewportView(juryTable);
                    }
                    juryTab.add(juryScroll, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Jury (1)", juryTab);

                //======== soutTab ========
                {
                    soutTab.setLayout(new BorderLayout());

                    //======== soutScroll ========
                    {

                        //---- soutTable ----
                        soutTable.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                            },
                            new String[] {
                                "ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, true, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        soutScroll.setViewportView(soutTable);
                    }
                    soutTab.add(soutScroll, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Soutenance (1)", soutTab);
            }
            this.setLayout(new BorderLayout());
            this.add(pfeTabPanel, BorderLayout.CENTER);
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTabbedPane pfeTabPanel;
        private JPanel etudiantTab;
        private JScrollPane etudiantScroll;
        private JTable etudiantTable;
        private JPanel juryTab;
        private JScrollPane juryScroll;
        private JTable juryTable;
        private JPanel soutTab;
        private JScrollPane soutScroll;
        private JTable soutTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    
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
            JPanel centerContent = new JPanel(null);
            LeftAdditionalInfoPfe plusInfo = new LeftAdditionalInfoPfe();
            TabbedPfePane pfeTab = new TabbedPfePane();

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
            
            //====CenterContent=======
            int y = 100;
            table.setBounds(0,0,1310,400+y);
            pfeTab.setBounds(0,400+y+10,1310,400);
            plusInfo.setBounds(1330,0,575,407+y);
            centerContent.add(table);
            centerContent.add(plusInfo);
            centerContent.add(pfeTab);
            centerContent.setBackground(Color.WHITE);
            plusInfo.setBackground(Color.WHITE);
            pfeTab.setBackground(Color.WHITE);
            
            button2.addActionListener(l->{
                ajouterPfeD.setVisible(true);
            });
            eastBorder.setPreferredSize(new Dimension(10,0));
            westBorder.setPreferredSize(new Dimension(10,0));
            add(centerContent, BorderLayout.CENTER);
            add(eastBorder, BorderLayout.EAST);
            add(westBorder,BorderLayout.WEST);
            add(title, BorderLayout.NORTH);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
}
