/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.Soutenance;

/**
 *
 * @author yassine
 */
public class LoVSoutenance extends JPanel {
    private JPanel panel6;
    private JTextField idField;
    private JLabel label26;
    private JTextField npField;
    private JLabel label27;
    private JButton choisirBtn;
    private JPanel panel7;
    private JTextField searchBar;
    private JScrollPane scrollPane3;
    private JList list;
    private boolean estVisible= false;
    
    private class SlicedItemRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            // Check if value is a string and has enough characters
            if (value instanceof String) {
                // Get the first half of the string
                String aux =(String) value;
                int indexComma = aux.lastIndexOf(",");
                String slicedText = aux.substring(0,indexComma);
                label.setText(slicedText);
            }

            return label;
        }
    }
    
    
    public LoVSoutenance(List<Soutenance> soutList) {
        initComponents(soutList);
    }

    private void initComponents(List<Soutenance> infoList) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel6 = new JPanel();
        idField = new JTextField();
        label26 = new JLabel();
        npField = new JTextField();
        label27 = new JLabel();
        choisirBtn = new JButton();
        panel7 = new JPanel();
        searchBar = new JTextField();
        scrollPane3 = new JScrollPane();
        list = new JList();
        
        //====== Setting up JList =========
        list.setCellRenderer(new SlicedItemRenderer());
        searchBar.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                try{
                    String value = searchBar.getText().trim();
                    populateList(infoList,value);
                }catch(Exception e){
                    
                }
            }
        });
        
        list.addListSelectionListener((e)->{
            if (!e.getValueIsAdjusting()) {
                String np,idSout;
                String item = list.getSelectedValue().toString();
                int indexComma = item.indexOf(",");
                int indexComma2 = item.lastIndexOf(",");
                np = item.substring(indexComma+1, indexComma2);
                idSout = item.substring(0,indexComma);
                
                
                idField.setText(idSout);
                npField.setText(np);
                estVisible = !estVisible;
                panel7.setVisible(estVisible);
                

                // You can perform any custom actions here
            }
        });
        //======== this ========
        setLayout(new BorderLayout(0, 10));

        //======== panel6 ========
        {
            panel6.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

            //---- idField ----
            idField.setPreferredSize(new Dimension(80, 24));
            idField.setText("id");
            
            idField.setEditable(false);
            panel6.add(idField);

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
            searchBar.setPreferredSize(new Dimension(0,24));
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
            if(estVisible)
                populateList(infoList,"");
            
        });
        add(panel7, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    public String getIdText(){
        return idField.getText();
    }
    public String getNom(){
        
        return npField.getText().split(" ")[0];
    }
    public String getPrenom(){
        
        return npField.getText().split(" ")[1];
    }
    public void populateList(List<Soutenance> soutList, String critere){
        List<String> res = new ArrayList<>();
        if(critere.equals("")){
            for(Soutenance sout:soutList){
                res.add(sout.toString());
            }
            list.setListData(res.toArray());
        }
        else{
            ListIterator ltSout = soutList.listIterator();
            while(ltSout.hasNext()){
                Object p = ltSout.next();
                if(p.toString().contains(critere))
                    res.add(p.toString());
            }
            list.setListData(res.toArray());
        }
    }
}