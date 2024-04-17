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
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.ColumnNames;
import model.Enseignant;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class ViewEnseignantPanel extends javax.swing.JPanel {
    private JPanel titlePanel = new JPanel();
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
    private MyComponents.EnseignantTable table;
    private boolean estVisible = false;
    
    public ViewEnseignantPanel(String[] criteriaTab, List<Enseignant> info) {
        init(criteriaTab,info);
    }
    public void init(String[] criteriaTab, List<Enseignant> info){
        // JFormDesigner - Component initialization - DO NOT MODIFY                                            
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
        table = new MyComponents.EnseignantTable(info);
        JLabel title= new JLabel();
        JButton searchBtn= new JButton(),ajouterBtn=new JButton();
        JTextField searchBar= new JTextField();
        JComboBox critereCB= new JComboBox<>(criteriaTab);
        JPanel eastBorder = new JPanel();
        JLabel img = new JLabel();
        //======== this ========
        setLayout(new BorderLayout(0,10));

        
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

                        //========Table Component========
                        table.getTable().addMouseMotionListener(new MouseInputAdapter(){
                            private int lastRow = -1;
                            private int lastColumn = -1;

                            @Override
                            public void mouseMoved(MouseEvent e) {
                                Point point = e.getPoint();
                                int row = table.getTable().rowAtPoint(point);
                                int column = table.getTable().columnAtPoint(point);

                                // Check if mouse has moved to a different cell
                                if (row != lastRow || column != lastColumn) {
                                    System.out.println("Mouse moved from cell: " + lastRow + ", " + lastColumn +
                                                       " to cell: " + row + ", " + column);
                                    // start display images
                                    Thread queries = new Thread(){
                                        public void run(){
                                            try {
                                                String path = "https://media.licdn.com/dms/image/C4D03AQGV7rctgkPKBA/profile-displayphoto-shrink_200_200/0/1616277770902?e=1717632000&v=beta&t=QE8d9DWMgELvYWktuqKKdwfNKGqD_lIdKQcVteTq9KU"; // Replace with your image URL
                                                URL url = new URL(path);
                                                BufferedImage image = ImageIO.read(url);
                                                img.setIcon(new ImageIcon(image));
                                                img.setBounds(e.getPoint().x,e.getPoint().y,100,100);
                                                System.out.println("Image loaded and displayed.");
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    };
                                    // end-display image
                                    /*Threading*/
                                    // instead of processing images on-the-go, try pre-processing it
                                    // and use it when its index corresponds with your row.
                                    // Might need to play with threading for a bit...
                                    // Perform actions based on mouse movement
                                    lastRow = row;
                                    lastColumn = column;
                                    if(row==-1||column==-1){
                                        queries.interrupt();
                                        img.setVisible(false);
                                    }    
                                    else{
                                        queries.start();
                                        img.setVisible(true);
                                    }
                                }
                            }
                        });
                        lpane.add(table,1);
                        lpane.add(img,0);
                        table.setBounds(10, 0, 1300, 480);
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
