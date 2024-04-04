/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class ViewEnseignantPanel extends javax.swing.JPanel {
    private JTabbedPane addtionalInfo;
    private JLabel title = new JLabel("Consulter enseignant");
    private JPanel pfeEncadre;
    private JPanel pfeRapporte;
    private JPanel this2;
    private JPanel panel1;
    private JLabel titreAjout;
    private JLabel cin;
    private JTextField cinField;
    private JLabel prenom;
    private JTextField prenomField;
    private JLabel nom;
    private JTextField nomField;
    private JLabel grad;
    private JTextField gradField;
    private JLabel label7;
    private JTextField themeField;
    private JLabel label8;
    private JCheckBox presidentCheckBox;
    private JButton AjouterBtn;
    private JLayeredPane lpane;
    private JPanel buttonPanel;
    private JButton toggleAjouterPanelBtn;
    private JScrollPane scrollPane1;
    private JTable table1;
    private boolean estVisible = false;
    public ViewEnseignantPanel() {
        init();
    }
    public void init(){
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        addtionalInfo = new JTabbedPane();
        pfeEncadre = new JPanel();
        pfeRapporte = new JPanel();
        panel1 = new JPanel();
        this2 = new JPanel();
        titreAjout = new JLabel();
        cin = new JLabel();
        cinField = new JTextField();
        prenom = new JLabel();
        prenomField = new JTextField();
        nom = new JLabel();
        nomField = new JTextField();
        grad = new JLabel();
        gradField = new JTextField();
        label7 = new JLabel();
        themeField = new JTextField();
        label8 = new JLabel();
        presidentCheckBox = new JCheckBox();
        AjouterBtn = new JButton();
        lpane = new JLayeredPane();
        buttonPanel = new JPanel();
        toggleAjouterPanelBtn = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        

        //======== this ========
        setLayout(new BorderLayout());

        //======== addtionalInfo ========
        {
                addtionalInfo.setPreferredSize(new Dimension(224, 500));

                //======== pfeEncadre ========
                {
                        pfeEncadre.setLayout(new BorderLayout());
                }
                addtionalInfo.addTab("PFE encadr\u00e9 (n)", pfeEncadre);

                //======== pfeRapporte ========
                {
                        pfeRapporte.setLayout(new BorderLayout());
                }
                addtionalInfo.addTab("PFE rapport\u00e9 (n)", pfeRapporte);
        }
        add(addtionalInfo, BorderLayout.SOUTH);

        //======== this2 ========
        {
                this2.setBackground(Color.white);
                this2.setLayout(new BorderLayout());

                //======== panel1 ========
                {
                        panel1.setPreferredSize(new Dimension(500, 0));
                        panel1.setBackground(Color.white);
                        panel1.setBorder(LineBorder.createBlackLineBorder());
                        panel1.setVisible(estVisible);
                        panel1.setLayout(new MigLayout(
                                "insets 50 4 50 0,hidemode 3,alignx center",
                                // columns
                                "[80,fill]" +
                                "[97,fill]",
                                // rows
                                "[40,shrink 0,top]" +
                                "[42]0" +
                                "[32]" +
                                "[42]0" +
                                "[32,fill]" +
                                "[41]" +
                                "[32]" +
                                "[42]" +
                                "[32]" +
                                "[41]" +
                                "[32]" +
                                "[42]0" +
                                "[13,fill]" +
                                "[32]" +
                                "[]" +
                                "[]"));

                        //---- titreAjout ----
                        titreAjout.setText("Ajouter enseignant");
                        titreAjout.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
                        panel1.add(titreAjout, "cell 0 0 2 1,height 100:100:100");

                        //---- cin ----
                        cin.setText("cin ");
                        cin.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
                        panel1.add(cin, "cell 0 1");
                        panel1.add(cinField, "cell 0 2, width 50px");

                        //---- prenom ----
                        prenom.setText("Prenom");
                        panel1.add(prenom, "cell 0 3");
                        panel1.add(prenomField, "cell 0 4 2 1, width 200px");

                        //---- nom ----
                        nom.setText("Nom");
                        panel1.add(nom, "cell 0 5");
                        panel1.add(nomField, "cell 0 6 2 1, width 200px");

                        //---- grad ----
                        grad.setText("grad");
                        panel1.add(grad, "cell 0 7");
                        panel1.add(gradField, "cell 0 8, width 50px");

                        //---- label7 ----
                        label7.setText("theme");
                        panel1.add(label7, "cell 0 9");
                        panel1.add(themeField, "cell 0 10 2 1, width 200px");

                        //---- label8 ----
                        label8.setText("Peut \u00eatre president?");
                        panel1.add(label8, "cell 0 11 2 1");
                        panel1.add(presidentCheckBox, "cell 0 12");

                        //---- AjouterBtn ----
                        AjouterBtn.setText("Ajouter enseignant");
                        panel1.add(AjouterBtn, "cell 0 14 2 1");
                }
                this2.add(panel1, BorderLayout.EAST);

                //======== lpane ========
                {

                        //======== buttonPanel ========
                        {
                                title.setFont(MyComponents.h1);
                                title.setBounds(10,10,400,60);
                                buttonPanel.setBackground(Color.white);
                                buttonPanel.setLayout(null);
                                buttonPanel.add(title);
                                //---- toggleAjouterPanelBtn ----
                                toggleAjouterPanelBtn.setText("Ajouter");
                                buttonPanel.add(toggleAjouterPanelBtn);
                                toggleAjouterPanelBtn.setBounds(new Rectangle(new Point(1100, 55), toggleAjouterPanelBtn.getPreferredSize()));
                                toggleAjouterPanelBtn.addActionListener(l->{
                                    estVisible = !estVisible;
                                    panel1.setVisible(estVisible);
                                });

                                {
                                        // compute preferred size
                                        Dimension preferredSize = new Dimension();
                                        for(int i = 0; i < buttonPanel.getComponentCount(); i++) {
                                                Rectangle bounds = buttonPanel.getComponent(i).getBounds();
                                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                                        }
                                        Insets insets = buttonPanel.getInsets();
                                        preferredSize.width += insets.right;
                                        preferredSize.height += insets.bottom;
                                        buttonPanel.setMinimumSize(preferredSize);
                                        buttonPanel.setPreferredSize(preferredSize);
                                }
                        }
                        lpane.add(buttonPanel, JLayeredPane.DEFAULT_LAYER);
                        buttonPanel.setBounds(new Rectangle(new Point(0, 0), buttonPanel.getPreferredSize()));

                        //======== scrollPane1 ========
                        {
                                scrollPane1.setBackground(Color.orange);
                                scrollPane1.setViewportBorder(null);
                                scrollPane1.setDoubleBuffered(true);
                                scrollPane1.setBorder(null);
                                scrollPane1.setOpaque(true);

                                //---- table1 ----
                                table1.setModel(new DefaultTableModel(
                                        new Object[][] {
                                                {null, null, null, null, "", null, null, null},
                                                {null, null, null, null, null, null, null, null},
                                        },
                                        new String[] {
                                                "Prenom", "Nom", "cin", "grad", "theme", "peutEtrePresident", "Modifier", "Supprimer"
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
                                        TableColumnModel cm = table1.getColumnModel();
                                        cm.getColumn(1).setPreferredWidth(125);
                                        cm.getColumn(3).setPreferredWidth(65);
                                        cm.getColumn(4).setPreferredWidth(175);
                                        cm.getColumn(5).setPreferredWidth(110);
                                }
                                table1.setGridColor(Color.black);
                                table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                                table1.setBorder(null);
                                table1.setFillsViewportHeight(true);
                                table1.setRowHeight(40);
                                table1.setPreferredSize(new Dimension(900, 80));
                                scrollPane1.setViewportView(table1);
                        }
                        lpane.add(scrollPane1, JLayeredPane.DEFAULT_LAYER);
                        scrollPane1.setBounds(0, 79, 1200, 525);
                }
                this2.add(lpane, BorderLayout.CENTER);
        }
        add(this2, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
