import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 08 12:21:27 CET 2024
 */



/**
 * @author yassine
 */
public class SoutenanceTable extends JScrollPane{
    public SoutenanceTable() {
        initComponents();
    }

    private void initComponents() {
        soutTable = new JTable();

        //======== soutScroll ========
        {

            //---- soutTable ----
            soutTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null},
                    {null, null, null, null},
                },
                new String[] {
                    "ID", "Date", "Heure", "Est Valide"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            this.setViewportView(soutTable);
        }
    }

    private JTable soutTable;
    private JButton deleteBtn,modifyBtn;
}
