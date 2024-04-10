import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 15:34:32 CET 2024
 */



/**
 * @author yassine
 */
public class AjouterSoutenance extends JDialog {
    public AjouterSoutenance() {
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
        ensScroll = new JScrollPane();
        ensTable = new JTable();
        label6 = new JLabel();
        juryScroll = new JScrollPane();
        juryTable = new JTable();
        estValidChB = new JCheckBox();
        button1 = new JButton();

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
            "[32,grow]" +
            "[32,grow]" +
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

        //======== ensScroll ========
        {

            //---- ensTable ----
            ensTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, "", null, null, null},
                    {null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "cin", "Prenom", "Nom", "grad", "theme", "peutEtrePresident", "Modifier", "Supprimer"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false, false
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
                cm.getColumn(2).setPreferredWidth(125);
                cm.getColumn(3).setPreferredWidth(65);
                cm.getColumn(4).setPreferredWidth(175);
                cm.getColumn(5).setPreferredWidth(110);
            }
            ensTable.setGridColor(Color.black);
            ensTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            ensTable.setBorder(null);
            ensTable.setFillsViewportHeight(true);
            ensTable.setRowHeight(40);
            ensTable.setPreferredSize(new Dimension(775, 80));
            ensScroll.setViewportView(ensTable);
        }
        contentPane.add(ensScroll, "cell 1 4 3 1");

        //---- label6 ----
        label6.setText("Jury");
        contentPane.add(label6, "cell 0 5,aligny top,growy 0");

        //======== juryScroll ========
        {

            //---- juryTable ----
            juryTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                    {null, null, null},
                },
                new String[] {
                    "ID", "Local", "Filli\u00e8re"
                }
            ));
            juryScroll.setViewportView(juryTable);
        }
        contentPane.add(juryScroll, "cell 1 5 3 1");

        //---- estValidChB ----
        estValidChB.setText("Est Valide");
        contentPane.add(estValidChB, "cell 0 6");

        //---- button1 ----
        button1.setText("Ajouter");
        contentPane.add(button1, "cell 0 8,growy");
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
    private JScrollPane ensScroll;
    private JTable ensTable;
    private JLabel label6;
    private JScrollPane juryScroll;
    private JTable juryTable;
    private JCheckBox estValidChB;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
