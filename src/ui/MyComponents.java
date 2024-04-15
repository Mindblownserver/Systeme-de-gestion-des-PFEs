package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.*;

public class MyComponents {
    public static Font h1 = new Font("Monosans",0,24);
    public static Font h2 = new Font("Monosans",0,22);
    public static Font h3 = new Font("Monosans",0,20);    
    public static Color primaryColor= Color.WHITE;
    public static Color secondaryColor= Color.decode("#F2F2F2");
    public static Color accentNormal = Color.decode("#2c67f2");
    public static Color accentLessHue=Color.decode("#2c8ff2");
    
    private static JButton modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
    private static JButton deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));
    
    
    public static class SubmitBtn extends JButton{

    }
    public static class JTableButtonRenderer implements TableCellRenderer {
        private TableCellRenderer defaultRenderer;
        public JTableButtonRenderer(TableCellRenderer renderer) {
            defaultRenderer = renderer;
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if(value instanceof Component)
                return (Component)value;
            
            return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
    public static Object[][] listToObjects(List<? extends Object> l){
        Object[][]res=null;
        System.out.println(l.get(0) instanceof Local);
        Object o = l.get(0);
        if(o instanceof Local){
            res = new Object[l.size()][Local.getColumnCount()+2];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Local)l.get(i)).getNomSalle();
                res[i][1]= ((Local)l.get(i)).getNumSalle();
                res[i][2] = modifyBtn;
                res[i][3]= deleteBtn;
            }
        }
        else if(o instanceof Specialite){
            res = new Object[l.size()][Specialite.getColumnCount()+2];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Specialite)l.get(i)).getIdFill();
                res[i][1]= ((Specialite)l.get(i)).getFillier();
                res[i][2] = modifyBtn;
                res[i][3]= deleteBtn;
            }
        }
        else if(o instanceof Groupe){
            res = new Object[l.size()][Groupe.getColumnCount()+2];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((Groupe)l.get(i)).getIdGr();
                res[i][1]= ((Groupe)l.get(i)).getLibelle();
                res[i][2] = ((Groupe)l.get(i)).getSpecialite().getIdFill();
                res[i][3] = ((Groupe)l.get(i)).getSpecialite().getFillier();
                res[i][4] = modifyBtn;
                res[i][5]= deleteBtn;
            }
        }
        else if(o instanceof OrganismeExt){
            res = new Object[l.size()][OrganismeExt.getColumnCount()+2];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((OrganismeExt)l.get(i)).getIdSc();
                res[i][1]= ((OrganismeExt)l.get(i)).getNomSc();
                res[i][2] = ((OrganismeExt)l.get(i)).getDomAct();
                res[i][3] = ((OrganismeExt)l.get(i)).getAdress();
                res[i][4] = modifyBtn;
                res[i][5]= deleteBtn;
            }
        }
        
        return res;
    }
    public static class MyHeaderRenderer extends JLabel implements TableCellRenderer {
 
        public MyHeaderRenderer() {
            setFont(new Font("Monosans",1,18));
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
// Tables
    public static class SpTable extends JScrollPane {
        public SpTable(List<? extends ColumnNames>l){
            initComponents(l);
        }

        private void initComponents(List<? extends ColumnNames>l) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            spTable = new JTable();
            modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
            deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));
            Object[][] data = listToObjects(l);

            //======== spScroll ========
            {

                //---- spTable ----
                spTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "ID", "Filli\u00e8re","",""
                    }
                ){
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    };
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, JButton.class, JButton.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }

                });
                this.setViewportView(spTable);
                TableCellRenderer tableRenderer = spTable.getDefaultRenderer(JButton.class);
                spTable.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
                spTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                spTable.setRowHeight(40);
                TableColumnModel cm = spTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(2).setMaxWidth(80);
                cm.getColumn(3).setMaxWidth(80);
                spTable.setShowVerticalLines(true);
                spTable.setShowHorizontalLines(true);

            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        private JTable spTable;
        private JButton modifyBtn,deleteBtn;
    }
    public static class PFETable  extends JScrollPane{
        public PFETable(){
            initComponents();
        }
        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            pfeTable = new JTable();
            modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
            deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));

            //======== pfeScroll ========
            {

                //---- pfeTable ----
                pfeTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, "", "", null, null, null, null, null,modifyBtn,deleteBtn},
                        {null, null, null, null, null, null, null, null, null, null, null,  null,modifyBtn,deleteBtn},
                    },
                    new String[] {
                        "ID ", "Ann\u00e9e", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage","",""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, Object.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class,JButton.class,JButton.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false, false, false, false, false, false, false,
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
                    cm.getColumn(12).setMaxWidth(80);
                    cm.getColumn(13).setMaxWidth(80);
                    TableCellRenderer tableRenderer = pfeTable.getDefaultRenderer(JButton.class);
                    pfeTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
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
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable pfeTable;
        private JButton modifyBtn,deleteBtn;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class SoutenanceTable extends JScrollPane{
        public SoutenanceTable() {
            initComponents();
        }

        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            soutTable = new JTable();
            

            //======== soutScroll ========
            {

                //---- soutTable ----
                soutTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null,"","",modifyBtn,deleteBtn},
                        {null, null, null, null,"","",modifyBtn,deleteBtn},
                    },
                    new String[] {
                        "ID", "Date", "Heure", "Est Valide", "CIN examinateur", "Nom & prenom examinateur","",""
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false,false,false,false,false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class,String.class,String.class,JButton.class, JButton.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                TableCellRenderer tableRenderer = soutTable.getDefaultRenderer(JButton.class);
                soutTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
                soutTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                soutTable.setRowHeight(40);
                this.setViewportView(soutTable);
                TableColumnModel cm = soutTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(1).setMaxWidth(100);
                cm.getColumn(2).setMaxWidth(100);
                cm.getColumn(3).setMinWidth(150);
                cm.getColumn(3).setMaxWidth(150);
                cm.getColumn(6).setMaxWidth(80);
                cm.getColumn(7).setMaxWidth(80);        
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable soutTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class SoutenanceTableSansModSupp extends JScrollPane{
        public SoutenanceTableSansModSupp() {
            initComponents();
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable soutTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class OrganismeTable extends JScrollPane{
        public OrganismeTable(List<? extends ColumnNames>l) {
            initComponents(l);
        }

        private void initComponents(List<? extends ColumnNames> l) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            orgTable = new JTable();
            Object[][] data = listToObjects(l);
            //======== orgScroll ========
            {

                //---- orgTable ----
                orgTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "ID org", "Nom societ\u00e9", "Domaine d'activit\u00e9","Address", "", ""
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,false,false,false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    };
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class, JButton.class, JButton.class
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
                    cm.getColumn(4).setMaxWidth(40);
                    cm.getColumn(5).setMaxWidth(40);
                    TableCellRenderer tableRenderer = orgTable.getDefaultRenderer(JButton.class);
                    orgTable.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
                    orgTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                    orgTable.setRowHeight(40);
                }
                this.setViewportView(orgTable);
                orgTable.setShowGrid(true);

            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable orgTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class GroupeTable  extends JScrollPane{
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
                        "ID Groupe", "Libelle", "ID Filliere", "Filliere", "", ""
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, String.class, JButton.class, JButton.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false
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
                    cm.getColumn(4).setMaxWidth(80);
                    cm.getColumn(5).setMaxWidth(80);
                }
                TableCellRenderer tableRenderer = groupeTable.getDefaultRenderer(JButton.class);
                groupeTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
                groupeTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                groupeTable.setShowGrid(true);
                groupeTable.setBorder(null);
                groupeTable.setFillsViewportHeight(true);
                
                groupeTable.setRowHeight(40);
                groupeTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                this.setViewportView(groupeTable);
                this.setBounds(0,0,900,800);
                groupeTable.setBounds(0,0,900,800);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable groupeTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class LocalTable extends JScrollPane{
        public LocalTable(List<? extends ColumnNames> l) {
            initComponents(l);
        }

        private void initComponents(List<? extends ColumnNames> l) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            locTable = new JTable();
            Object[][] data = listToObjects(l);
            System.out.println(data);
            //======== locScroll ========
            {

                //---- locTable ----
                locTable.setModel(new DefaultTableModel(
                    data,
                    new String[] {
                        "Nom Local", "Num Local", "", ""
                    }
                    ){
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, JButton.class, JButton.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false,  false, false
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
                    TableCellRenderer tableRenderer = locTable.getDefaultRenderer(JButton.class);
                    locTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
                    locTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                    TableColumnModel cm = locTable.getColumnModel();
                    
                    cm.getColumn(0).setMaxWidth(150);
                    cm.getColumn(0).setMinWidth(150);
                    cm.getColumn(2).setMaxWidth(80);
                    cm.getColumn(3).setMaxWidth(80);
                    locTable.setRowHeight(40);
                }
                this.setViewportView(locTable);
                locTable.setShowVerticalLines(true);
                locTable.setShowHorizontalLines(true);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable locTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class EncadreurExterieurTable extends JScrollPane{
        public EncadreurExterieurTable(){
            initComponents();
        }
        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            encExtTable = new JTable();
            modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
            deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));

            //======== encExtScroll ========
            {

                //---- encExtTable ----
                encExtTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, "", null, null,modifyBtn, deleteBtn},
                        {null, null, null, null, null, null,modifyBtn, deleteBtn},
                    },
                    new String[] {
                        "CIN", "Prenom", "Nom", "Email", "Tel", "Post","",""
                    }
                ){
                    Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class,String.class,String.class,String.class, JButton.class, JButton.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,  false, false
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
                TableCellRenderer tableRenderer = encExtTable.getDefaultRenderer(JButton.class);
                encExtTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
                encExtTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                encExtTable.setRowHeight(40);
                TableColumnModel cm = encExtTable.getColumnModel();
                cm.getColumn(6).setMaxWidth(80);
                cm.getColumn(7).setMaxWidth(80);
                this.setViewportView(encExtTable);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable encExtTable;
        private JButton deleteBtn;
        private JButton modifyBtn;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class JuryTable extends JScrollPane{
        public JuryTable(){
            initComponents();
        }
        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            juryTable = new JTable();
            modifyBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
            deleteBtn = new JButton(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));

            //======== encExtScroll ========
            {

                //---- encExtTable ----
                juryTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, "", null,modifyBtn, deleteBtn},
                        {null, null, null, null, null,modifyBtn, deleteBtn},
                    },
                    new String[] {
                        "ID", "Local", "Fillière", "CIN de president", "nom & prenom president", "",""
                    }
                ){
                    Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class,String.class,String.class, JButton.class, JButton.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false,  false, false,false,false
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
                TableCellRenderer tableRenderer = juryTable.getDefaultRenderer(JButton.class);
                juryTable.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
                juryTable.getTableHeader().setDefaultRenderer( new MyHeaderRenderer());
                juryTable.setRowHeight(40);
                TableColumnModel cm = juryTable.getColumnModel();
                cm.getColumn(0).setMaxWidth(80);
                cm.getColumn(1).setMaxWidth(120);
                cm.getColumn(6).setMaxWidth(80);
                cm.getColumn(5).setMaxWidth(80);
                this.setViewportView(juryTable);
            }
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable juryTable;
        private JButton deleteBtn;
        private JButton modifyBtn;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
}

//
//            Component res; 
//            res=(Component)value;
//            res.setFont(h1);