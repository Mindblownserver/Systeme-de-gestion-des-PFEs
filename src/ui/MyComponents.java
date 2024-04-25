package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Stack;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.*;
import repo.MyDataBaseConnector;

public class MyComponents {
    public static Font h1 = new Font("Monosans",0,24);
    public static Font h2 = new Font("Monosans",0,22);
    public static Font h3 = new Font("Monosans",0,20);    
    public static Color primaryColor= Color.WHITE;
    public static Color secondaryColor= Color.decode("#F2F2F2");
    public static Color accentNormal = Color.decode("#2c67f2");
    public static Color accentLessHue=Color.decode("#2c8ff2");
    // when modify, make the changes on the spot


    
    public static Object[][] listToObjects(List<? extends Object> l){
        Object[][]res=null;
        System.out.println(l);
        Object o = l.get(0);
        if(o instanceof Local){
            res = new Object[l.size()][Local.getColumnCount()+1];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Local)l.get(i)).getNomSalle();
                res[i][1]= ((Local)l.get(i)).getNumSalle();
                res[i][2] = null;
                
            }
        }
        else if(o instanceof Specialite){
            res = new Object[l.size()][Specialite.getColumnCount()+1];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Specialite)l.get(i)).getIdFill();
                res[i][1]= ((Specialite)l.get(i)).getFillier();
                res[i][2] = null;
            }
        }
        else if(o instanceof Groupe){
            res = new Object[l.size()][Groupe.getColumnCount()+1];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Groupe)l.get(i)).getIdGr();
                res[i][1]= ((Groupe)l.get(i)).getLibelle();
                res[i][2] = ((Groupe)l.get(i)).getSpecialite().getIdFill();
                res[i][3] = ((Groupe)l.get(i)).getSpecialite().getFillier();
                res[i][4] = null;
                //res[i][5]= deleteBtn;
            }
        }
        else if(o instanceof OrganismeExt){
            res = new Object[l.size()][OrganismeExt.getColumnCount()+1];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((OrganismeExt)l.get(i)).getIdSc();
                res[i][1]= ((OrganismeExt)l.get(i)).getNomSc();
                res[i][2] = ((OrganismeExt)l.get(i)).getDomAct();
                res[i][3] = ((OrganismeExt)l.get(i)).getAdress();
                res[i][4] = null;
            }
        }
        else if(o instanceof EncadreurExt){
            res = new Object[l.size()][8];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((EncadreurExt)l.get(i)).getCin();
                res[i][1]= ((EncadreurExt)l.get(i)).getPrenom();
                res[i][2] = ((EncadreurExt)l.get(i)).getNom();
                res[i][3] = ((EncadreurExt)l.get(i)).getEmail();
                res[i][4]= ((EncadreurExt)l.get(i)).getTel();
                res[i][5] = ((EncadreurExt)l.get(i)).getPoste();
                res[i][6]= ((EncadreurExt)l.get(i)).getSociete().getIdSc();
                res[i][7] = null;
            }
        }// "Cin", "Prenom", "Nom", "Photo", "Grad","Email","Tel", "peutEtrePresident", ""
        else if(o instanceof Enseignant){
            res = new Object[l.size()][9];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Enseignant)l.get(i)).getCin();
                res[i][1]= ((Enseignant)l.get(i)).getPrenom();
                res[i][2] = ((Enseignant)l.get(i)).getNom();
                res[i][3] = ((Enseignant)l.get(i)).getPhoto();
                res[i][4]= ((Enseignant)l.get(i)).getGrad();
                res[i][5] = ((Enseignant)l.get(i)).getEmail();
                res[i][6]= ((Enseignant)l.get(i)).getTel();
                res[i][7] = ((Enseignant)l.get(i)).isCanBePresident();
                res[i][8] = null;
            }
        }
        else if(o instanceof Etudiant){
            // Etudiant add champ groupe to him
            //"Cin","Prenom","Nom","photo","Nce","Email","Tel","A un binôme",""
            res = new Object[l.size()][9];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Etudiant)l.get(i)).getCin();
                res[i][1]= ((Etudiant)l.get(i)).getPrenom();
                res[i][2] = ((Etudiant)l.get(i)).getNom();
                res[i][3] = ((Etudiant)l.get(i)).getPhoto();
                res[i][4]= ((Etudiant)l.get(i)).getNCE();
                res[i][5] = ((Etudiant)l.get(i)).getEmail();
                res[i][6]= ((Etudiant)l.get(i)).getTel();
                res[i][7] = ((Etudiant)l.get(i)).isHasBinome();
                res[i][8] = null;
            }
        }
        else if(o instanceof Jury){
            res = new Object[l.size()][7];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Jury)l.get(i)).getIdJury();
                String np = ((Jury)l.get(i)).getPresident().getPrenom() +" "+((Jury)l.get(i)).getPresident().getNom();
                res[i][1]= np;
                res[i][2] = ((Jury)l.get(i)).getPresident().getCin();
                res[i][3] = ((Jury)l.get(i)).getPresident().getGrad();
                String grFill = ((Jury)l.get(i)).getType().getIdGr()+ "_"+((Jury)l.get(i)).getType().getSpecialite().getIdFill();
                res[i][4]= grFill;
                String loc =((Jury)l.get(i)).getLoc().getNomSalle() + " "+((Jury)l.get(i)).getLoc().getNumSalle(); 
                res[i][5] = loc;
                res[i][6] = null;
            }
        }
        else if (o instanceof PFE){
            //"ID ", "Ann\u00e9e", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", 
            //"Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage",""
            res = new Object[l.size()][13];
            for(int i=0;i<l.size();i++){
                res[i][0] = ((PFE)l.get(i)).getId();
                res[i][1] = ((PFE)l.get(i)).getAnnee();
                res[i][2] = (((PFE)l.get(i)).isIsMonome())?"Monôme":"Binôme";
                res[i][3] = (((PFE)l.get(i)).isHasInternship())?"Externe":"Interne";
                Groupe type = ((PFE)l.get(i)).getType();
                res[i][4] = type.getIdGr()+"_"+type.getSpecialite().getIdFill();
                res[i][5] = ((PFE)l.get(i)).getDateDebut();
                res[i][6] = ((PFE)l.get(i)).getDureeStage();
                res[i][7] = ((PFE)l.get(i)).getDateFin();
                res[i][8] = ((PFE)l.get(i)).isIsApproved();
                res[i][9] = ((PFE)l.get(i)).isIsValidByRapp();
                res[i][10] = ((PFE)l.get(i)).isIsScheduled();
                res[i][11] = ((PFE)l.get(i)).isHasInternship();
                res[i][12]= null;
                
            }
        }
        
        return res;
    }
    public static class MyHeaderRenderer extends JLabel implements TableCellRenderer {
 
        public MyHeaderRenderer() {
            setFont(new Font("SansSerif",1,18));
            setHorizontalAlignment(LEFT);
            setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            return this;
        }
    }
    
    // Buttons & other Components Ra Ven
    public static class ActionButton extends JButton {
        private boolean mousePress;

        public ActionButton() {
            setPreferredSize(new Dimension(35,35));
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    mousePress = true;
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    mousePress = false;
                }
            });
        }

        
    }
    public static class PanelAction extends JPanel {
        ActionButton cmdEdit;
        ActionButton cmdDelete;
        /**
         * Creates new form PanelAction
         */
        public PanelAction() {
            initComponents();
        }

        public void initEvent(TableActionEvent event, int row) {
            cmdEdit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    event.onEdit(row);
                }
            });
            cmdDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    event.onDelete(row);
                }
            });
            
        }

        
        private void initComponents() {

            cmdEdit = new ActionButton();
            cmdDelete = new ActionButton();

            cmdEdit.setIcon((new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")))); // NOI18N

            cmdDelete.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg"))); // NOI18N


            //javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(new FlowLayout(FlowLayout.CENTER,10,2));
            this.add(cmdEdit);this.add(cmdDelete);
        }
    }
    public static class TableActionCellRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
            Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
            PanelAction action = new PanelAction();
            if (isSeleted == false && row % 2 == 0) {
                action.setBackground(Color.WHITE);
            } else {
                action.setBackground(com.getBackground());
            }
            return action;
        }
}
    public static class TableActionCellEditor extends DefaultCellEditor {

        private TableActionEvent event;

        public TableActionCellEditor(TableActionEvent event) {
            super(new JCheckBox());
            this.event = event;
        }

        @Override
        public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
            PanelAction action = new PanelAction();
            action.initEvent(event, row);
            action.setBackground(jtable.getSelectionBackground());
            return action;
        }
    }

    // Tables
    
    public static class SpTable extends JScrollPane implements ComponentWithTable{
        private JTable spTable;
        TableActionEvent event;
        public SpTable(List<? extends ColumnNames>l, TableActionEvent event){
            this.event = event;
            initComponents(l);
        }
        
        public JTable getTable() {
            return spTable;
        }

        public void setTable(JTable spTable) {
            this.spTable = spTable;
        }
        

        private void initComponents(List<? extends ColumnNames>l) {
            
            spTable = new JTable();
            Object[][] data = listToObjects(l);

            //======== spScroll ========
            {

                //---- spTable ----
                spTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "ID", "Filli\u00e8re",""
                    }
                ){
                    boolean[] columnEditable = new boolean[] {
                        false, false, true
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    };
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class,  Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }

                });
                
                this.setViewportView(spTable);
                spTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                spTable.setRowHeight(40);
                TableColumnModel cm = spTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(2).setMaxWidth(100);
                cm.getColumn(2).setMinWidth(100);
                cm.getColumn(2).setCellRenderer(new TableActionCellRender());
                cm.getColumn(2).setCellEditor(new TableActionCellEditor(event));
                spTable.setShowGrid(true);

            }
        }
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) spTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
            ((DefaultTableModel)spTable.getModel()).setDataVector(data, new String[]{"ID", "Filli\u00e8re",""});
            TableColumnModel cm = spTable.getColumnModel();
            cm.getColumn(0).setMaxWidth(80);
            cm.getColumn(2).setMaxWidth(100);
            cm.getColumn(2).setMinWidth(100);
            cm.getColumn(2).setCellRenderer(new TableActionCellRender());
            cm.getColumn(2).setCellEditor(new TableActionCellEditor(event));
                
        }
        
    }
    public static class PFETable  extends JScrollPane implements ComponentWithTable{
        private JTable pfeTable;
        private TableActionEvent event;
        public PFETable(List<PFE> info, TableActionEvent event){
            setTableActionEvent(event);
            initComponents(info);
            
        }
        public void setTableActionEvent(TableActionEvent e){
            event =e;
        }
        private void initComponents(List<PFE> info) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            pfeTable = new JTable();
            

            //======== pfeScroll ========
            {

                //---- pfeTable ----
                pfeTable.setModel(new DefaultTableModel(
                        listToObjects(info),
                    new String[] {
                        "ID ", "Ann\u00e9e", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage",""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, Object.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class,Object.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false, false, false, false, false, true
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
                    };
                    TableColumnModel cm = pfeTable.getColumnModel();
                    cm.getColumn(0).setPreferredWidth(85);
                    cm.getColumn(2).setPreferredWidth(80);
                    cm.getColumn(3).setPreferredWidth(90);
                    cm.getColumn(4).setPreferredWidth(125);
                    cm.getColumn(5).setPreferredWidth(85);
                    cm.getColumn(6).setPreferredWidth(60);
                    cm.getColumn(7).setPreferredWidth(70);
                    cm.getColumn(8).setPreferredWidth(70);
                    cm.getColumn(9).setPreferredWidth(150);
                    cm.getColumn(10).setPreferredWidth(70);
                    cm.getColumn(11).setPreferredWidth(90);
                    cm.getColumn(12).setMaxWidth(100);
                    cm.getColumn(12).setMinWidth(100);
                    cm.getColumn(12).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(12).setCellEditor(new TableActionCellEditor(event));
                    pfeTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                }
                pfeTable.setGridColor(Color.black);
                pfeTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                pfeTable.setBorder(null);
                pfeTable.setFillsViewportHeight(true);
                pfeTable.setRowHeight(40);
                this.setViewportView(pfeTable);
                this.setVisible(true);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        
        @Override
        public JTable getTable() {
            return pfeTable;
        }
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) pfeTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
            ((DefaultTableModel)pfeTable.getModel()).setDataVector(data, new String[]{"ID ", "Ann\u00e9e", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage",""});    
            TableColumnModel cm = pfeTable.getColumnModel();
            cm.getColumn(0).setPreferredWidth(85);
            cm.getColumn(2).setPreferredWidth(80);
            cm.getColumn(3).setPreferredWidth(90);
            cm.getColumn(4).setPreferredWidth(125);
            cm.getColumn(5).setPreferredWidth(85);
            cm.getColumn(6).setPreferredWidth(60);
            cm.getColumn(7).setPreferredWidth(70);
            cm.getColumn(8).setPreferredWidth(70);
            cm.getColumn(9).setPreferredWidth(150);
            cm.getColumn(10).setPreferredWidth(70);
            cm.getColumn(11).setPreferredWidth(90);
            cm.getColumn(12).setMaxWidth(100);
            cm.getColumn(12).setMinWidth(100);
            cm.getColumn(12).setCellRenderer(new TableActionCellRender());
            cm.getColumn(12).setCellEditor(new TableActionCellEditor(event));
            
        }
    }
    public static class SoutenanceTable extends JScrollPane implements ComponentWithTable{
        private JTable soutTable;
        TableActionEvent event = new TableActionEvent() {
                @Override
                public void onEdit(int row) {
                    System.out.println("Edit row : " + row);
                }

                @Override
                public void onDelete(int row) {
                    String idSout = soutTable.getModel().getValueAt(row, 0).toString();
                    try{
                        MyDataBaseConnector dbc = new MyDataBaseConnector();
                        dbc.query("delete from PFE where idSou="+idSout);
                        dbc.query("delete from Soutenance where idSou="+idSout);
                        
                    }catch(Exception e){
                        
                    }
                    if (soutTable.isEditing()) {
                        soutTable.getCellEditor().stopCellEditing();
                    }
                    DefaultTableModel model = (DefaultTableModel) soutTable.getModel();
                    model.removeRow(row);
                }

                @Override
                public void onView(int row) {
                    System.out.println("View row : " + row);
                }
            };
        public SoutenanceTable() {
            initComponents();
        }
        
        @Override
        public JTable getTable() {
            return soutTable;
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            soutTable = new JTable();
            

            //======== soutScroll ========
            {

                //---- soutTable ----
                soutTable.setModel(new DefaultTableModel(
                    null,
                    new String[] {
                        "ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur",""
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false,false,false,true
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class,String.class,String.class,Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                soutTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                soutTable.setRowHeight(40);
                this.setViewportView(soutTable);
                TableColumnModel cm = soutTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(1).setMaxWidth(100);
                cm.getColumn(2).setMaxWidth(100);
                cm.getColumn(3).setMinWidth(150);
                cm.getColumn(3).setMaxWidth(150);
                
            }
        }
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) soutTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
             
            ((DefaultTableModel)soutTable.getModel()).setDataVector(data, new String[]{"ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur",""});
            TableColumnModel cm = soutTable.getColumnModel();
            cm.getColumn(0).setMaxWidth(80);
            cm.getColumn(1).setMaxWidth(100);
            cm.getColumn(2).setMaxWidth(100);
            cm.getColumn(3).setMinWidth(150);
            cm.getColumn(3).setMaxWidth(150);
            cm.getColumn(6).setCellRenderer(new TableActionCellRender());
            cm.getColumn(6).setCellEditor(new TableActionCellEditor(event));
        }
        
        

    }
    public static class SoutenanceTableSansModSupp extends JScrollPane {
        public SoutenanceTableSansModSupp() {
            initComponents();
        }
        
        public JTable getTable() {
            return soutTable;
        }

        public void setTable(JTable soutTable) {
            this.soutTable = soutTable;
        }
        
        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            soutTable = new JTable();
            //======== soutScroll ========
            {

                //---- soutTable ----
                soutTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null,"",""},
                        {null, null, null, null,"",""},
                    },
                    new String[] {
                        "ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false,false,false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class,String.class,String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                soutTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                TableColumnModel cm = soutTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(1).setMaxWidth(100);
                cm.getColumn(2).setMaxWidth(100);
                cm.getColumn(3).setMinWidth(150);
                cm.getColumn(3).setMaxWidth(150);
                soutTable.setRowHeight(40);
                this.setViewportView(soutTable);
      
            }
        }
        private JTable soutTable;
        
    }
    public static class OrganismeTable extends JScrollPane implements ComponentWithTable{
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                String idSc = orgTable.getModel().getValueAt(row, 0).toString();
                System.out.println("Delete row : " + row);
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("delete from EncadreurExt where idSc='"+idSc+"'");
                    dbc.query("delete from OrganismeExt where idSc='"+idSc+"'");
                }catch(Exception e){
                    e.printStackTrace();
                }

            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public OrganismeTable(List<? extends ColumnNames>l) {
            initComponents(l);
        }
        
        public JTable getTable() {
            return orgTable;
        }

        public void setTable(JTable orgTable) {
            this.orgTable = orgTable;
        }
        
        private void initComponents(List<? extends ColumnNames> l) {
            orgTable = new JTable();
            Object[][] data = listToObjects(l);
            //======== orgScroll ========
            {

                //---- orgTable ----
                orgTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "ID org", "Nom societ\u00e9", "Domaine d'activit\u00e9","Address", ""
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,false,true
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    };
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class, Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                
                {
                    TableColumnModel cm = orgTable.getColumnModel();
                    cm.getColumn(0).setMaxWidth(100);
                    cm.getColumn(0).setMinWidth(100);
                    cm.getColumn(1).setPreferredWidth(105);
                    cm.getColumn(2).setPreferredWidth(140);
                    cm.getColumn(4).setMaxWidth(100);
                    cm.getColumn(4).setMinWidth(100);
                    cm.getColumn(4).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(4).setCellEditor(new TableActionCellEditor(event));
                    orgTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                    orgTable.setRowHeight(40);
                }
                this.setViewportView(orgTable);
                orgTable.setShowGrid(true);

            }
        }
        private JTable orgTable;
        
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) orgTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
            ((DefaultTableModel)orgTable.getModel()).setDataVector(data, new String[]{"ID org", "Nom societ\u00e9", "Domaine d'activit\u00e9","Address", ""});  
            TableColumnModel cm = orgTable.getColumnModel();
             cm.getColumn(0).setMaxWidth(100);
            cm.getColumn(0).setMinWidth(100);
            cm.getColumn(1).setPreferredWidth(105);
            cm.getColumn(2).setPreferredWidth(140);
            cm.getColumn(4).setMaxWidth(100);
            cm.getColumn(4).setMinWidth(100);
            cm.getColumn(4).setCellRenderer(new TableActionCellRender());
            cm.getColumn(4).setCellEditor(new TableActionCellEditor(event));
               
        }
    }
    public static class GroupeTable  extends JScrollPane implements ComponentWithTable{
        private JTable groupeTable;
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            // add dialogue to verify if user really wants to delete rows
            public void onDelete(int row) {
                String idGr=groupeTable.getModel().getValueAt(row, 0).toString();
                String idFill=groupeTable.getModel().getValueAt(row, 2).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("delete from Groupe where idGr='"+idGr+"' and idFill='"+idFill+"'");
                    dbc.query("delete from Jury where idGr='"+idGr+"' and idFill='"+idFill+"'");
                    dbc.query("delete from Soutenance where idJury =(select idJury from Jury where idGr='"+idGr+"' and idFill='"+idFill+"')");
                    dbc.query("delete from PFE where idGr='"+idGr+"' and idFill='"+idFill+"'");
                }catch(Exception e){
                    e.printStackTrace();
                }                        
                if (groupeTable.isEditing()) {
                    groupeTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) groupeTable.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public GroupeTable(List<? extends ColumnNames> l){
            initComponents(l);
        }
        
        private void initComponents(List<? extends ColumnNames>l) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            groupeTable = new JTable();
            //======== groupeScroll ========
            {
                Object[][] data = listToObjects(l);
                //---- groupeTable ----
                groupeTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "ID Groupe", "Libelle", "ID Filliere", "Filliere",  ""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class, Object.class//, JButton.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, true
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
                    TableColumnModel cm = groupeTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(2).setMinWidth(120);
                    cm.getColumn(0).setMaxWidth(120);
                    cm.getColumn(2).setMaxWidth(120);
                    cm.getColumn(3).setPreferredWidth(200);
                    cm.getColumn(4).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(4).setCellEditor(new TableActionCellEditor(event));
                    cm.getColumn(4).setMaxWidth(100);
                    cm.getColumn(4).setMinWidth(100);
                }
                //TableCellRenderer tableRenderer = groupeTable.getDefaultRenderer(JButton.class);
                //groupeTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
                groupeTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                groupeTable.setShowHorizontalLines(true);
                groupeTable.setBorder(null);
                groupeTable.setFillsViewportHeight(true);
                
                groupeTable.setRowHeight(40);
                groupeTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                this.setViewportView(groupeTable);
                this.setBounds(0,0,900,800);
                groupeTable.setBounds(0,0,900,800);
                
            }
        }
                
        public JTable getTable() {
            return groupeTable;
        }

        public void setTable(JTable groupeTable) {
            this.groupeTable = groupeTable;
        }
        
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) groupeTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
            ((DefaultTableModel)groupeTable.getModel()).setDataVector(data, new String[]{"ID Groupe", "Libelle", "ID Filliere", "Filliere",  ""}); 
            TableColumnModel cm = groupeTable.getColumnModel();
            groupeTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
            cm.getColumn(0).setMinWidth(120);
            cm.getColumn(2).setMinWidth(120);
            cm.getColumn(0).setMaxWidth(120);
            cm.getColumn(2).setMaxWidth(120);
            cm.getColumn(3).setPreferredWidth(200);
            cm.getColumn(4).setCellRenderer(new TableActionCellRender());
            cm.getColumn(4).setCellEditor(new TableActionCellEditor(event));
            cm.getColumn(4).setMaxWidth(100);
            cm.getColumn(4).setMinWidth(100);
                
        }

    }
    public static class LocalTable extends JScrollPane implements ComponentWithTable{
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                // See which attributes in which tables can be nullable so
                // that you can give null to an attribute instead of deleting
                // the row;
                String nomLoc = locTable.getModel().getValueAt(row, 0).toString();
                String numLoc = locTable.getModel().getValueAt(row, 1).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("delete from Jury where numSalle="+numLoc+" and nomSalle='"+nomLoc+"'");
                    dbc.query("delete from Loc where numSalle="+numLoc+" and nomSalle='"+numLoc+"'");
                }catch(Exception e){
                    e.printStackTrace();
                }
                if (locTable.isEditing()) {
                    locTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) locTable.getModel();
                model.removeRow(row);
                System.out.println("Delete row : " + row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public LocalTable(List<? extends ColumnNames> l) {
            initComponents(l);
        }
        
        private void initComponents(List<? extends ColumnNames> l) {
            locTable = new JTable();
            Object[][] data = listToObjects(l);
            System.out.println(data);
            //======== locScroll ========
            {

                //---- locTable ----
                locTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "Nom Local", "Num Local", ""
                    }
                    ){
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, Object.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false,  true
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
                    
                    
                    TableColumnModel cm = locTable.getColumnModel();
                   
                    cm.getColumn(0).setMaxWidth(150);
                    cm.getColumn(0).setMinWidth(150);
                    cm.getColumn(2).setMaxWidth(100);
                    cm.getColumn(2).setMinWidth(100);
                    cm.getColumn(2).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(2).setCellEditor(new TableActionCellEditor(event));

                }
                locTable.setRowHeight(40);
                locTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                this.setViewportView(locTable);
                locTable.setShowGrid(true);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        public JTable getTable() {
            return locTable;
        }

        public void setTable(JTable locTable) {
            this.locTable = locTable;
        }
        private JTable locTable;
        
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) locTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        
        
        public void populateTable(Object[][] data){
            ((DefaultTableModel)locTable.getModel()).setDataVector(data, new String[]{"Nom Local", "Num Local", ""});  
            TableColumnModel cm = locTable.getColumnModel();
            cm.getColumn(0).setMaxWidth(150);
            cm.getColumn(0).setMinWidth(150);
            cm.getColumn(2).setMaxWidth(100);
            cm.getColumn(2).setMinWidth(100);
            cm.getColumn(2).setCellRenderer(new TableActionCellRender());
            cm.getColumn(2).setCellEditor(new TableActionCellEditor(event));
              
        }
    }
    public static class EncadreurExterieurTable extends JScrollPane implements ComponentWithTable{
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                System.out.println("Delete row : " + row);
                String idEncadExt = encExtTable.getModel().getValueAt(row, 0).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("update PFE "
                            + "set ENCADEUREXT=null "
                            + "where ENCADEUREXT='"+idEncadExt+"'");
                    dbc.query("delete from ENCADREUREXT where cin='"+idEncadExt+"'");

                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public EncadreurExterieurTable(List<? extends ColumnNames> info){
            initComponents(info);
        }
        
        public JTable getTable() {
            return encExtTable;
        }

        public void setTable(JTable encExtTable) {
            this.encExtTable = encExtTable;
        }
        
        private void initComponents(List<? extends ColumnNames> info) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            encExtTable = new JTable();
            
            //======== encExtScroll ========
            {

                //---- encExtTable ----
                encExtTable.setModel(new DefaultTableModel(
                    listToObjects(info),
                    new String[] {
                        "CIN", "Prenom", "Nom", "Email", "Tel", "Post","Id Organisme",""
                    }
                ){
                    Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class,String.class,String.class,String.class,String.class, Object.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,  false, false,false,false,true
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
                
                
                encExtTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                encExtTable.setRowHeight(40);
                TableColumnModel cm = encExtTable.getColumnModel();
                cm.getColumn(7).setMaxWidth(100);
                cm.getColumn(7).setMinWidth(100);
                cm.getColumn(7).setCellRenderer(new TableActionCellRender());
                cm.getColumn(7).setCellEditor(new TableActionCellEditor(event));
                
                
                this.setViewportView(encExtTable);
                encExtTable.setShowGrid(true);
            }
        }
        private JTable encExtTable;
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) encExtTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        
        
        public void populateTable(Object[][] data){
             ((DefaultTableModel)encExtTable.getModel()).setDataVector(data, new String[]{"CIN", "Prenom", "Nom", "Email", "Tel", "Post","Id Organisme",""});    
            TableColumnModel cm = encExtTable.getColumnModel();
            cm.getColumn(7).setMaxWidth(100);
            cm.getColumn(7).setMinWidth(100);
            cm.getColumn(7).setCellRenderer(new TableActionCellRender());
            cm.getColumn(7).setCellEditor(new TableActionCellEditor(event));
            
        }
    }
    public static class JuryTable extends JScrollPane implements ComponentWithTable{
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                String idJury = juryTable.getModel().getValueAt(row, 0).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("delete from PFE where idSou=(select idSou from Soutenance where idJury="+idJury+")");
                    dbc.query("delete from Soutenance where idJury="+idJury);
                    dbc.query("delete from Jury where idJury="+idJury);
                }catch(Exception e){
                    System.out.println("Jury error");
                    e.printStackTrace();
                }
                if (juryTable.isEditing()) {
                    juryTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) juryTable.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public JuryTable(List<Jury> info,String...mode){
            initComponents(info, mode);
        }
        
        private void initComponents(List<Jury> inf,String[] mode) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            juryTable = new JTable();


            //======== juryScroll ========
            {

                //---- juryTable ----
                juryTable.setModel(new DefaultTableModel(
                    (mode.length!=0)?null:listToObjects(inf),
                    new String[] {
                        "IdJury", "nom & prenom president",  "CIN de president", "grad","Fillière","Local",""
                    }
                ){
                    Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class,String.class,String.class, String.class, Object.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,  false, false,false,true
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
               
                juryTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                juryTable.setRowHeight(40);
                TableColumnModel cm = juryTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                
                cm.getColumn(6).setMaxWidth(100);
                cm.getColumn(6).setMinWidth(100);
                cm.getColumn(6).setCellRenderer(new TableActionCellRender());
                cm.getColumn(6).setCellEditor(new TableActionCellEditor(event));
                this.setViewportView(juryTable);
            }
            
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable juryTable;

        @Override
        public JTable getTable() {
            return juryTable;
        }
        
        public void populateTableWithoutAction(Object[][] data){
            ((DefaultTableModel)juryTable.getModel()).setDataVector(data, new String[]{"IdJury", "nom & prenom president",  "CIN de president", "grad","Fillière","Local",""});    
        }
        
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) juryTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        
        
        public void populateTable(Object[][] data){
            ((DefaultTableModel)juryTable.getModel()).setDataVector(data, new String[]{"IdJury", "nom & prenom president",  "CIN de president", "grad","Fillière","Local",""});    
            TableColumnModel cm = juryTable.getColumnModel();
            cm.getColumn(0).setMaxWidth(80);    
            cm.getColumn(6).setMaxWidth(100);
            cm.getColumn(6).setMinWidth(100);
            cm.getColumn(6).setCellRenderer(new TableActionCellRender());
            cm.getColumn(6).setCellEditor(new TableActionCellEditor(event));
            
        }
        
    }
    
    public static class EnseignantTable extends JScrollPane implements ComponentWithTable{
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                String idEns = ensTable.getModel().getValueAt(row, 0).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("delete from PFE where encadreur='"+idEns+"' or rapporteur='"+idEns+"'");
                    dbc.query("delete from PFE "
                            + "where idSou ="
                            + "(select idSou from Soutenance where examinateur='"+idEns+"')");
                    dbc.query("delete from Soutenance where examinateur='"+idEns+"'");
                    dbc.query("delete from PFE "
                            + "join Soutenance using (idSou) "
                            + "join Jury using (idJury) "
                            + "where president='"+idEns+"'");
                    dbc.query("delete from Soutenance "
                            + "where idJury=(select idJury from Jury"
                            + "where president='"+idEns+"')");
                    dbc.query("delete from Jury where president ='"+idEns+"'");
                }catch(Exception e){
                    System.out.println("Jury error");
                    e.printStackTrace();
                }
                if (ensTable.isEditing()) {
                    ensTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) ensTable.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        public EnseignantTable(List<Enseignant> info, String...mode) {
            initComponents(info,mode);
        }

        private void initComponents(List<Enseignant> info,String... mode) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            ensTable = new JTable();

            //======== ensScroll ========
            {
                //---- ensTable ----
                ensTable.setModel(new DefaultTableModel(
                    (mode.length!=0)?null:listToObjects(info),
                    new String[] {
                        "Cin", "Prenom", "Nom", "Photo", "Grad","Email","Tel", "peutEtrePresident", ""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class,String.class, String.class, String.class, String.class, Object.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false,true
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
                    cm.getColumn(1).setPreferredWidth(125);
                    cm.getColumn(3).setPreferredWidth(65);
                    cm.getColumn(4).setPreferredWidth(175);
                    cm.getColumn(5).setPreferredWidth(110);
                    cm.getColumn(6).setPreferredWidth(200);
                    cm.getColumn(8).setMaxWidth(100);
                    cm.getColumn(8).setMinWidth(100);
                    cm.getColumn(8).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(8).setCellEditor(new TableActionCellEditor(event));
                }
                
                ensTable.setBorder(null);
                ensTable.setFillsViewportHeight(true);
                ensTable.setRowHeight(40);
                ensTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                
                
            }
            this.setViewportView(ensTable);
            this.setViewportBorder(null);
            this.setDoubleBuffered(true);
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable ensTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

        @Override
        public JTable getTable() {
            return ensTable;
        }
        
        
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) ensTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
           ((DefaultTableModel)ensTable.getModel()).setDataVector(data, new String[]{"Cin", "Prenom", "Nom", "Photo", "Grad","Email","Tel", "peutEtrePresident", ""});
            TableColumnModel cm = ensTable.getColumnModel();
            cm.getColumn(1).setPreferredWidth(125);
            cm.getColumn(3).setPreferredWidth(65);
            cm.getColumn(4).setPreferredWidth(175);
            cm.getColumn(5).setPreferredWidth(110);
            cm.getColumn(6).setPreferredWidth(200);
            cm.getColumn(8).setMaxWidth(100);
            cm.getColumn(8).setMinWidth(100);
            cm.getColumn(8).setCellRenderer(new TableActionCellRender());
            cm.getColumn(8).setCellEditor(new TableActionCellEditor(event));
                
        }
        
        
    }
    public static class EtudiantTable extends JScrollPane implements ComponentWithTable{
        private JTable etudiantTable;
        private TableActionEvent event;
        public void setTableActionEvent(TableActionEvent e){
            event = e;
        }

        public EtudiantTable(List<Etudiant> info, String...mode) {
            initComponents(info, mode);
        }
        @Override
        public JTable getTable() {
            return etudiantTable;
        }

        private void initComponents(List<Etudiant> info, String[]mode) {
            
            etudiantTable = new JTable();


            //======== etudiantScroll ========
            {

                //---- etudiantTable ----
                etudiantTable.setModel(new DefaultTableModel(
                        (mode.length!=0)?null:listToObjects(info),
                    new String[] {
                        "Cin","Prenom","Nom","photo","Nce","Email","Tel","A un binôme",""
                        //"Cin","Prenom","Nom","Groupe et Sp\u00e9cialit\u00e9","Nce","Email","Tel","A un binôme","Projet/Stage trait\u00e9 en:","Nature du projet",""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, Object.class, Object.class, String.class, Object.class, Object.class, String.class,String.class,Object.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false, true//,false,true
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

                    TableActionEvent event = new TableActionEvent() {
                        @Override
                        public void onEdit(int row) {
                            System.out.println("Edit row : " + row);
                        }

                        @Override
                        public void onDelete(int row) {
                            
                        }

                        @Override
                        public void onView(int row) {
                            System.out.println("View row : " + row);
                        }
                    };

                    TableColumnModel cm = etudiantTable.getColumnModel();
                    cm.getColumn(1).setPreferredWidth(100);
                    cm.getColumn(2).setPreferredWidth(100);
                    cm.getColumn(8).setMinWidth(100);
                    cm.getColumn(8).setMaxWidth(100);
                    cm.getColumn(8).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(8).setCellEditor(new TableActionCellEditor(event));

                }

                etudiantTable.setBorder(null);
                etudiantTable.setFillsViewportHeight(true);
                etudiantTable.setRowHeight(40);
                etudiantTable.setCellSelectionEnabled(true);
                etudiantTable.setShowHorizontalLines(true);
                etudiantTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                this.setViewportView(etudiantTable);
            }

        }
        public void clearTable(){
            DefaultTableModel dtm = (DefaultTableModel) etudiantTable.getModel();
            int taille = dtm.getRowCount();
            System.out.println(taille);
            for(int i=0;i<taille;i++)
                dtm.removeRow(0);
        }
        public void populateTable(Object[][] data){
             ((DefaultTableModel)etudiantTable.getModel()).setDataVector(data, new String[]{"Cin","Prenom","Nom","photo","Nce","Email","Tel","A un binôme",""});
            TableColumnModel cm = etudiantTable.getColumnModel();
            cm.getColumn(1).setPreferredWidth(100);
            cm.getColumn(2).setPreferredWidth(100);
            cm.getColumn(8).setMinWidth(100);
            cm.getColumn(8).setMaxWidth(100);
            cm.getColumn(8).setCellRenderer(new TableActionCellRender());
            cm.getColumn(8).setCellEditor(new TableActionCellEditor(event));
                
        }
        
    }

}
