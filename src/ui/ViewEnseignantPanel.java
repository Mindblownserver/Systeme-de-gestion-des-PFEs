/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class ViewEnseignantPanel extends javax.swing.JPanel {
    private JTabbedPane additionalInfo;
    private JPanel titlePanel = new JPanel();
    private JButton modifyBtn=new JButton();
    private JButton deleteBtn = new JButton();
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
    private JButton toggleAjouterPanelBtn;
    private JScrollPane scrollPane1;
    private JTable table1;
    private boolean estVisible = false;
    
    public ViewEnseignantPanel() {
        init();
    }
    public void init(){
        // JFormDesigner - Component initialization - DO NOT MODIFY                                            
        additionalInfo = new JTabbedPane();
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
        toggleAjouterPanelBtn = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        JLabel title= new JLabel();
        JButton searchBtn= new JButton(),ajouterBtn=new JButton();
        JTextField searchBar= new JTextField();
        JComboBox critereCB= new JComboBox<>();
        JPanel eastBorder = new JPanel();
        
        deleteBtn.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));
        //deleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        modifyBtn.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));
        //modifyBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //======== this ========
        setLayout(new BorderLayout(0,10));

        //======== additionalInfo ========
        {
                additionalInfo.setPreferredSize(new Dimension(224, 380));

                //======== pfeEncadre ========
                {
                        pfeEncadre.setLayout(new BorderLayout());
                }
                additionalInfo.addTab("PFE encadr\u00e9 (n)", pfeEncadre);

                //======== pfeRapporte ========
                {
                        pfeRapporte.setLayout(new BorderLayout());
                }
                additionalInfo.addTab("PFE rapport\u00e9 (n)", pfeRapporte);
        }
        add(additionalInfo, BorderLayout.SOUTH);

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
                                "insets 0 4 50 0,hidemode 3,alignx center",
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

                        //======== titlePanel ========
                        {
                                titlePanel.setBackground(Color.white);
                                titlePanel.setPreferredSize(new Dimension(75, 150));
                                titlePanel.setLayout(new MigLayout(
                                    "insets 20 10 0 0, hidemode 3",
                                    // columns
                                    "[169,fill]" +
                                    "[74,fill]" +
                                    "[70,fill]",
                                    // rows
                                    "[30]" +
                                    "[30]" +
                                    "[32]"));

                                //---- title ----
                                title.setText("Consulter enseignant");
                                title.setFont(new Font("SansSerif", Font.BOLD, 24));
                                titlePanel.add(title, "cell 0 0");
                                titlePanel.add(searchBar, "cell 0 1,grow");
                                titlePanel.add(critereCB, "cell 1 1,growy");

                                //---- chercherBtn ----
                                searchBtn.setText("Chercher");
                                titlePanel.add(searchBtn, "cell 2 1,growy");

                                //---- ajouterBtn ----
                                ajouterBtn.setText("text");
                                titlePanel.add(ajouterBtn, "cell 2 2,growy");
                                ajouterBtn.addActionListener(l->{
                                    estVisible = !estVisible;
                                    panel1.setVisible(estVisible);
                                });
                        }

                        //======== scrollPane1 ========
                        {
                                scrollPane1.setViewportBorder(null);
                                scrollPane1.setDoubleBuffered(true);
                                scrollPane1.setBorder(null);
                                scrollPane1.setOpaque(true);

                                //---- table1 ----
                                table1.setModel(new DefaultTableModel(
                                        new Object[][] {
                                                {null, null, null,null, null, "", null, modifyBtn, deleteBtn},
                                                {null, null, null,null, null, null, null,modifyBtn, deleteBtn},
                                        },
                                        new String[] {
                                                "cin" ,"Prenom", "Nom", "Photo","grad", "theme", "peutEtrePresident", "", ""
                                        }
                                ) {
                                        Class<?>[] columnTypes = new Class<?>[] {
                                                String.class, String.class, String.class,String.class, String.class, Object.class, Object.class, JButton.class, JButton.class
                                        };
                                        boolean[] columnEditable = new boolean[] {
                                                false, false, false,false, false, false, false, false, false
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
//                                TableCellRenderer tableRenderer = table1.getDefaultRenderer(JButton.class);
//                                table1.setDefaultRenderer(JButton.class, new MyComponents.JTableButtonRenderer(tableRenderer));
                                {
                                        TableColumnModel cm = table1.getColumnModel();
                                        cm.getColumn(1).setPreferredWidth(125);
                                        cm.getColumn(3).setPreferredWidth(65);
                                        cm.getColumn(4).setPreferredWidth(175);
                                        cm.getColumn(5).setPreferredWidth(110);
                                        cm.getColumn(6).setPreferredWidth(200);
                                        cm.getColumn(8).setPreferredWidth(2);
                                        cm.getColumn(7).setPreferredWidth(2);
                                }
                                
                                
                                table1.setShowGrid(true);
                                table1.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
                                table1.setBorder(null);
                                table1.setFillsViewportHeight(true);
                                table1.getTableHeader().setDefaultRenderer( new MyComponents.MyHeaderRenderer());
                                table1.setRowHeight(40);
                                table1.setPreferredSize(new Dimension(1000, 80));
                                scrollPane1.setViewportView(table1);
                        }
                        lpane.add(scrollPane1, JLayeredPane.DEFAULT_LAYER);
                        scrollPane1.setBounds(0, 0, 1300, 480);
                }
                this2.add(lpane, BorderLayout.CENTER);
        }
        this2.add(titlePanel,BorderLayout.NORTH);
        add(this2, BorderLayout.CENTER);
        eastBorder.setPreferredSize(new Dimension(10,0));
        add(eastBorder, BorderLayout.WEST);
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
