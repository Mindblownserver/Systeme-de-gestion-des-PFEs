import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 08 13:13:55 CET 2024
 */



/**
 * @author yassine
 */
public class JuryTable extends JScrollPane {
    public JuryTable() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        table1 = new JTable();

        //======== this ========

        //---- table1 ----
        table1.setModel(new DefaultTableModel(
            new Object[][] {
                {null, null, null},
                {null, null, null},
            },
            new String[] {
                "ID", "Local", "Filli\u00e8re"
            }
        ));
        setViewportView(table1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
