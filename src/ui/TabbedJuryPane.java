import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 08 13:14:31 CET 2024
 */



/**
 * @author yassine
 */
public class TabbedJuryPane {
    public TabbedJuryPane() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane = new JTabbedPane();
        presPanel = new JPanel();
        ensScroll = new JScrollPane();
        presTable = new JTable();
        examPanel = new JPanel();
        ensScroll6 = new JScrollPane();
        examTable = new JTable();
        encPanel = new JPanel();
        ensScroll5 = new JScrollPane();
        encTable = new JTable();
        rappPanel = new JPanel();
        ensScroll4 = new JScrollPane();
        rappTable = new JTable();
        encExtPanel = new JPanel();
        ensScroll7 = new JScrollPane();
        encExtTable = new JTable();

        //======== tabbedPane ========
        {

            //======== presPanel ========
            {
                presPanel.setLayout(new BorderLayout());

                //======== ensScroll ========
                {

                    //---- presTable ----
                    presTable.setModel(new DefaultTableModel(
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
                        TableColumnModel cm = presTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    presTable.setGridColor(Color.black);
                    presTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    presTable.setBorder(null);
                    presTable.setFillsViewportHeight(true);
                    presTable.setRowHeight(40);
                    presTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll.setViewportView(presTable);
                }
                presPanel.add(ensScroll, BorderLayout.CENTER);
            }
            tabbedPane.addTab("President", presPanel);

            //======== examPanel ========
            {
                examPanel.setLayout(new BorderLayout());

                //======== ensScroll6 ========
                {

                    //---- examTable ----
                    examTable.setModel(new DefaultTableModel(
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
                        TableColumnModel cm = examTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    examTable.setGridColor(Color.black);
                    examTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    examTable.setBorder(null);
                    examTable.setFillsViewportHeight(true);
                    examTable.setRowHeight(40);
                    examTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll6.setViewportView(examTable);
                }
                examPanel.add(ensScroll6, BorderLayout.CENTER);
            }
            tabbedPane.addTab("Examinateur", examPanel);

            //======== encPanel ========
            {
                encPanel.setLayout(new BorderLayout());

                //======== ensScroll5 ========
                {

                    //---- encTable ----
                    encTable.setModel(new DefaultTableModel(
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
                        TableColumnModel cm = encTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    encTable.setGridColor(Color.black);
                    encTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    encTable.setBorder(null);
                    encTable.setFillsViewportHeight(true);
                    encTable.setRowHeight(40);
                    encTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll5.setViewportView(encTable);
                }
                encPanel.add(ensScroll5, BorderLayout.CENTER);
            }
            tabbedPane.addTab("Encadreur Interne", encPanel);

            //======== rappPanel ========
            {
                rappPanel.setLayout(new BorderLayout());

                //======== ensScroll4 ========
                {

                    //---- rappTable ----
                    rappTable.setModel(new DefaultTableModel(
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
                        TableColumnModel cm = rappTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    rappTable.setGridColor(Color.black);
                    rappTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    rappTable.setBorder(null);
                    rappTable.setFillsViewportHeight(true);
                    rappTable.setRowHeight(40);
                    rappTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll4.setViewportView(rappTable);
                }
                rappPanel.add(ensScroll4, BorderLayout.CENTER);
            }
            tabbedPane.addTab("Rapporteur", rappPanel);

            //======== encExtPanel ========
            {
                encExtPanel.setLayout(new BorderLayout());

                //======== ensScroll7 ========
                {

                    //---- encExtTable ----
                    encExtTable.setModel(new DefaultTableModel(
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
                        TableColumnModel cm = encExtTable.getColumnModel();
                        cm.getColumn(2).setPreferredWidth(125);
                        cm.getColumn(3).setPreferredWidth(65);
                        cm.getColumn(4).setPreferredWidth(175);
                        cm.getColumn(5).setPreferredWidth(110);
                    }
                    encExtTable.setGridColor(Color.black);
                    encExtTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    encExtTable.setBorder(null);
                    encExtTable.setFillsViewportHeight(true);
                    encExtTable.setRowHeight(40);
                    encExtTable.setPreferredSize(new Dimension(775, 80));
                    ensScroll7.setViewportView(encExtTable);
                }
                encExtPanel.add(ensScroll7, BorderLayout.CENTER);
            }
            tabbedPane.addTab("Encadreur Exterieur", encExtPanel);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane;
    private JPanel presPanel;
    private JScrollPane ensScroll;
    private JTable presTable;
    private JPanel examPanel;
    private JScrollPane ensScroll6;
    private JTable examTable;
    private JPanel encPanel;
    private JScrollPane ensScroll5;
    private JTable encTable;
    private JPanel rappPanel;
    private JScrollPane ensScroll4;
    private JTable rappTable;
    private JPanel encExtPanel;
    private JScrollPane ensScroll7;
    private JTable encExtTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
