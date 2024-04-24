package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.*;
import net.miginfocom.swing.MigLayout;
import repo.MyDataBaseConnector;

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
        public AjouterGroupe(String[] comboBoxValues) {
            initComponents(comboBoxValues);
        }

        private void initComponents(String[] comboBoxValues) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            label2 = new JLabel();
            textField1 = new JTextField();
            label3 = new JLabel();
            textField2 = new JTextField();
            label4 = new JLabel();
            comboBox1 = new JComboBox(comboBoxValues);
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
            JLabel label5 = new JLabel();
            JTextField textField4 = new JTextField();
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
            
            label5.setText("Adresse");
            add(label5, "cell 0 4");
            add(textField4, "cell 1 4 2 1,growy,width 200px");

            //---- button1 ----
            button1.setText("Ajouter");
            add(button1, "cell 0 4,growy");
            button1.addActionListener((l)->{
                ExecutorService executorJ = Executors.newSingleThreadExecutor();
                Callable<Boolean> populateThread = () -> {
                    try{
                        MyDataBaseConnector dbc = new MyDataBaseConnector();
                        dbc.query(String.format("insert into OrganismeExt(idSc, nomSc, domaineActivite, adresse) values('%s','%s','%s','%s')", 
                                textField1.getText(), textField2.getText(),textField3.getText(),textField4.getText()));
                    }catch(SQLException sqlE){
                        return false;
                    }
                    return true;
                };
                Future<Boolean> futureOrg = executorJ.submit(populateThread);
                try{
                    if(futureOrg.get()){
                    // dialogue ok
                    }

                    else{
                        // dialogue error
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                    
            });
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
        public AjouterEncadreurExt(String[] comboBoxValues) {
            initComponents(comboBoxValues);
        }

        private void initComponents(String[] comboBoxValues) {
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
            comboBox1 = new JComboBox(comboBoxValues);
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
            button1.addActionListener(l->{
                ExecutorService executorL = Executors.newSingleThreadExecutor();
                Callable<Boolean> populateThread = () -> {
                    try{
                        MyDataBaseConnector dbc = new MyDataBaseConnector();
                        dbc.query(String.format("insert into Loc (nomSalle, numSalle)  values('%s',%d)", 
                                 nomField.getText(),Integer.parseInt(numField.getText())));
                    }catch(SQLException sqlE){
                        return false;
                    }
                    return true;
                };
                Future<Boolean> futureLoc = executorL.submit(populateThread);
                try{
                    if(futureLoc.get()){
                    // dialogue ok
                    }

                    else{
                        // dialogue error
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            });
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
            
            button1.addActionListener(l->{
                ExecutorService executorL = Executors.newSingleThreadExecutor();
                Callable<Boolean> populateThread = () -> {
                    try{
                        MyDataBaseConnector dbc = new MyDataBaseConnector();
                        dbc.query(String.format("insert into Specialite (idFill, filliere) values('%s','%s')", 
                                 textField1.getText(),textField2.getText()));
                    }catch(SQLException sqlE){
                        return false;
                    }
                    return true;
                };
                Future<Boolean> futureSp = executorL.submit(populateThread);
                try{
                    if(futureSp.get()){
                    // dialogue ok
                    }

                    else{
                        // dialogue error
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            });
            
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
        public AjouterPFEDialog(Window owner, List<Enseignant> ensListe, List<EncadreurExt> encExtList, List<Etudiant> etuList, List<Groupe> grList) {
            super(owner);
            initComponents(ensListe, encExtList, etuList, grList);
        }

        private void initComponents(List<Enseignant> ensListe, List<EncadreurExt> encExtList, List<Etudiant> etuList,List<Groupe> grList) {
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
            filliereCB = new JComboBox<>();
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


            //---- label12 ----
            label12.setText("Traité en/Nature");
            contentPane.add(label12, "cell 1 2");

            //---- traiteCB ----
            traiteCB.setModel(new DefaultComboBoxModel<>(new String[] {
                "Monôme/Interne",
                "Binôme/Interne",
                "Monôme/Externe",
                "Binôme/Externe",
            }));
            contentPane.add(traiteCB, "cell 2 2,growy");


            //---- label10 ----
            
            {//---- Filliere CB -----
                String[] res = new String[grList.size()];
                for(int i = 0; i<grList.size();i++)
                    filliereCB.addItem(grList.get(i).getIdGr()+"_"+grList.get(i).getSpecialite().getIdFill());
                
            }
            //---- label7 ----
            label7.setText("Filli\u00e8re");
            contentPane.add(label7, "cell 3 2");
            contentPane.add(filliereCB, "cell 4 2,growy");

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
            
            LoVForm encIsimmForm = new LoVForm(ensListe);
            contentPane.add(encIsimmForm, "cell 2 8 3 1,aligny top");

            //======== LoVForm2RappIsimm ========
            
            LoVForm rappIsimmForm = new LoVForm(ensListe);
            contentPane.add(rappIsimmForm, "cell 6 8 2 1,aligny top");

            //---- label22 ----
            label22.setText("Rapporteur");
            contentPane.add(label22, "cell 5 8,aligny top,growy 0");

            //---- label25 ----
            label25.setText("Etudiant (1)");
            contentPane.add(label25, "cell 1 9,aligny top,growy 0");

            //======== LoVForm3Etu1 ========
            etuList.removeIf(p->p.isHasBinome());
            LoVForm etu1Form = new LoVForm(etuList);
            contentPane.add(etu1Form, "cell 2 9 3 1,aligny top");

            //---- label28 ----
            label28.setVisible(false);
            label28.setText("Etudiant 2");
            
            contentPane.add(label28, "cell 5 9,aligny top,growy 0");

            //======== LoVForm4Etu2 ========
            
            LoVForm etu2Form = new LoVForm(etuList);
            etu2Form.setVisible(false);
            contentPane.add(etu2Form, "cell 6 9 2 1,aligny top");

            //---- label31 ----
            label31.setText("Encadreur Ext");
            contentPane.add(label31, "cell 1 10,aligny top,growy 0");
            label31.setVisible(false);
            //======== LoVForm5EncExt ========
            
            LoVForm encExtForm = new LoVForm(encExtList);
            encExtForm.setVisible(false);
            contentPane.add(encExtForm, "cell 2 10 3 1,aligny top");

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
            traiteCB.addActionListener(l->{
                String choix = traiteCB.getSelectedItem().toString();
                switch (choix) {
                    case "Monôme/Interne":
                        etu2Form.setVisible(false);
                        label28.setVisible(false);
                        label31.setVisible(false);
                        encExtForm.setVisible(false);
                        break;
                    case "Binôme/Interne":
                        etu2Form.setVisible(true);
                        label28.setVisible(true);
                        label31.setVisible(false);
                        encExtForm.setVisible(false);
                        break;
                    case "Monôme/Externe":
                        etu2Form.setVisible(false);
                        label28.setVisible(false);
                        label31.setVisible(true);
                        encExtForm.setVisible(true);
                        break;
                    case "Binôme/Externe":
                        etu2Form.setVisible(true);
                        etu2Form.setVisible(true);
                        label31.setVisible(true);
                        encExtForm.setVisible(true);
                        break;
                }
                
            });
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
        public AjouterJuryDialogue(Window owner, List<Enseignant> ensList) {
            super(owner);
            initComponents(ensList);
        }

        private void initComponents(List<Enseignant> ensList) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
                    
            label1 = new JLabel();
            content = new JPanel();
            label2 = new JLabel();
            idField = new JTextField();
            label3 = new JLabel();
            localCB = new JComboBox(Local.ids.toArray());
            label4 = new JLabel();
            filliereCB = new JComboBox(Groupe.ids.toArray());
            label5 = new JLabel();
            button1 = new JButton();
            ensList.removeIf(p->!p.isCanBePresident());
            form = new LoVForm(ensList);

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
                
                content.add(form, "cell 2 4 3 1,growy, growx");

                //---- button1 ----
                button1.setText("Ajouter");
                content.add(button1, "cell 1 5,growy");
                // Charger les données

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
        private JButton button1;
        private LoVForm form;
        
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    private static List<? extends Personne> obList = new ArrayList<>();
}
