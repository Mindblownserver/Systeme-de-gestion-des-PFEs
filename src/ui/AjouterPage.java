package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

public class AjouterPage {
    public static class AjouterGroupe extends JPanel {
        private JLabel label1;
        private JLabel label2;
        private JTextField textField1;
        private JLabel label3;
        private JTextField textField2;
        private JLabel label4;
        private JComboBox comboBox1;
        private JButton button3;
        public AjouterGroupe() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            textField1 = new JTextField();
            label3 = new JLabel();
            textField2 = new JTextField();
            label4 = new JLabel();
            comboBox1 = new JComboBox();
            button3 = new JButton();

            //======== this ========
            setBackground(Color.white);
            setBorder(LineBorder.createBlackLineBorder());
            setLayout(new MigLayout(
                "insets 50 50 0 0,hidemode 3, alignx left",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[center]" +
                "[center]" +
                "[center]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Ajouter groupe");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            add(label1, "cell 0 1 2 1,height 100:100:100");

            //---- label2 ----
            label2.setText("Id Groupe");
            label2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
            add(label2, "cell 0 2");
            add(textField1, "cell 0 3");

            //---- label3 ----
            label3.setText("Libelle");
            add(label3, "cell 0 4");
            add(textField2, "cell 0 5 2 1, width 200px");

            //---- label4 ----
            label4.setText("Specialite");
            add(label4, "cell 0 6");
            add(comboBox1, "cell 0 7 2 1, width 200px");

            //---- button3 ----
            button3.setText("text");
            add(button3, "cell 0 9 2 1");

        }
    }
    public static class AjouterOrganisme extends JPanel {
        public AjouterOrganisme() {
            initComponents();
        }

        private void initComponents() {
            label1 = new JLabel();
            label2 = new JLabel();
            textField1 = new JTextField();
            label3 = new JLabel();
            textField2 = new JTextField();
            label4 = new JLabel();
            textField3 = new JTextField();
            button1 = new JButton();
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            this.setBackground(Color.WHITE);
            //======== this ========
            setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[141,fill]" +
                "[158,fill]" +
                "[84,fill]",
                // rows
                "[32]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[]"));

            //---- label1 ----
            label1.setText("Ajouter Organisme");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            add(label1, "cell 0 0 3 1");

            //---- label2 ----
            label2.setText("Id");
            add(label2, "cell 0 1");
            add(textField1, "cell 1 1 2 1,growy");

            //---- label3 ----
            label3.setText("Nom de l'organisme");
            add(label3, "cell 0 2");
            add(textField2, "cell 1 2 2 1,growy");

            //---- label4 ----
            label4.setText("Domaine d'activit\u00e9");
            add(label4, "cell 0 3");
            add(textField3, "cell 1 3 2 1");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 2 4");
        }

        private JLabel label1;
        private JLabel label2;
        private JTextField textField1;
        private JLabel label3;
        private JTextField textField2;
        private JLabel label4;
        private JTextField textField3;
        private JButton button1;
    }
    public static class AjouterEncadreurExt extends JPanel {
        public AjouterEncadreurExt() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            textField1 = new JTextField();
            label3 = new JLabel();
            textField2 = new JTextField();
            label4 = new JLabel();
            textField3 = new JTextField();
            label5 = new JLabel();
            textField4 = new JTextField();
            label6 = new JLabel();
            textField5 = new JTextField();
            label7 = new JLabel();
            textField6 = new JTextField();
            label8 = new JLabel();
            comboBox1 = new JComboBox();
            button1 = new JButton();

            //======== this ========
            setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[98,fill]" +
                "[149,fill]" +
                "[51,label]" +
                "[115,grow,fill]",
                // rows
                "[]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[31]" +
                "[31]" +
                "[32]" +
                "[32]" +
                "[]"));
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            this.setBackground(Color.WHITE);
            //---- label1 ----
            label1.setText("Ajouter Encadreur Professionel");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            add(label1, "cell 0 0 4 1");

            //---- label2 ----
            label2.setText("CIN");
            add(label2, "cell 0 1");
            add(textField1, "cell 1 1 2 1,growy");

            //---- label3 ----
            label3.setText("Nom");
            add(label3, "cell 0 2");
            add(textField2, "cell 1 2 2 1,growy");

            //---- label4 ----
            label4.setText("Prenom");
            add(label4, "cell 0 3");
            add(textField3, "cell 1 3 2 1,growy");

            //---- label5 ----
            label5.setText("Tel");
            add(label5, "cell 0 4");
            add(textField4, "cell 1 4 2 1,growy");

            //---- label6 ----
            label6.setText("Email");
            add(label6, "cell 0 5");
            add(textField5, "cell 1 5 2 1,growy");

            //---- label7 ----
            label7.setText("poste");
            add(label7, "cell 0 6");
            add(textField6, "cell 1 6 2 1,growy");

            //---- label8 ----
            label8.setText("Organisme");
            add(label8, "cell 0 7");
            add(comboBox1, "cell 1 7 2 1,growy");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 2 8");
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JLabel label2;
        private JTextField textField1;
        private JLabel label3;
        private JTextField textField2;
        private JLabel label4;
        private JTextField textField3;
        private JLabel label5;
        private JTextField textField4;
        private JLabel label6;
        private JTextField textField5;
        private JLabel label7;
        private JTextField textField6;
        private JLabel label8;
        private JComboBox comboBox1;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class AjouterJuryDialogue extends JDialog {
        public AjouterJuryDialogue(Window owner) {
            super(owner);
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            panel1 = new JPanel();
            label2 = new JLabel();
            idField = new JTextField();
            label3 = new JLabel();
            localCB = new JComboBox();
            label4 = new JLabel();
            filliereCB = new JComboBox();
            label5 = new JLabel();
            ensScroll = new JScrollPane();
            ensTable = new JTable();
            button1 = new JButton();

            this.setBackground(Color.WHITE);
            //======== this ========
            Container contentPane = getContentPane();
            contentPane.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("  Ajouter Jury");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            contentPane.add(label1, BorderLayout.NORTH);

            //======== panel1 ========
            {
                panel1.setLayout(new MigLayout(
                    "insets 0,hidemode 3,gap 0 0",
                    // columns
                    "[11,fill]" +
                    "[57,fill]" +
                    "[118,fill]" +
                    "[0,fill]" +
                    "[grow,fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[32,center]" +
                    "[12,center]" +
                    "[32,center]" +
                    "[13,center]" +
                    "[32,fill]" +
                    "[13]" +
                    "[32,grow]" +
                    "[]" +
                    "[32]" +
                    "[]"));

                //---- label2 ----
                label2.setText("Id jury");
                panel1.add(label2, "cell 1 1");
                panel1.add(idField, "cell 2 1,growy");

                //---- label3 ----
                label3.setText("Local");
                panel1.add(label3, "cell 1 3");
                panel1.add(localCB, "cell 2 3,growy");

                //---- label4 ----
                label4.setText("Filli\u00e8re");
                panel1.add(label4, "cell 1 5");
                panel1.add(filliereCB, "cell 2 5");

                //---- label5 ----
                label5.setText("President");
                panel1.add(label5, "cell 1 7,aligny top,growy 0");

                //======== ensScroll ========
                {

                    //---- ensTable ----
                    ensTable.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, "", null, null, null},
                            {null, null, null, null, null, null, null, null},
                        },
                        new String[] {
                            "cin", "Prenom", "Nom", "grad", "theme", "peutEtrePresident", "Modifier", "Supprimer"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false, false, false, false
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
                        TableColumnModel cm = ensTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    ensTable.setGridColor(Color.black);
                    ensTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    ensTable.setBorder(null);
                    ensTable.setFillsViewportHeight(true);
                    ensTable.setRowHeight(40);
                    ensTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll.setViewportView(ensTable);
                }
                panel1.add(ensScroll, "cell 2 7 3 1");

                //---- button1 ----
                button1.setText("Ajouter");
                panel1.add(button1, "cell 1 9");
            }
            contentPane.add(panel1, BorderLayout.CENTER);
            pack();
            setLocationRelativeTo(getOwner());
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JPanel panel1;
        private JLabel label2;
        private JTextField idField;
        private JLabel label3;
        private JComboBox localCB;
        private JLabel label4;
        private JComboBox filliereCB;
        private JLabel label5;
        private JScrollPane ensScroll;
        private JTable ensTable;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class AjouterLocal extends JPanel {
        public AjouterLocal() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            idField = new JTextField();
            label3 = new JLabel();
            nomField = new JTextField();
            label4 = new JLabel();
            numField = new JTextField();
            button1 = new JButton();
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            this.setBackground(Color.WHITE);
            //======== this ========
            setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[111,fill]" +
                "[140,fill]" +
                "[114,fill]",
                // rows
                "[32]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[32]"));

            //---- label1 ----
            label1.setText("Ajouter Local");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            add(label1, "cell 0 0 2 1");

            //---- label2 ----
            label2.setText("Id");
            add(label2, "cell 0 1");
            add(idField, "cell 1 1 2 1,growy");

            //---- label3 ----
            label3.setText("Nom de la salle");
            add(label3, "cell 0 2");
            add(nomField, "cell 1 2 2 1,growy");

            //---- label4 ----
            label4.setText("Num de la salle");
            add(label4, "cell 0 3");
            add(numField, "cell 1 3 2 1,growy");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 2 4");
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JLabel label2;
        private JTextField idField;
        private JLabel label3;
        private JTextField nomField;
        private JLabel label4;
        private JTextField numField;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class AjouterSp extends JPanel {
        public AjouterSp() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            textField1 = new JTextField();
            label3 = new JLabel();
            textField2 = new JTextField();
            button1 = new JButton();
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            this.setBackground(Color.WHITE);

            //======== this ========
            setLayout(new MigLayout(
                "insets 50 50 0 0,hidemode 3,aligny top",
                // columns
                "[94,fill]" +
                "[227,fill]" +
                "[173,fill]",
                // rows
                "[64]5" +
                "[32]" +
                "[32]" +
                "[]" +
                "[32]"));

            //---- label1 ----
            label1.setText("Ajouter Sp\u00e9cialit\u00e9");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            add(label1, "cell 0 0 3 1");

            //---- label2 ----
            label2.setText("Id");
            add(label2, "cell 0 1");
            add(textField1, "cell 1 1 2 1,growy, width 50px");

            //---- label3 ----
            label3.setText("Nom Filli\u00e8re");
            add(label3, "cell 0 2");
            add(textField2, "cell 1 2 2 1,growy, width 200px");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 0 4");
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JLabel label2;
        private JTextField textField1;
        private JLabel label3;
        private JTextField textField2;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    
}
