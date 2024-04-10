import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 08 15:38:19 CET 2024
 */



/**
 * @author yassine
 */
public class LeftAdditionalInfoJury extends JPanel {
    public LeftAdditionalInfoJury() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        GRID = new JPanel();
        soutPanel = new JPanel();
        label2 = new JLabel();
        soutScroll = new JScrollPane();
        soutTable = new JTable();
        pfePanel = new JPanel();
        label3 = new JLabel();
        pfeScroll = new JScrollPane();
        pfeTable = new JTable();

        //======== this ========
        setLayout(new BorderLayout(10, 10));

        //---- label1 ----
        label1.setText("Plus d'informations");
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        add(label1, BorderLayout.NORTH);

        //======== GRID ========
        {
            GRID.setLayout(new GridLayout(2, 1, 0, 5));

            //======== soutPanel ========
            {
                soutPanel.setLayout(new BorderLayout());

                //---- label2 ----
                label2.setText("Soutenance");
                label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                soutPanel.add(label2, BorderLayout.NORTH);

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
                    soutScroll.setViewportView(soutTable);
                }
                soutPanel.add(soutScroll, BorderLayout.CENTER);
            }
            GRID.add(soutPanel);

            //======== pfePanel ========
            {
                pfePanel.setLayout(new BorderLayout());

                //---- label3 ----
                label3.setText("PFE");
                label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                pfePanel.add(label3, BorderLayout.NORTH);

                //======== pfeScroll ========
                {

                    //---- pfeTable ----
                    pfeTable.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, "", "", null, null, null, null, null, null, null},
                            {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        },
                        new String[] {
                            "ID ", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage", "Modifier", "Supprimer"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false, false, false, false, false, false, false, true, true
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
                        cm.getColumn(1).setPreferredWidth(80);
                        cm.getColumn(2).setPreferredWidth(90);
                        cm.getColumn(3).setPreferredWidth(125);
                        cm.getColumn(4).setPreferredWidth(85);
                        cm.getColumn(5).setPreferredWidth(60);
                        cm.getColumn(6).setPreferredWidth(70);
                        cm.getColumn(7).setPreferredWidth(70);
                        cm.getColumn(8).setPreferredWidth(150);
                        cm.getColumn(9).setPreferredWidth(70);
                        cm.getColumn(10).setPreferredWidth(90);
                    }
                    pfeTable.setGridColor(Color.black);
                    pfeTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    pfeTable.setBorder(null);
                    pfeTable.setFillsViewportHeight(true);
                    pfeScroll.setViewportView(pfeTable);
                }
                pfePanel.add(pfeScroll, BorderLayout.CENTER);
            }
            GRID.add(pfePanel);
        }
        add(GRID, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JPanel GRID;
    private JPanel soutPanel;
    private JLabel label2;
    private JScrollPane soutScroll;
    private JTable soutTable;
    private JPanel pfePanel;
    private JLabel label3;
    private JScrollPane pfeScroll;
    private JTable pfeTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
