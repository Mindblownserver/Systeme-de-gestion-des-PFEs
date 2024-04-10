import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 16:04:01 CET 2024
 */



/**
 * @author yassine
 */
public class AjouterJuryDialogue extends JDialog {
    public AjouterJuryDialogue(Window owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        content = new JPanel();
        label2 = new JLabel();
        idField = new JTextField();
        label3 = new JLabel();
        localCB = new JComboBox();
        label4 = new JLabel();
        filliereCB = new JComboBox();
        label5 = new JLabel();
        ensScroll = new JScrollPane();
        ensTable = new JTable();
        button1 = new JButton();

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
                "insets 0,hidemode 3,gap 0 0",
                // columns
                "[11,fill]" +
                "[57,fill]" +
                "[118,fill]" +
                "[0,fill]" +
                "[grow,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[32,center]" +
                "[12,center]" +
                "[32,center]" +
                "[13,center]" +
                "[32,fill]" +
                "[13]" +
                "[32,grow]" +
                "[]" +
                "[32]" +
                "[]"));

            //---- label2 ----
            label2.setText("Id jury");
            content.add(label2, "cell 1 1");
            content.add(idField, "cell 2 1,growy");

            //---- label3 ----
            label3.setText("Local");
            content.add(label3, "cell 1 3");
            content.add(localCB, "cell 2 3,growy");

            //---- label4 ----
            label4.setText("Filli\u00e8re");
            content.add(label4, "cell 1 5");
            content.add(filliereCB, "cell 2 5");

            //---- label5 ----
            label5.setText("President");
            content.add(label5, "cell 1 7,aligny top,growy 0");

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
            content.add(ensScroll, "cell 2 7 3 1");

            //---- button1 ----
            button1.setText("Ajouter");
            content.add(button1, "cell 1 9");
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
    private JScrollPane ensScroll;
    private JTable ensTable;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
