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
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import model.PFE;
import net.miginfocom.swing.MigLayout;
import repo.MyDataBaseConnector;

/**
 *
 * @author yassine
 */
public class viewPfePanel extends JPanel{
    private JPanel titlePanel;
    private JLabel title;
    private JTextField searchBar;
    private JComboBox critereCB;
    private JButton searchBtn;
    private JButton ajouterBtn;
    private JPanel eastBorder;
    private MyComponents.PFETable table;
    private AjouterPage.AjouterPFEDialog ajouterPfeD;
    
    public class LeftAdditionalInfoPfe extends JPanel {
        private JTextField themeField;
        private JTextField sujetField;
        private JTextArea descArea;
        private JLabel label1;
        private JLabel label2;
        private JLabel label3;
        private JLabel label4;
        private JScrollPane descScroll;
        
        public LeftAdditionalInfoPfe() {
            initComponents();
        }

        public JTextField getThemeField() {
            return themeField;
        }

        public JTextField getSujetField() {
            return sujetField;
        }

        public JTextArea getDescArea() {
            return descArea;
        }

        public void setThemeFieldText(String themeField) {
            this.themeField.setText(themeField);
        }

        public void setSujetFieldText(String sujetField) {
            this.sujetField.setText(sujetField);
        }

        public void setDescAreaText(String descArea) {
            this.descArea.setText(descArea);
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
       
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public class TabbedPfePane extends JPanel{
        private JTabbedPane pfeTabPanel;
        private JPanel etudiantTab;
        private JPanel juryTab;
        private JPanel soutTab;
        private MyComponents.EtudiantTable etu1Table;
        private MyComponents.JuryTable juryTable;
        private MyComponents.SoutenanceTable soutTable;

        public MyComponents.EtudiantTable getEtu1Table() {
            return etu1Table;
        }

        public MyComponents.JuryTable getJuryTable() {
            return juryTable;
        }

        public MyComponents.SoutenanceTable getSoutTable() {
            return soutTable;
        }
        
        
        public TabbedPfePane() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            pfeTabPanel = new JTabbedPane();
            etudiantTab = new JPanel();
            juryTab = new JPanel();
            soutTab = new JPanel();
            etu1Table = new MyComponents.EtudiantTable(null, "FNo");
            juryTable = new MyComponents.JuryTable(null, "Fno");
            soutTable = new MyComponents.SoutenanceTable();
            //======== pfeTabPanel ========
            {

                //======== etudiantTab ========
                {
                    etudiantTab.setLayout(new BorderLayout());

                    
                    etudiantTab.add(etu1Table, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Etudiant(s)", etudiantTab); // tab etudiant ayant 2 lignes

                //======== juryTab ========
                {
                    juryTab.setLayout(new BorderLayout());

                    
                    juryTab.add(juryTable, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Jury", juryTab);

                //======== soutTab ========
                {
                    soutTab.setLayout(new BorderLayout());

                    //======== soutScroll ========
                    
                    soutTab.add(soutTable, BorderLayout.CENTER);
                }
                pfeTabPanel.addTab("Soutenance", soutTab);
            }
            this.setLayout(new BorderLayout());
            this.add(pfeTabPanel, BorderLayout.CENTER);
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    
    public viewPfePanel(String[] criteres, List<PFE>info) {
	initComponents(criteres,info);
	}
    private void initComponents(String[] criteres, List<PFE>info) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        titlePanel = new JPanel();
        title = new JLabel();
        ajouterBtn = new JButton();
        searchBtn = new JButton();
        critereCB = new JComboBox<>(criteres);
        searchBar = new JTextField();

        eastBorder = new JPanel();
        table = new MyComponents.PFETable(info);
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

            titlePanel.setBackground(Color.white);
            titlePanel.setPreferredSize(new Dimension(75, 150));
            titlePanel.setLayout(new MigLayout(
                "insets 20 10 0 0, hidemode 3",
                // columns
                "10[169,fill]" +
                "[74,fill]" +
                "[70,fill]",
                // rows
                "[30]" +
                "[30]" +
                "[32]"));

            //---- title ----
            title.setText("Consulter PFE");
            title.setFont(new Font("SansSerif", Font.BOLD, 24));
            titlePanel.add(title, "cell 0 0");
            titlePanel.add(searchBar, "cell 0 1,grow");
            titlePanel.add(critereCB, "cell 1 1,growy");

            //---- chercherBtn ----
            searchBtn.setText("Chercher");
            titlePanel.add(searchBtn, "cell 2 1,growy");

            //---- ajouterBtn ----
            ajouterBtn.setText("Ajouter");
            titlePanel.add(ajouterBtn, "cell 2 2,growy");
            searchBtn.addActionListener(l->{
                DefaultTableModel myTableModel = (DefaultTableModel) table.getTable().getModel();
                TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(myTableModel);
                table.getTable().setRowSorter(obj);
                System.out.println(critereCB.getSelectedIndex());
                obj.setRowFilter(RowFilter.regexFilter(searchBar.getText(),critereCB.getSelectedIndex()));
            });
        }

        //====CenterContent=======
        int y = 100;
        //=====Table===========
        table.setBounds(0,0,1310,400+y);
        ListSelectionModel selectionModel = table.getTable().getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = table.getTable().getSelectedRow();
                    if (selectedRow != -1) {
                        MyComponents.SoutenanceTable sTable= pfeTab.getSoutTable();
                        MyComponents.JuryTable jTable = pfeTab.getJuryTable();
                        MyComponents.EtudiantTable eTable = pfeTab.getEtu1Table();
                        Object value = table.getTable().getValueAt(selectedRow, 0); 
                        System.out.println("Selected row value: " + value);
                        
                        sTable.clearTable();
                        jTable.clearTable();
                        eTable.clearTable();
                        // Start Future thread
                        ExecutorService executorP = Executors.newSingleThreadExecutor();
                        Callable<Object[][]> populateSout = () -> populateSout(sTable.getTable(),value.toString()); // pfeTab.setTitleAt(i, textField.getText()); to the etudiant
                        Callable<Object[][]> populateEtudiant = () -> populateEtudiant(eTable.getTable(),value.toString());
                        Callable<Object[][]> populateJury = () -> populateJury(jTable.getTable(),value.toString());
                        Future<Object[][]> futureSout = executorP.submit(populateSout);
                        Future<Object[][]> futureEtud = executorP.submit(populateEtudiant);
                        Future<Object[][]> futureJury = executorP.submit(populateJury);
                        // end Thread
                        try{
                           sTable.populateTable(futureSout.get());
                           eTable.populateTable(futureEtud.get());
                           jTable.populateTable(futureJury.get());

                        }catch(Exception exception){
                            exception.printStackTrace();
                        }
                        // Start Left Additional
                        PFE pfeObject = info.get(selectedRow);
                        plusInfo.setThemeFieldText(pfeObject.getTheme());
                        plusInfo.setSujetFieldText(pfeObject.getSujet());
                        plusInfo.setDescAreaText(pfeObject.getDescription());
                        

                    }
                }
            }
        });
        //=====Tabbed Panel========
        pfeTab.setBounds(0,400+y+10,1310,360);
        plusInfo.setBounds(1330,0,575,407+y);
        centerContent.add(table);
        centerContent.add(plusInfo);
        centerContent.add(pfeTab);
        centerContent.setBackground(Color.WHITE);
        plusInfo.setBackground(Color.WHITE);
        pfeTab.setBackground(Color.WHITE);

        ajouterBtn.addActionListener(l->{
            ajouterPfeD.setVisible(true);
        });
        eastBorder.setPreferredSize(new Dimension(10,0));
        westBorder.setPreferredSize(new Dimension(10,0));
        add(centerContent, BorderLayout.CENTER);
        add(eastBorder, BorderLayout.EAST);
        add(westBorder,BorderLayout.WEST);
        add(titlePanel, BorderLayout.NORTH);
    }
    public Object[][] populateEtudiant(JTable etuTable,String idPfe){
        try{
            MyDataBaseConnector dbc = new MyDataBaseConnector();
            //"Cin","Prenom","Nom","photo","Nce","Email","Tel","A un binôme",""
            dbc.query("select count(*) from Etudiant, PFE p where (p.firstEtu=cin OR p.secondEtu=cin) and p.idPFE="+idPfe);
            int size =0;
            if(dbc.rs.next())
                size = dbc.rs.getInt(1);
            
            
            dbc.query("select CIN, prenom, nom, photo, nce, email, tel from Etudiant, PFE p where (p.firstEtu=cin OR p.secondEtu=cin) and p.idPFE="+idPfe);
            Object[][] res = new Object[size][8];
            int i=0;
            while(dbc.rs.next()){
                res[i][0] = dbc.rs.getString(1);
                res[i][1] = dbc.rs.getString(2);
                res[i][2] = dbc.rs.getString(3);
                res[i][3] = dbc.rs.getString(4);
                res[i][4] = dbc.rs.getString(5);
                res[i][5]=dbc.rs.getString(6);
                res[i][6]=dbc.rs.getString(7);
                res[i][7]=null;
                i++;
            }
            dbc.conn.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public Object[][] populateJury(JTable etuTable, String idPfe){
        try{
            MyDataBaseConnector dbc = new MyDataBaseConnector();
            //"IdJury", "nom & prenom president",  "CIN de president", "grad","Fillière","Local",""
            
            dbc.query("select IdJury ,nom, prenom, cin,grad,p.idGr, p.idFill,nomSalle, numSalle from PFE p "
                    + "join Soutenance using (idSou) "
                    + "join Jury using (idJury) "
                    +"join Enseignant on president=cin "
                    + "where p.IDPFE="+idPfe);
            Object[][] res = new Object[1][7];
            int i=0;
            while(dbc.rs.next()){
                res[i][0] = dbc.rs.getString(1);
                String np = dbc.rs.getString(2)+ " "+dbc.rs.getString(3);
                res[i][1] =np;
                res[i][2] = dbc.rs.getString(4);
                res[i][3] = dbc.rs.getString("grad");
                String grFill = dbc.rs.getString(6)+"_"+dbc.rs.getString(7);
                res[i][4] = grFill;
                String loc = dbc.rs.getString(8)+ " "+dbc.rs.getString(9);
                res[i][5]=loc;
                res[i][6]=null;
                i++;
               
            }
             System.out.println(res[0][1]);
            dbc.conn.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public Object[][] populateSout(JTable etuTable, String idPfe){
        try{
            MyDataBaseConnector dbc = new MyDataBaseConnector();
            
            dbc.query("select IDSOU, DATESOUT, HEURE, ISVALID, e.nom, e.prenom, e.cin from PFE "
                    +"join Soutenance using (idSou) "
                    +"join Enseignant e on e.cin=examinateur "
                    + "where IDPFE="+idPfe);
            Object[][] res = new Object[1][7];
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
