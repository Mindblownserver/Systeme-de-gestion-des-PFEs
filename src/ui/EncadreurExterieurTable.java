import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 08 13:28:56 CET 2024
 */



/**
 * @author yassine
 */
public class EncadreurExterieurTable extends JScrollPane{

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        encExtTable = new JTable();

        //======== encExtScroll ========
        {

            //---- encExtTable ----
            encExtTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, "", null, null},
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "CIN", "Prenom", "Nom", "Email", "Tel", "Post"
                }
            ));
            this.setViewportView(encExtTable);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTable encExtTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
