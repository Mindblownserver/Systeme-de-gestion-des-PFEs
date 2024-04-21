/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;
import java.util.concurrent.Callable;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Enseignant;
import model.Jury;
import net.miginfocom.swing.MigLayout;
import repo.MyDataBaseConnector;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author yassine
 */
public class ViewJuryPanel extends JPanel{
    public class upperContent extends JPanel{
        private JLabel label5;
        public JTextField searchBar;
        public JComboBox criterCB;
        public JButton chercherBtn;
        public JButton ajBtn;
        
        public upperContent(String[] critereCB) {
        initComponents(critereCB); 
        }

        private void initComponents(String[] critereCB) {
            label5 = new JLabel();
            searchBar = new JTextField();
            criterCB = new JComboBox<>(critereCB);
            chercherBtn = new JButton("Chercher");
            ajBtn = new JButton("Ajouter");

            //======== this ========
            setLayout(new MigLayout(
                "insets 20 10 0 0,hidemode 3",
                // columns
                "[fill]" +
                "[207,fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[center]" +
                "[center]" +
                "[32,center]" +
                "[32,center]"));

            //---- label5 ----
            label5.setText("Consulter Jury");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
            label5.setHorizontalAlignment(SwingConstants.LEFT);
            add(label5, "cell 1 1 3 1");
            add(searchBar, "cell 1 2,growy");
            add(criterCB, "cell 2 2,growy");

            //---- button4 ----
            add(chercherBtn, "cell 3 2,growy");

            //---- button2 ----
            add(ajBtn, "cell 3 3,growy");
        }

    }
    
    public class LeftAdditionalInfoJury extends JPanel {
        public LeftAdditionalInfoJury() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            label1 = new JLabel();
            center = new JPanel();
            pfePanel = new JPanel();
            label2 = new JLabel();
            label6 = new JLabel();
            idPfeField = new JTextField();
            label7 = new JLabel();
            AnneeField = new JTextField();
            label8 = new JLabel();
            natureField = new JTextField();
            label9 = new JLabel();
            traitField = new JTextField();
            label10 = new JLabel();
            fillField = new JTextField();
            label11 = new JLabel();
            AppField = new JTextField();
            label12 = new JLabel();
            dateDebField = new JTextField();
            label13 = new JLabel();
            dateFinField = new JTextField();
            label14 = new JLabel();
            dateR1Field = new JTextField();
            label15 = new JLabel();
            dateR2Field = new JTextField();
            label3 = new JLabel();
            themeField = new JTextField();
            label4 = new JLabel();
            sujetField = new JTextField();
            label5 = new JLabel();
            descScroll = new JScrollPane();
            descArea = new JTextArea();
            label16 = new JLabel();
            label17 = new JLabel();
            cinEncField = new JTextField();
            label18 = new JLabel();
            npEncField = new JTextField();
            label19 = new JLabel();
            label20 = new JLabel();
            cinRappField = new JTextField();
            label21 = new JLabel();
            npRappField = new JTextField();
            label22 = new JLabel();
            label23 = new JLabel();
            cinEncExtField = new JTextField();
            label24 = new JLabel();
            npEncExtField = new JTextField();
            label25 = new JLabel();
            label26 = new JLabel();
            cinEtu1Field = new JTextField();
            label27 = new JLabel();
            npEtu1Field = new JTextField();
            label28 = new JLabel();
            cinEtu2Field = new JTextField();
            label29 = new JLabel();
            npEtu2Field = new JTextField();

            //======== this ========
            setPreferredSize(new Dimension(452, 600));
            setLayout(new BorderLayout(10, 10));

            //---- label1 ----
            label1.setText("Plus d'informations");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            add(label1, BorderLayout.NORTH);

            //======== center ========
            {
                center.setLayout(new BorderLayout());

                //======== pfePanel ========
                {
                    pfePanel.setLayout(new MigLayout(
                        "insets 0,hidemode 3",
                        // columns
                        "[38,fill]" +
                        "[grow,fill]" +
                        "[134,fill]50" +
                        "[60,fill]" +
                        "[171,fill]" +
                        "[84,fill]",
                        // rows
                        "[30,fill]" +
                        "[32]" +
                        "[32]" +
                        "[32]" +
                        "[32]" +
                        "[32]" +
                        "[32]" +
                        "[32]" +
                        "[]" +
                        "[]" +
                        "[32]" +
                        "[]" +
                        "[32]" +
                        "[]" +
                        "[32]" +
                        "[]" +
                        "[32]" +
                        "[32]"));

                    //---- label2 ----
                    label2.setText("PFE");
                    label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    pfePanel.add(label2, "cell 1 0");

                    //---- label6 ----
                    label6.setText("Id PFE");
                    pfePanel.add(label6, "cell 1 1");

                    //---- idPfeField ----
                    idPfeField.setEditable(false);
                    idPfeField.setBackground(Color.WHITE);
                    pfePanel.add(idPfeField, "cell 2 1,growy");

                    //---- label7 ----
                    label7.setText("Ann\u00e9e");
                    pfePanel.add(label7, "cell 3 1");

                    //---- AnneeField ----
                    AnneeField.setEditable(false);
                    AnneeField.setBackground(Color.WHITE);
                    pfePanel.add(AnneeField, "cell 4 1,growy");

                    //---- label8 ----
                    label8.setText("Nature");
                    pfePanel.add(label8, "cell 1 2");

                    //---- natureField ----
                    natureField.setEditable(false);
                    natureField.setBackground(Color.WHITE);
                    pfePanel.add(natureField, "cell 2 2, growy");

                    //---- label9 ----
                    label9.setText("Trait\u00e9 en");
                    pfePanel.add(label9, "cell 3 2");

                    //---- traitField ----
                    traitField.setEditable(false);
                    traitField.setBackground(Color.WHITE);
                    pfePanel.add(traitField, "cell 4 2,growy");

                    //---- label10 ----
                    label10.setText("Filli\u00e8re");
                    pfePanel.add(label10, "cell 1 3");

                    //---- fillField ----
                    fillField.setEditable(false);
                    fillField.setBackground(Color.WHITE);
                    pfePanel.add(fillField, "cell 2 3,growy");

                    //---- label11 ----
                    label11.setText("Approuv\u00e9 par Comit\u00e9");
                    pfePanel.add(label11, "cell 3 3");

                    //---- AppField ----
                    AppField.setEditable(false);
                    AppField.setBackground(Color.WHITE);
                    pfePanel.add(AppField, "cell 4 3,growy");

                    //---- label12 ----
                    label12.setText("Date debut");
                    pfePanel.add(label12, "cell 1 4");

                    //---- dateDebField ----
                    dateDebField.setEditable(false);
                    dateDebField.setBackground(Color.WHITE);
                    pfePanel.add(dateDebField, "cell 2 4,growy");

                    //---- label13 ----
                    label13.setText("Date  fin");
                    pfePanel.add(label13, "cell 3 4");

                    //---- dateFinField ----
                    dateFinField.setEditable(false);
                    dateFinField.setBackground(Color.WHITE);
                    pfePanel.add(dateFinField, "cell 4 4,growy");

                    //---- label14 ----
                    label14.setText("Date rendu 1");
                    pfePanel.add(label14, "cell 1 5");

                    //---- dateR1Field ----
                    dateR1Field.setEditable(false);
                    dateR1Field.setBackground(Color.WHITE);
                    pfePanel.add(dateR1Field, "cell 2 5,growy");

                    //---- label15 ----
                    label15.setText("Date rendu 2");
                    pfePanel.add(label15, "cell 3 5");

                    //---- dateR2Field ----
                    dateR2Field.setEditable(false);
                    dateR2Field.setBackground(Color.WHITE);
                    pfePanel.add(dateR2Field, "cell 4 5,growy");

                    //---- label3 ----
                    label3.setText("th\u00e8me");
                    pfePanel.add(label3, "cell 1 6");

                    //---- themeField ----
                    themeField.setEditable(false);
                    themeField.setText("Architecture des micro services");
                    themeField.setBackground(Color.white);
                    pfePanel.add(themeField, "cell 2 6 3 1,growy");

                    //---- label4 ----
                    label4.setText("Sujet");
                    pfePanel.add(label4, "cell 1 7,aligny center,growy 0");

                    //---- sujetField ----
                    sujetField.setText("Migration d'une application vers une architecture micro services");
                    sujetField.setEditable(false);
                    sujetField.setBackground(Color.white);
                    pfePanel.add(sujetField, "cell 2 7 3 1,growy,width 500px");

                    //---- label5 ----
                    label5.setText("Description");
                    pfePanel.add(label5, "cell 1 8,aligny top,growy 0");

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
                    pfePanel.add(descScroll, "cell 2 8 3 1,growy,width 500px");

                    //---- label16 ----
                    label16.setText("Encadreur ISIMM");
                    label16.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    pfePanel.add(label16, "cell 1 9 2 1");

                    //---- label17 ----
                    label17.setText("CIN");
                    pfePanel.add(label17, "cell 1 10");

                    //---- cinEncField ----
                    cinEncField.setEditable(false);
                    cinEncField.setBackground(Color.WHITE);
                    pfePanel.add(cinEncField, "cell 2 10,growy");

                    //---- label18 ----
                    label18.setText("Nom & prenom");
                    pfePanel.add(label18, "cell 3 10");

                    //---- npEncField ----
                    npEncField.setEditable(false);
                    npEncField.setBackground(Color.WHITE);
                    pfePanel.add(npEncField, "cell 4 10,growy");

                    //---- label19 ----
                    label19.setText("Rapporteur ");
                    label19.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    pfePanel.add(label19, "cell 1 11 2 1");

                    //---- label20 ----
                    label20.setText("CIN");
                    pfePanel.add(label20, "cell 1 12");

                    //---- cinRappField ----
                    cinRappField.setEditable(false);
                    cinRappField.setBackground(Color.WHITE);
                    pfePanel.add(cinRappField, "cell 2 12,growy");

                    //---- label21 ----
                    label21.setText("Nom & prenom");
                    pfePanel.add(label21, "cell 3 12");

                    //---- npRappField ----
                    npRappField.setEditable(false);
                    npRappField.setBackground(Color.WHITE);
                    pfePanel.add(npRappField, "cell 4 12,growy");

                    //---- label22 ----
                    label22.setText("Encadreur pro de la societ\u00e9 +{NomDuSociete}");
                    label22.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    pfePanel.add(label22, "cell 1 13 4 1");

                    //---- label23 ----
                    label23.setText("CIN");
                    pfePanel.add(label23, "cell 1 14");

                    //---- cinEncExtField ----
                    cinEncExtField.setEditable(false);
                    cinEncExtField.setBackground(Color.WHITE);
                    pfePanel.add(cinEncExtField, "cell 2 14,growy");

                    //---- label24 ----
                    label24.setText("Nom & prenom");
                    pfePanel.add(label24, "cell 3 14");

                    //---- npEncExtField ----
                    npEncExtField.setEditable(false);
                    npEncExtField.setBackground(Color.WHITE);
                    pfePanel.add(npEncExtField, "cell 4 14,growy");

                    //---- label25 ----
                    label25.setText("Etudiant(s)");
                    label25.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    pfePanel.add(label25, "cell 1 15 2 1");

                    //---- label26 ----
                    label26.setText("CIN");
                    pfePanel.add(label26, "cell 1 16");

                    //---- cinEtu1Field ----
                    cinEtu1Field.setEditable(false);
                    cinEtu1Field.setBackground(Color.WHITE);
                    pfePanel.add(cinEtu1Field, "cell 2 16,growy");

                    //---- label27 ----
                    label27.setText("Nom & prenom");
                    pfePanel.add(label27, "cell 3 16");

                    //---- npEtu1Field ----
                    npEtu1Field.setEditable(false);
                    npEtu1Field.setBackground(Color.WHITE);
                    pfePanel.add(npEtu1Field, "cell 4 16,growy");

                    //---- label28 ----
                    label28.setText("CIN");
                    pfePanel.add(label28, "cell 1 17");

                    //---- cinEtu2Field ----
                    cinEtu2Field.setEditable(false);
                    pfePanel.add(cinEtu2Field, "cell 2 17,growy");
                    cinEtu2Field.setBackground(Color.WHITE);
                    
                    //---- label29 ----
                    label29.setText("Nom & prenom");
                    pfePanel.add(label29, "cell 3 17");

                    //---- npEtu2Field ----
                    npEtu2Field.setEditable(false);
                    npEtu2Field.setBackground(Color.WHITE);
                    pfePanel.add(npEtu2Field, "cell 4 17,growy");
                }
                center.add(pfePanel, BorderLayout.CENTER);
                pfePanel.setBackground(Color.WHITE);
            }
            add(center, BorderLayout.CENTER);
            setBackground(Color.WHITE);
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JLabel label1;
        private JPanel center;
        private JPanel pfePanel;
        private JLabel label2;
        private JLabel label6;
        private JTextField idPfeField;
        private JLabel label7;
        private JTextField AnneeField;
        private JLabel label8;
        private JTextField natureField;
        private JLabel label9;
        private JTextField traitField;
        private JLabel label10;
        private JTextField fillField;
        private JLabel label11;
        private JTextField AppField;
        private JLabel label12;
        private JTextField dateDebField;
        private JLabel label13;
        private JTextField dateFinField;
        private JLabel label14;
        private JTextField dateR1Field;
        private JLabel label15;
        private JTextField dateR2Field;
        private JLabel label3;
        private JTextField themeField;
        private JLabel label4;
        private JTextField sujetField;
        private JLabel label5;
        private JScrollPane descScroll;
        private JTextArea descArea;
        private JLabel label16;
        private JLabel label17;
        private JTextField cinEncField;
        private JLabel label18;
        private JTextField npEncField;
        private JLabel label19;
        private JLabel label20;
        private JTextField cinRappField;
        private JLabel label21;
        private JTextField npRappField;
        private JLabel label22;
        private JLabel label23;
        private JTextField cinEncExtField;
        private JLabel label24;
        private JTextField npEncExtField;
        private JLabel label25;
        private JLabel label26;
        private JTextField cinEtu1Field;
        private JLabel label27;
        private JTextField npEtu1Field;
        private JLabel label28;
        private JTextField cinEtu2Field;
        private JLabel label29;
        private JTextField npEtu2Field;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    
    private final MyComponents.JuryTable jTable;
    private final upperContent uContent;
    private final MyComponents.SoutenanceTable sTable;
    private AjouterPage.AjouterJuryDialogue ajJury;
    private JButton ajSoutBtn;
    private LeftAdditionalInfoJury plusInfoJury;
    private AjouterPage.AjouterSoutenance ajSoutD;
    
    public ViewJuryPanel(String[] critereCB, List<Jury> info){
        System.out.println(info.get(0).getPresident().getNom());
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        jTable = new MyComponents.JuryTable(info);
        uContent = new upperContent(critereCB);
        ajJury = new AjouterPage.AjouterJuryDialogue(topFrame);
        sTable = new MyComponents.SoutenanceTable();
        plusInfoJury = new LeftAdditionalInfoJury();
        
        ajSoutBtn =new JButton("+");
        ajSoutD = new AjouterPage.AjouterSoutenance(topFrame);
        
        JPanel centerPanel = new JPanel();
        JPanel soutBtnPanel = new JPanel();
        JLabel titleSoutPanel = new JLabel("Soutenance (0)");
        titleSoutPanel.setFont(new Font("SansSerif",0,16));
        soutBtnPanel.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));       
        
        centerPanel.setLayout(null);
        centerPanel.setBackground(Color.WHITE);
        soutBtnPanel.setBackground(Color.WHITE);
        //plusInfoJury.setBorder(BorderFactory.createLineBorder(Color.BLACK));  
        jTable.setBounds(15,0,1200,300);
        soutBtnPanel.setBounds(15,320,300,30);
        plusInfoJury.setBounds(1250,0,700,800);
        sTable.setBounds(15,350,1200,300);
        
        uContent.setBackground(Color.WHITE);
        uContent.ajBtn.addActionListener(l->{
            ajJury.setVisible(true);
        });
        ajSoutBtn.addActionListener(l->{
            ajSoutD.setVisible(true);
        });
        
        uContent.chercherBtn.addActionListener(l->{
            DefaultTableModel myTableModel = (DefaultTableModel) jTable.getTable().getModel();
            TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(myTableModel);
            jTable.getTable().setRowSorter(obj);
            System.out.println(uContent.criterCB.getSelectedIndex());
            obj.setRowFilter(RowFilter.regexFilter(uContent.searchBar.getText(),uContent.criterCB.getSelectedIndex()));
        });
        //======Table=======
        ListSelectionModel selectionModel = jTable.getTable().getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTable.getTable().getSelectedRow();
                    if (selectedRow != -1) {
                        Object value = jTable.getTable().getValueAt(selectedRow, 0); 
                        System.out.println("Selected row value: " + value);
                        sTable.clearTable();
                        // Start Future thread
                        ExecutorService executorJ = Executors.newSingleThreadExecutor();
                        Callable<Object[][]> populateThread = () -> populateSoutenanceTable(value.toString(), titleSoutPanel);
                        Future<Object[][]> future = executorJ.submit(populateThread);
                        // end Thread
                        
                        try{
                           sTable.populateTable(future.get());
                        }catch(Exception exception){
                            exception.printStackTrace();
                        }
                        //executor.shutdown();
                    }
                    
                }
            }
        });
        
        centerPanel.add(jTable);
        centerPanel.add(sTable);
        centerPanel.add(soutBtnPanel);
        centerPanel.add(plusInfoJury);
        soutBtnPanel.add(titleSoutPanel);
        soutBtnPanel.add(new JLabel("  "));
        soutBtnPanel.add(ajSoutBtn);
        setLayout(new BorderLayout(10,10));
        add(uContent,BorderLayout.NORTH);
        add(centerPanel,BorderLayout.CENTER);
        this.setVisible(true);
        this.setBackground(Color.WHITE);
    }
    public Object[][] populateSoutenanceTable(String idJury, JLabel titleOfTable){
        try{
            MyDataBaseConnector dbc = new MyDataBaseConnector();
            
            dbc.query("select count(*) from Soutenance where IDJury="+idJury);
            int size =0;
            if(dbc.rs.next())
                size = dbc.rs.getInt(1);
            
            dbc.query("select IDSOU, DATESOUT, HEURE, ISVALID, e.nom, e.prenom, e.cin from Soutenance join Enseignant e on e.cin=examinateur where IDJury="+idJury);
            Object[][] res = new Object[size][7];
            int i=0;
            while(dbc.rs.next()){
                //"ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur",""
                res[i][0] = dbc.rs.getString(1);
                res[i][1] = dbc.rs.getDate(2);
                res[i][2] = dbc.rs.getString(3);
                res[i][3] = dbc.rs.getBoolean(4);
                res[i][4] = dbc.rs.getString(7);
                String np = dbc.rs.getString(6)+ " "+dbc.rs.getString(5);
                res[i][5]=np;
                res[i][6]=null;
                i++;
            }
            titleOfTable.setText("Soutenance ("+size+")");
            dbc.conn.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public Object[][] fillPfeData(String idJury){ // À changer
        try{
            MyDataBaseConnector dbc = new MyDataBaseConnector();
            
            dbc.query("select count(*) from Soutenance where IDJury="+idJury);
            int size =0;
            if(dbc.rs.next())
                size = dbc.rs.getInt(1);
            
            dbc.query("select IDSOU, DATESOUT, HEURE, ISVALID, e.nom, e.prenom, e.cin from Soutenance join Enseignant e on e.cin=examinateur where IDJury="+idJury);
            Object[][] res = new Object[size][7];
            int i=0;
            while(dbc.rs.next()){
                //"ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur",""
                res[i][0] = dbc.rs.getString(1);
                res[i][1] = dbc.rs.getDate(2);
                res[i][2] = dbc.rs.getString(3);
                res[i][3] = dbc.rs.getBoolean(4);
                res[i][4] = dbc.rs.getString(7);
                String np = dbc.rs.getString(6)+ " "+dbc.rs.getString(5);
                res[i][5]=np;
                res[i][6]=null;
                i++;
            }
            dbc.conn.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
//select count(IDSou) as nbrSout, president from Soutenance
//    join Jury using (idJury)
//    group by president;