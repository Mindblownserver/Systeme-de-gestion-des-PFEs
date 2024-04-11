package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
            add(textField1, "cell 0 3,growy");

            //---- label3 ----
            label3.setText("Libelle");
            add(label3, "cell 0 4");
            add(textField2, "cell 0 5 2 1,growy, width 200px");

            //---- label4 ----
            label4.setText("Specialite");
            add(label4, "cell 0 6");
            add(comboBox1, "cell 0 7 2 1,growy, width 200px");

            //---- button3 ----
            button3.setText("text");
            add(button3, "cell 0 9 2 1,growy");

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
                "insets 50 50 0 0, hidemode 3",
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
            add(textField2, "cell 1 2 2 1,growy,width 200px");

            //---- label4 ----
            label4.setText("Domaine d'activit\u00e9");
            add(label4, "cell 0 3");
            add(textField3, "cell 1 3 2 1,growy,width 200px");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 0 4,growy");
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
                "insets 50 50 0 0, hidemode 3",
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
            add(textField2, "cell 1 2 2 1,growy,width 200px");

            //---- label4 ----
            label4.setText("Prenom");
            add(label4, "cell 0 3");
            add(textField3, "cell 1 3 2 1,growy,width 200px");

            //---- label5 ----
            label5.setText("Tel");
            add(label5, "cell 0 4");
            add(textField4, "cell 1 4 2 1,growy,width 200px");

            //---- label6 ----
            label6.setText("Email");
            add(label6, "cell 0 5");
            add(textField5, "cell 1 5 2 1,growy,width 200px");

            //---- label7 ----
            label7.setText("poste");
            add(label7, "cell 0 6");
            add(textField6, "cell 1 6 2 1,growy,width 200px");

            //---- label8 ----
            label8.setText("Organisme");
            add(label8, "cell 0 7");
            add(comboBox1, "cell 1 7 2 1,growy,width 200px");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 0 8,growy,width 200px");
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
                "insets 50 50 0 0, hidemode 3",
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
            add(nomField, "cell 1 2 2 1,growy,width 200px");

            //---- label4 ----
            label4.setText("Num de la salle");
            add(label4, "cell 0 3");
            add(numField, "cell 1 3 2 1,growy,width 200px");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 0 4,growy,width 200px");
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
            add(button1, "cell 0 4,growy");
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
    public static class AjouterPFEDialog extends JDialog {
        public AjouterPFEDialog(Window owner) {
            super(owner);
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label4 = new JLabel();
            idPfeField = new JTextField();
            label5 = new JLabel();
            AnneeField = new JTextField();
            label6 = new JLabel();
            NatureCB = new JComboBox<>();
            label12 = new JLabel();
            traiteCB = new JComboBox<>();
            label7 = new JLabel();
            orgCB = new JComboBox();
            label10 = new JLabel();
            filliereCB = new JComboBox();
            label9 = new JLabel();
            dateFinField = new JFormattedTextField();
            label8 = new JLabel();
            dateDebField = new JFormattedTextField();
            label32 = new JLabel();
            formattedTextField1 = new JFormattedTextField();
            label35 = new JLabel();
            formattedTextField2 = new JFormattedTextField();
            label18 = new JLabel();
            sujetField = new JTextField();
            label17 = new JLabel();
            themeField = new JTextField();
            label19 = new JLabel();
            descScroll = new JScrollPane();
            descArea = new JTextArea();
            label11 = new JLabel();
            LoVFormEncIsimm = new JPanel();
            panel2 = new JPanel();
            textField4 = new JTextField();
            label20 = new JLabel();
            textField5 = new JTextField();
            label21 = new JLabel();
            button2 = new JButton();
            panel3 = new JPanel();
            textField6 = new JTextField();
            scrollPane1 = new JScrollPane();
            list1 = new JList();
            LoVForm2RappIsimm = new JPanel();
            panel4 = new JPanel();
            textField7 = new JTextField();
            label23 = new JLabel();
            textField8 = new JTextField();
            label24 = new JLabel();
            button3 = new JButton();
            panel5 = new JPanel();
            textField9 = new JTextField();
            scrollPane2 = new JScrollPane();
            list2 = new JList();
            label22 = new JLabel();
            label25 = new JLabel();
            LoVForm3Etu1 = new JPanel();
            panel6 = new JPanel();
            textField10 = new JTextField();
            label26 = new JLabel();
            textField11 = new JTextField();
            label27 = new JLabel();
            button4 = new JButton();
            panel7 = new JPanel();
            textField12 = new JTextField();
            scrollPane3 = new JScrollPane();
            list3 = new JList();
            label28 = new JLabel();
            LoVForm4Etu2 = new JPanel();
            panel8 = new JPanel();
            textField13 = new JTextField();
            label29 = new JLabel();
            textField14 = new JTextField();
            label30 = new JLabel();
            button5 = new JButton();
            panel9 = new JPanel();
            textField15 = new JTextField();
            scrollPane4 = new JScrollPane();
            list4 = new JList();
            label31 = new JLabel();
            LoVForm5EncExt = new JPanel();
            panel10 = new JPanel();
            textField16 = new JTextField();
            label33 = new JLabel();
            textField17 = new JTextField();
            label34 = new JLabel();
            button6 = new JButton();
            panel11 = new JPanel();
            textField18 = new JTextField();
            scrollPane5 = new JScrollPane();
            list5 = new JList();
            approuveChB = new JCheckBox();
            stageChB = new JCheckBox();
            valideChB = new JCheckBox();
            button1 = new JButton();

            //======== this ========
            setTitle("Ajouter PFE");
            Container contentPane = getContentPane();
            contentPane.setLayout(new MigLayout(
                "insets 20 20 0 0,hidemode 3",
                // columns
                "[fill]" +
                "[127,fill]" +
                "[134,shrink 0,fill]50" +
                "[72,shrink 0,fill]" +
                "[118,shrink 0,fill]" +
                "[59,fill]" +
                "[73,shrink 0,fill]" +
                "[282,shrink 0,fill]" +
                "[10,fill]",
                // rows
                "[41]" +
                "[32,fill]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[49,grow,shrink 0]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[110,grow,fill]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label4 ----
            label4.setText("Id PFE");
            contentPane.add(label4, "cell 1 1");
            contentPane.add(idPfeField, "cell 2 1,growy");

            //---- label5 ----
            label5.setText("Ann\u00e9e");
            contentPane.add(label5, "cell 3 1");
            contentPane.add(AnneeField, "cell 4 1,growy");

            //---- label6 ----
            label6.setText("Nature");
            contentPane.add(label6, "cell 5 1");

            //---- NatureCB ----
            NatureCB.setModel(new DefaultComboBoxModel<>(new String[] {
                "Interne",
                "Externe"
            }));
            contentPane.add(NatureCB, "cell 6 1,growy");

            //---- label12 ----
            label12.setText("Trait\u00e9 en");
            contentPane.add(label12, "cell 1 2");

            //---- traiteCB ----
            traiteCB.setModel(new DefaultComboBoxModel<>(new String[] {
                "Mon\u00f4me",
                "Bin\u00f4me"
            }));
            contentPane.add(traiteCB, "cell 2 2,growy");

            //---- label7 ----
            label7.setText("Filli\u00e8re");
            contentPane.add(label7, "cell 3 2");

            //---- orgCB ----
            orgCB.setEditable(true);
            contentPane.add(orgCB, "cell 4 2,growy");

            //---- label10 ----
            label10.setText("Societ\u00e9");
            contentPane.add(label10, "cell 5 2");
            contentPane.add(filliereCB, "cell 6 2,growy");

            //---- label9 ----
            label9.setText("Date debut du stage");
            contentPane.add(label9, "cell 1 3");
            contentPane.add(dateFinField, "cell 2 3,growy");

            //---- label8 ----
            label8.setText("Date fin du stage");
            contentPane.add(label8, "cell 3 3");
            contentPane.add(dateDebField, "cell 4 3,growy");

            //---- label32 ----
            label32.setText("Date Rendu 1");
            contentPane.add(label32, "cell 1 4");
            contentPane.add(formattedTextField1, "cell 2 4,growy");

            //---- label35 ----
            label35.setText("Date Rendu 2");
            contentPane.add(label35, "cell 3 4");
            contentPane.add(formattedTextField2, "cell 4 4,growy");
            
            //---- label17 ----
            label17.setText("Th\u00e8me");
            contentPane.add(label17, "cell 1 5");
            contentPane.add(themeField, "cell 2 5 3 1,growy,width 490px");
            
            label18.setText("Sujet");
            contentPane.add(label18, "cell 1 6");
            contentPane.add(sujetField, "cell 2 6 3 1,growy, width 490px");

            //---- label19 ----
            label19.setText("Description");
            contentPane.add(label19, "cell 1 7,aligny top,growy ");

            //======== descScroll ========
            {
                descScroll.setViewportView(descArea);
            }
            contentPane.add(descScroll, "cell 2 7 3 1,growy,width 490px");

            //---- label11 ----
            label11.setText("Encadreur ISIMM");
            contentPane.add(label11, "cell 1 8,aligny top,growy 0");

            //======== LoVFormEncIsimm ========
            {
                LoVFormEncIsimm.setLayout(new BorderLayout(0, 10));

                //======== panel2 ========
                {
                    panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
                    ((FlowLayout)panel2.getLayout()).setAlignOnBaseline(true);

                    //---- textField4 ----
                    textField4.setPreferredSize(new Dimension(75, 24));
                    textField4.setText("cin");
                    textField4.setEditable(false);
                    panel2.add(textField4);

                    //---- label20 ----
                    label20.setPreferredSize(new Dimension(5, 0));
                    panel2.add(label20);

                    //---- textField5 ----
                    textField5.setPreferredSize(new Dimension(220, 24));
                    textField5.setText("Nom et Prenom");
                    textField5.setEditable(false);
                    panel2.add(textField5);

                    //---- label21 ----
                    label21.setPreferredSize(new Dimension(5, 0));
                    panel2.add(label21);

                    //---- button2 ----
                    button2.setText("Choisir");
                    panel2.add(button2);
                }
                LoVFormEncIsimm.add(panel2, BorderLayout.NORTH);

                //======== panel3 ========
                {
                    panel3.setLayout(new BorderLayout(0, 10));
                    panel3.add(textField6, BorderLayout.NORTH);

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(list1);
                    }
                    panel3.add(scrollPane1, BorderLayout.CENTER);
                }
                LoVFormEncIsimm.add(panel3, BorderLayout.CENTER);
            }
            contentPane.add(LoVFormEncIsimm, "cell 2 8 3 1");

            //======== LoVForm2RappIsimm ========
            {
                LoVForm2RappIsimm.setLayout(new BorderLayout(0, 10));

                //======== panel4 ========
                {
                    panel4.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                    //---- textField7 ----
                    textField7.setPreferredSize(new Dimension(75, 24));
                    textField7.setText("cin");
                    textField7.setEditable(false);
                    panel4.add(textField7);

                    //---- label23 ----
                    label23.setPreferredSize(new Dimension(5, 0));
                    panel4.add(label23);

                    //---- textField8 ----
                    textField8.setPreferredSize(new Dimension(220, 24));
                    textField8.setText("Nom et Prenom");
                    textField8.setEditable(false);
                    panel4.add(textField8);

                    //---- label24 ----
                    label24.setPreferredSize(new Dimension(5, 0));
                    panel4.add(label24);

                    //---- button3 ----
                    button3.setText("Choisir");
                    panel4.add(button3);
                }
                LoVForm2RappIsimm.add(panel4, BorderLayout.NORTH);

                //======== panel5 ========
                {
                    panel5.setLayout(new BorderLayout(0, 10));
                    panel5.add(textField9, BorderLayout.NORTH);

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(list2);
                    }
                    panel5.add(scrollPane2, BorderLayout.CENTER);
                }
                LoVForm2RappIsimm.add(panel5, BorderLayout.CENTER);
            }
            contentPane.add(LoVForm2RappIsimm, "cell 6 8 2 1");

            //---- label22 ----
            label22.setText("Rapporteur");
            contentPane.add(label22, "cell 5 8,aligny top,growy ");

            //---- label25 ----
            label25.setText("Etudiant (1)");
            contentPane.add(label25, "cell 1 9,aligny top,growy 0");

            //======== LoVForm3Etu1 ========
            {
                LoVForm3Etu1.setLayout(new BorderLayout(0, 10));

                //======== panel6 ========
                {
                    panel6.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                    //---- textField10 ----
                    textField10.setPreferredSize(new Dimension(75, 24));
                    textField10.setText("cin");
                    textField10.setEditable(false);
                    panel6.add(textField10);

                    //---- label26 ----
                    label26.setPreferredSize(new Dimension(5, 0));
                    panel6.add(label26);

                    //---- textField11 ----
                    textField11.setPreferredSize(new Dimension(220, 24));
                    textField11.setText("Nom et Prenom");
                    textField11.setEditable(false);
                    panel6.add(textField11);

                    //---- label27 ----
                    label27.setPreferredSize(new Dimension(5, 0));
                    panel6.add(label27);

                    //---- button4 ----
                    button4.setText("Choisir");
                    panel6.add(button4);
                }
                LoVForm3Etu1.add(panel6, BorderLayout.NORTH);

                //======== panel7 ========
                {
                    panel7.setLayout(new BorderLayout(0, 10));
                    panel7.add(textField12, BorderLayout.NORTH);

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setViewportView(list3);
                    }
                    panel7.add(scrollPane3, BorderLayout.CENTER);
                }
                LoVForm3Etu1.add(panel7, BorderLayout.CENTER);
            }
            contentPane.add(LoVForm3Etu1, "cell 2 9 3 1");

            //---- label28 ----
            label28.setText("Etudiant 2");
            contentPane.add(label28, "cell 5 9,aligny top,growy 0");

            //======== LoVForm4Etu2 ========
            {
                LoVForm4Etu2.setLayout(new BorderLayout(0, 10));

                //======== panel8 ========
                {
                    panel8.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                    //---- textField13 ----
                    textField13.setPreferredSize(new Dimension(75, 24));
                    textField13.setText("cin");
                    textField13.setEditable(false);
                    panel8.add(textField13);

                    //---- label29 ----
                    label29.setPreferredSize(new Dimension(5, 0));
                    panel8.add(label29);

                    //---- textField14 ----
                    textField14.setPreferredSize(new Dimension(220, 24));
                    textField14.setText("Nom et Prenom");
                    textField14.setEditable(false);
                    panel8.add(textField14);

                    //---- label30 ----
                    label30.setPreferredSize(new Dimension(5, 0));
                    panel8.add(label30);

                    //---- button5 ----
                    button5.setText("Choisir");
                    panel8.add(button5);
                }
                LoVForm4Etu2.add(panel8, BorderLayout.NORTH);

                //======== panel9 ========
                {
                    panel9.setLayout(new BorderLayout(0, 10));
                    panel9.add(textField15, BorderLayout.NORTH);

                    //======== scrollPane4 ========
                    {
                        scrollPane4.setViewportView(list4);
                    }
                    panel9.add(scrollPane4, BorderLayout.CENTER);
                }
                LoVForm4Etu2.add(panel9, BorderLayout.CENTER);
            }
            contentPane.add(LoVForm4Etu2, "cell 6 9 2 1");

            //---- label31 ----
            label31.setText("Encadreur Ext");
            contentPane.add(label31, "cell 1 10,aligny top,growy 0");

            //======== LoVForm5EncExt ========
            {
                LoVForm5EncExt.setLayout(new BorderLayout(0, 10));

                //======== panel10 ========
                {
                    panel10.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                    //---- textField16 ----
                    textField16.setPreferredSize(new Dimension(75, 24));
                    textField16.setText("id enc ext");
                    textField16.setEditable(false);
                    panel10.add(textField16);

                    //---- label33 ----
                    label33.setPreferredSize(new Dimension(5, 0));
                    panel10.add(label33);

                    //---- textField17 ----
                    textField17.setPreferredSize(new Dimension(220, 24));
                    textField17.setText("nom prenom ");
                    textField17.setEditable(false);
                    panel10.add(textField17);

                    //---- label34 ----
                    label34.setPreferredSize(new Dimension(5, 0));
                    panel10.add(label34);

                    //---- button6 ----
                    button6.setText("Choisir");
                    panel10.add(button6);
                }
                LoVForm5EncExt.add(panel10, BorderLayout.NORTH);

                //======== panel11 ========
                {
                    panel11.setLayout(new BorderLayout(0, 10));
                    panel11.add(textField18, BorderLayout.NORTH);

                    //======== scrollPane5 ========
                    {
                        scrollPane5.setViewportView(list5);
                    }
                    panel11.add(scrollPane5, BorderLayout.CENTER);
                }
                LoVForm5EncExt.add(panel11, BorderLayout.CENTER);
            }
            contentPane.add(LoVForm5EncExt, "cell 2 10 3 1");

            //---- approuveChB ----
            approuveChB.setText("Est approuv\u00e9 par la comit\u00e9");
            contentPane.add(approuveChB, "cell 1 11 2 1");

            //---- stageChB ----
            stageChB.setText("A fait un Stage");
            contentPane.add(stageChB, "cell 1 12 2 1");

            //---- valideChB ----
            valideChB.setText("Est valid\u00e9 par le rapporteur");
            contentPane.add(valideChB, "cell 1 13 2 1");

            //---- button1 ----
            button1.setText("Ajouter");
            contentPane.add(button1, "cell 1 14");
            pack();
            setLocationRelativeTo(getOwner());
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        private JLabel label4;
        private JTextField idPfeField;
        private JLabel label5;
        private JTextField AnneeField;
        private JLabel label6;
        private JComboBox<String> NatureCB;
        private JLabel label12;
        private JComboBox<String> traiteCB;
        private JLabel label7;
        private JComboBox orgCB;
        private JLabel label10;
        private JComboBox filliereCB;
        private JLabel label9;
        private JFormattedTextField dateFinField;
        private JLabel label8;
        private JFormattedTextField dateDebField;
        private JLabel label32;
        private JFormattedTextField formattedTextField1;
        private JLabel label35;
        private JFormattedTextField formattedTextField2;
        private JLabel label18;
        private JTextField sujetField;
        private JLabel label17;
        private JTextField themeField;
        private JLabel label19;
        private JScrollPane descScroll;
        private JTextArea descArea;
        private JLabel label11;
        private JPanel LoVFormEncIsimm;
        private JPanel panel2;
        private JTextField textField4;
        private JLabel label20;
        private JTextField textField5;
        private JLabel label21;
        private JButton button2;
        private JPanel panel3;
        private JTextField textField6;
        private JScrollPane scrollPane1;
        private JList list1;
        private JPanel LoVForm2RappIsimm;
        private JPanel panel4;
        private JTextField textField7;
        private JLabel label23;
        private JTextField textField8;
        private JLabel label24;
        private JButton button3;
        private JPanel panel5;
        private JTextField textField9;
        private JScrollPane scrollPane2;
        private JList list2;
        private JLabel label22;
        private JLabel label25;
        private JPanel LoVForm3Etu1;
        private JPanel panel6;
        private JTextField textField10;
        private JLabel label26;
        private JTextField textField11;
        private JLabel label27;
        private JButton button4;
        private JPanel panel7;
        private JTextField textField12;
        private JScrollPane scrollPane3;
        private JList list3;
        private JLabel label28;
        private JPanel LoVForm4Etu2;
        private JPanel panel8;
        private JTextField textField13;
        private JLabel label29;
        private JTextField textField14;
        private JLabel label30;
        private JButton button5;
        private JPanel panel9;
        private JTextField textField15;
        private JScrollPane scrollPane4;
        private JList list4;
        private JLabel label31;
        private JPanel LoVForm5EncExt;
        private JPanel panel10;
        private JTextField textField16;
        private JLabel label33;
        private JTextField textField17;
        private JLabel label34;
        private JButton button6;
        private JPanel panel11;
        private JTextField textField18;
        private JScrollPane scrollPane5;
        private JList list5;
        private JCheckBox approuveChB;
        private JCheckBox stageChB;
        private JCheckBox valideChB;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class AjouterSoutenance extends JDialog {
        public AjouterSoutenance(Window owner) {
            super(owner);
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            idSField = new JTextField();
            label3 = new JLabel();
            dateSField = new JFormattedTextField();
            label5 = new JLabel();
            heureSField = new JTextField();
            label4 = new JLabel();
            LoVExam = new JPanel();
            choisirPanel = new JPanel();
            cinField = new JTextField();
            label26 = new JLabel();
            nomField = new JTextField();
            label27 = new JLabel();
            choisirBtn = new JButton();
            panel7 = new JPanel();
            searchField = new JTextField();
            listScroll = new JScrollPane();
            list = new JList();
            label6 = new JLabel();
            textField1 = new JTextField();
            estValidChB = new JCheckBox();
            ajBtn = new JButton();

            //======== this ========
            Container contentPane = getContentPane();
            contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[97,fill]" +
                "[147,fill]" +
                "[76,fill]" +
                "[73,grow,fill]",
                // rows
                "[]" +
                "[32]" +
                "[32]" +
                "[32]" +
                "[248,grow,top]" +
                "[32,shrink 0,top]" +
                "[32]" +
                "[]" +
                "[32]" +
                "[]"));

            //---- label1 ----
            label1.setText("Ajouter Soutenance");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            contentPane.add(label1, "cell 0 0 4 1");

            //---- label2 ----
            label2.setText("Id Soutenance");
            contentPane.add(label2, "cell 0 1");
            contentPane.add(idSField, "cell 1 1,growy");

            //---- label3 ----
            label3.setText("Date");
            contentPane.add(label3, "cell 0 2");
            contentPane.add(dateSField, "cell 1 2,growy");

            //---- label5 ----
            label5.setText("Heure");
            contentPane.add(label5, "cell 0 3");
            contentPane.add(heureSField, "cell 1 3,growy");

            //---- label4 ----
            label4.setText("Examinateur");
            contentPane.add(label4, "cell 0 4,aligny top,growy 0");

            //======== LoVExam ========
            {
                LoVExam.setLayout(new BorderLayout(0, 10));

                //======== choisirPanel ========
                {
                    choisirPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                    //---- cinField ----
                    cinField.setPreferredSize(new Dimension(75, 24));
                    cinField.setText("cin");
                    cinField.setEditable(false);
                    choisirPanel.add(cinField);

                    //---- label26 ----
                    label26.setPreferredSize(new Dimension(5, 0));
                    choisirPanel.add(label26);

                    //---- nomField ----
                    nomField.setPreferredSize(new Dimension(220, 24));
                    nomField.setText("Nom et Prenom");
                    nomField.setEditable(false);
                    choisirPanel.add(nomField);

                    //---- label27 ----
                    label27.setPreferredSize(new Dimension(5, 0));
                    choisirPanel.add(label27);

                    //---- choisirBtn ----
                    choisirBtn.setText("Choisir");
                    choisirPanel.add(choisirBtn);
                }
                LoVExam.add(choisirPanel, BorderLayout.NORTH);

                //======== panel7 ========
                {
                    panel7.setLayout(new BorderLayout(0, 10));
                    panel7.add(searchField, BorderLayout.NORTH);

                    //======== listScroll ========
                    {
                        listScroll.setViewportView(list);
                    }
                    panel7.add(listScroll, BorderLayout.CENTER);
                }
                LoVExam.add(panel7, BorderLayout.CENTER);
            }
            contentPane.add(LoVExam, "cell 1 4 2 1");

            //---- label6 ----
            label6.setText("Jury");
            contentPane.add(label6, "cell 0 5,aligny top,growy 0");

            //---- textField1 ----
            textField1.setText("courant");
            textField1.setEditable(false);
            contentPane.add(textField1, "cell 1 5,aligny top,growy 0");

            //---- estValidChB ----
            estValidChB.setText("Est Valide");
            contentPane.add(estValidChB, "cell 0 6");

            //---- ajBtn ----
            ajBtn.setText("Ajouter");
            contentPane.add(ajBtn, "cell 0 8,growy");
            pack();
            setLocationRelativeTo(getOwner());
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JLabel label2;
        private JTextField idSField;
        private JLabel label3;
        private JFormattedTextField dateSField;
        private JLabel label5;
        private JTextField heureSField;
        private JLabel label4;
        private JPanel LoVExam;
        private JPanel choisirPanel;
        private JTextField cinField;
        private JLabel label26;
        private JTextField nomField;
        private JLabel label27;
        private JButton choisirBtn;
        private JPanel panel7;
        private JTextField searchField;
        private JScrollPane listScroll;
        private JList list;
        private JLabel label6;
        private JTextField textField1;
        private JCheckBox estValidChB;
        private JButton ajBtn;
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
            content = new JPanel();
            label2 = new JLabel();
            idField = new JTextField();
            label3 = new JLabel();
            localCB = new JComboBox();
            label4 = new JLabel();
            filliereCB = new JComboBox();
            label5 = new JLabel();
            this2 = new JPanel();
            panel6 = new JPanel();
            textField10 = new JTextField();
            label26 = new JLabel();
            textField11 = new JTextField();
            label27 = new JLabel();
            button4 = new JButton();
            panel7 = new JPanel();
            textField12 = new JTextField();
            scrollPane3 = new JScrollPane();
            list3 = new JList();
            button1 = new JButton();

            //======== this ========
            Container contentPane = getContentPane();
            contentPane.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("  Ajouter Jury");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            contentPane.add(label1, BorderLayout.NORTH);

            //======== content ========
            {
                content.setLayout(new MigLayout(
                    "insets 20 20 0 0,hidemode 3,gap 0 0",
                    // columns
                    "rel[11,fill]" +
                    "[57,fill]" +
                    "[141,fill]" +
                    "[0,fill]" +
                    "[171,fill]" +
                    "[44,fill]",
                    // rows
                    "[]" +
                    "[32,center]rel" +
                    "[32,center]rel" +
                    "[32,fill]rel" +
                    "[248,grow]rel" +
                    "[32]rel"));

                //---- label2 ----
                label2.setText("Id jury");
                content.add(label2, "cell 1 1");
                content.add(idField, "cell 2 1,growy");

                //---- label3 ----
                label3.setText("Local");
                content.add(label3, "cell 1 2");
                content.add(localCB, "cell 2 2,growy");

                //---- label4 ----
                label4.setText("Filli\u00e8re");
                content.add(label4, "cell 1 3");
                content.add(filliereCB, "cell 2 3,growy");

                //---- label5 ----
                label5.setText("President");
                content.add(label5, "cell 1 4,aligny top,growy 0");

                //======== this2 ========
                {
                    this2.setLayout(new BorderLayout(0, 10));

                    //======== panel6 ========
                    {
                        panel6.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                        //---- textField10 ----
                        textField10.setPreferredSize(new Dimension(75, 24));
                        textField10.setText("cin");
                        textField10.setEditable(false);
                        panel6.add(textField10);

                        //---- label26 ----
                        label26.setPreferredSize(new Dimension(5, 0));
                        panel6.add(label26);

                        //---- textField11 ----
                        textField11.setPreferredSize(new Dimension(220, 24));
                        textField11.setText("Nom et Prenom");
                        textField11.setEditable(false);
                        panel6.add(textField11);

                        //---- label27 ----
                        label27.setPreferredSize(new Dimension(5, 0));
                        panel6.add(label27);

                        //---- button4 ----
                        button4.setText("Choisir");
                        panel6.add(button4);
                    }
                    this2.add(panel6, BorderLayout.NORTH);

                    //======== panel7 ========
                    {
                        panel7.setLayout(new BorderLayout(0, 10));
                        panel7.add(textField12, BorderLayout.NORTH);

                        //======== scrollPane3 ========
                        {

                            //---- list3 ----
                            list3.setPreferredSize(new Dimension(52, 100));
                            list3.setMinimumSize(new Dimension(52, 100));
                            list3.setMaximumSize(new Dimension(52, 100));
                            scrollPane3.setViewportView(list3);
                        }
                        panel7.add(scrollPane3, BorderLayout.CENTER);
                    }
                    this2.add(panel7, BorderLayout.CENTER);
                }
                content.add(this2, "cell 2 4 3 1,growy");

                //---- button1 ----
                button1.setText("Ajouter");
                content.add(button1, "cell 1 5,growy");
            }
            contentPane.add(content, BorderLayout.CENTER);
            pack();
            setLocationRelativeTo(getOwner());
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JPanel content;
        private JLabel label2;
        private JTextField idField;
        private JLabel label3;
        private JComboBox localCB;
        private JLabel label4;
        private JComboBox filliereCB;
        private JLabel label5;
        private JPanel this2;
        private JPanel panel6;
        private JTextField textField10;
        private JLabel label26;
        private JTextField textField11;
        private JLabel label27;
        private JButton button4;
        private JPanel panel7;
        private JTextField textField12;
        private JScrollPane scrollPane3;
        private JList list3;
        private JButton button1;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
}
