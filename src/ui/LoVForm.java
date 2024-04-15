/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author yassine
 */
public class LoVForm extends JPanel {
    public LoVForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel6 = new JPanel();
        cinField = new JTextField();
        label26 = new JLabel();
        npField = new JTextField();
        label27 = new JLabel();
        choisirBtn = new JButton();
        panel7 = new JPanel();
        searchBar = new JTextField();
        scrollPane3 = new JScrollPane();
        list = new JList();

        //======== this ========
        setLayout(new BorderLayout(0, 10));

        //======== panel6 ========
        {
            panel6.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

            //---- cinField ----
            cinField.setPreferredSize(new Dimension(75, 24));
            cinField.setText("cin");
            
            cinField.setEditable(false);
            panel6.add(cinField);

            //---- label26 ----
            label26.setPreferredSize(new Dimension(5, 0));
            panel6.add(label26);

            //---- npField ----
            npField.setPreferredSize(new Dimension(220, 24));
            npField.setText("Nom et Prenom");
            npField.setEditable(false);
            panel6.add(npField);

            //---- label27 ----
            label27.setPreferredSize(new Dimension(5, 0));
            panel6.add(label27);

            //---- choisirBtn ----
            choisirBtn.setText("Choisir");
            panel6.add(choisirBtn);
        }
        add(panel6, BorderLayout.NORTH);

        //======== panel7 ========
        {
            panel7.setLayout(new BorderLayout(0, 10));
            panel7.add(searchBar, BorderLayout.NORTH);

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(list);
            }
            panel7.add(scrollPane3, BorderLayout.CENTER);
        }
        panel7.setVisible(false);
        choisirBtn.addActionListener(l->{
            estVisible = !estVisible;
            panel7.setVisible(estVisible);
            
        });
        add(panel7, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel6;
    private JTextField cinField;
    private JLabel label26;
    private JTextField npField;
    private JLabel label27;
    private JButton choisirBtn;
    private JPanel panel7;
    private JTextField searchBar;
    private JScrollPane scrollPane3;
    private JList list;
    private boolean estVisible= false;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}