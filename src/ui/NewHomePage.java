/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author yassine
 */
public class NewHomePage extends JPanel{
    Image bgImage;
    public NewHomePage(){
        initComponents();
    }
    private void initComponents() {
        int dx=100,dy=100;
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        etuBtn = new JButton();
        ensBtn = new JButton();
        juryBtn = new JButton();
        pfeBtn = new JButton();
        Cursor point = new Cursor(Cursor.HAND_CURSOR);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        bgImage = new ImageIcon("./assets/bg.jpeg").getImage().getScaledInstance(screenSize.width,screenSize.height, Image.SCALE_DEFAULT);
        JPanel mainPanel = new JPanel();
        JLabel bg = new JLabel();
        JLayeredPane mainLp = new JLayeredPane();
        //bg.setBackground(Color.red);
        bg.setOpaque(true);
        bg.setIcon(new ImageIcon(bgImage));
        //======== this ========
        mainPanel.setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[160,fill]0" +
            "[140,fill]50" +
            "[140,fill]0" +
            "[160,fill]",
            // rows
            "[198,fill]100" +
            "[199,fill]30"));

        //---- etuBtn ----
        etuBtn.setText("Consulter Etudiant");
        etuBtn.setVerticalTextPosition(JButton.BOTTOM);
        etuBtn.setHorizontalTextPosition(JButton.CENTER);
        etuBtn.setFont(MyComponents.h3);
        etuBtn.setBackground(Color.white);
        etuBtn.setCursor(point);
        
        etuBtn.setIcon(new ImageIcon(new ImageIcon("./assets/etudiantBtn.jpeg").getImage().getScaledInstance(502-dx,300-dy, Image.SCALE_DEFAULT)));
        mainPanel.add(etuBtn, "cell 0 0 2 1");

        //---- ensBtn ----
        ensBtn.setVerticalTextPosition(JButton.BOTTOM);
        ensBtn.setHorizontalTextPosition(JButton.CENTER);
        ensBtn.setFont(MyComponents.h3);
        ensBtn.setBackground(Color.white);
        ensBtn.setCursor(point);
        ensBtn.setText("Consulter Enseignant");
        ensBtn.setIcon(new ImageIcon(new ImageIcon("./assets/profBtn.png").getImage().getScaledInstance(502-dx,400-dy, Image.SCALE_DEFAULT)));
        mainPanel.add(ensBtn, "cell 2 0 2 1");

        //---- juryBtn ----
        juryBtn.setVerticalTextPosition(JButton.BOTTOM);
        juryBtn.setHorizontalTextPosition(JButton.CENTER);
        juryBtn.setFont(MyComponents.h3);
        juryBtn.setBackground(Color.white);
        juryBtn.setCursor(point);
        juryBtn.setText("Consulter Jury");
        juryBtn.setIcon(new ImageIcon(new ImageIcon("./assets/juryBtn.jpeg").getImage().getScaledInstance(502-dx,300-dy, Image.SCALE_DEFAULT)));
        mainPanel.add(juryBtn, "cell 0 1 2 1");

        //---- pfeBtn ----
        pfeBtn.setVerticalTextPosition(JButton.BOTTOM);
        pfeBtn.setHorizontalTextPosition(JButton.CENTER);
        pfeBtn.setFont(MyComponents.h3);
        pfeBtn.setBackground(Color.white);
        pfeBtn.setCursor(point);
        pfeBtn.setText("Consulter PFE");
        pfeBtn.setIcon(new ImageIcon(new ImageIcon("./assets/pfeBtn.png").getImage().getScaledInstance(502-dx,300-dy, Image.SCALE_DEFAULT)));
        mainPanel.add(pfeBtn, "cell 2 1 2 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        mainPanel.setBounds(100,60,screenSize.width,screenSize.height);
        mainPanel.setOpaque(false);
        bg.setBounds(0,0,screenSize.width,screenSize.height);
        mainLp.add(mainPanel);
        mainLp.add(bg);
        setLayout(new BorderLayout());
        add(mainLp, BorderLayout.CENTER);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton etuBtn;
    private JButton ensBtn;
    private JButton juryBtn;
    private JButton pfeBtn;

    public JButton getEtudiantBtn() {
        return etuBtn;
    }

    public JButton getEnseignantBtn() {
        return ensBtn;
    }

    public JButton getJuryBtn() {
        return juryBtn;
    }

    public JButton getPfeBtn() {
        return pfeBtn;
    }
//    public void paint(Graphics g){
//        super.paint(g);
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.drawImage(bgImage, 0,0, null);
//    }
    
}
