package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.border.EmptyBorder;
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
        else if(o instanceof EncadreurExt){
            res = new Object[l.size()][9];
            for(int i=0;i<l.size();i++){
                res[i][0]= ((EncadreurExt)l.get(i)).getCin();
                res[i][1]= ((EncadreurExt)l.get(i)).getPrenom();
                res[i][2] = ((EncadreurExt)l.get(i)).getNom();
                res[i][3] = ((EncadreurExt)l.get(i)).getEmail();
                res[i][4]= ((EncadreurExt)l.get(i)).getTel();
                res[i][5] = ((EncadreurExt)l.get(i)).getPoste();
                res[i][6]= ((EncadreurExt)l.get(i)).getSociete().getIdSc();
                res[i][7] = modifyBtn;
                res[i][8]= deleteBtn;
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
    
    public static class SubmitBtn extends JButton{

    }
//    public static class JTableButtonRenderer implements TableCellRenderer {
//        private TableCellRenderer defaultRenderer;
//        public JTableButtonRenderer(TableCellRenderer renderer) {
//            defaultRenderer = renderer;
//        }
//        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//            Component rowRenderer = defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//            if(value instanceof Component)
//                return (Component)value;
//            
//            return null;
//        }
//    }
//    
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
        public SpTable(List<? extends ColumnNames>l){
            initComponents(l);
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
        }

        public JTable getTable() {
            return spTable;
        }

        public void setTable(JTable spTable) {
            this.spTable = spTable;
        }
        

        private void initComponents(List<? extends ColumnNames>l) {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
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
                TableActionEvent event = new TableActionEvent() {
                    @Override
                    public void onEdit(int row) {
                        System.out.println("Edit row : " + row);
                    }

                    @Override
                    public void onDelete(int row) {
                        System.out.println("Delete row : " + row);
                    }

                    @Override
                    public void onView(int row) {
                        System.out.println("View row : " + row);
                    }
                };
                this.setViewportView(spTable);
//                TableCellRenderer tableRenderer = spTable.getDefaultRenderer(JButton.class);
//                spTable.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        private JTable spTable;
    }
    public static class PFETable  extends JScrollPane{
        public PFETable(){
            initComponents();
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
        }
        private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
            pfeTable = new JTable();
            

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
//                    TableCellRenderer tableRenderer = pfeTable.getDefaultRenderer(JButton.class);
//                    pfeTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
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
//                TableCellRenderer tableRenderer = soutTable.getDefaultRenderer(JButton.class);
//                soutTable.setDefaultRenderer(deleteBtn.getClass(), new MyComponents.JTableButtonRenderer(tableRenderer));
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
    public static class SoutenanceTableSansModSupp extends JScrollPane implements ComponentWithTable{
        public SoutenanceTableSansModSupp() {
            initComponents();
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable soutTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class OrganismeTable extends JScrollPane implements ComponentWithTable{
        public OrganismeTable(List<? extends ColumnNames>l) {
            initComponents(l);
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
        }
        public JTable getTable() {
            return orgTable;
        }

        public void setTable(JTable orgTable) {
            this.orgTable = orgTable;
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
                TableActionEvent event = new TableActionEvent() {
                    @Override
                    public void onEdit(int row) {
                        System.out.println("Edit row : " + row);
                    }

                    @Override
                    public void onDelete(int row) {
                        System.out.println("Delete row : " + row);
                    }

                    @Override
                    public void onView(int row) {
                        System.out.println("View row : " + row);
                    }
                };
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable orgTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class GroupeTable  extends JScrollPane implements ComponentWithTable{
        private JTable groupeTable;
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
                //setup event
                TableActionEvent groupeEvent = new TableActionEvent() {
                    @Override
                    public void onEdit(int row) {
                        System.out.println("Edit row : " + row);
                    }

                    @Override
                    public void onDelete(int row) {
                        System.out.println("Delete row : " + row);
                    }

                    @Override
                    public void onView(int row) {
                        System.out.println("View row : " + row);
                    }
                };
                
                {
                    TableColumnModel cm = groupeTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(120);
                    cm.getColumn(2).setMinWidth(120);
                    cm.getColumn(0).setMaxWidth(120);
                    cm.getColumn(2).setMaxWidth(120);
                    cm.getColumn(3).setPreferredWidth(200);
                    cm.getColumn(4).setCellRenderer(new TableActionCellRender());
                    cm.getColumn(4).setCellEditor(new TableActionCellEditor(groupeEvent));
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }
        
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
        }
        public JTable getTable() {
            return groupeTable;
        }

        public void setTable(JTable groupeTable) {
            this.groupeTable = groupeTable;
        }


    }
    public static class LocalTable extends JScrollPane implements ComponentWithTable{
        public LocalTable(List<? extends ColumnNames> l) {
            initComponents(l);
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
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
                    TableActionEvent event = new TableActionEvent() {
                        @Override
                        public void onEdit(int row) {
                            System.out.println("Edit row : " + row);
                        }

                        @Override
                        public void onDelete(int row) {
                            System.out.println("Delete row : " + row);
                        }

                        @Override
                        public void onView(int row) {
                            System.out.println("View row : " + row);
                        }
                    };
                    
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
        
        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable locTable;
        // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    }
    public static class EncadreurExterieurTable extends JScrollPane implements ComponentWithTable{
        public EncadreurExterieurTable(List<? extends ColumnNames> info){
            initComponents(info);
        }
        public JButton getEditBtn(){
            return modifyBtn;
        }
        public JButton getDeleteBtn(){
            return deleteBtn;
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
                TableActionEvent event = new TableActionEvent() {
                    @Override
                    public void onEdit(int row) {
                        System.out.println("Edit row : " + row);
                    }

                    @Override
                    public void onDelete(int row) {
                        System.out.println("Delete row : " + row);
                    }

                    @Override
                    public void onView(int row) {
                        System.out.println("View row : " + row);
                    }
                };
                
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
            // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        }

        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
        private JTable encExtTable;
        
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
//                TableCellRenderer tableRenderer = juryTable.getDefaultRenderer(JButton.class);
//                juryTable.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
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