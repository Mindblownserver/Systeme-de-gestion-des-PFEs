/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class MainLoginPage extends javax.swing.JPanel {
    private MigLayout layout;
    private LoginCover cover;
    private LoginPanel login;
    private final double loginSize = 55;
    private final double coverSize = 40;
    public MainLoginPage() {
        initComponents();
        init();
        
    }

    public void init(){
        layout = new MigLayout("fill, insets 0");
        cover = new LoginCover();
        login = new LoginPanel();
        bg.setLayout(layout);
        bg.add(cover, "width "+coverSize+"sp, pos 0al 0 n 100%");
        bg.add(login, "width "+loginSize+"sp, pos 1al 0 n 100%");
        
    }
    public JButton getAuthBtn(){;
        return login.getAuthBtn();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        bg.setBackground(java.awt.Color.white);
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
