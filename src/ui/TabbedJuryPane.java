import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 13:14:31 CET 2024
 */



/**
 * @author yassine
 */
public class TabbedJuryPane extends JTabbedPane {
    public TabbedJuryPane() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());
        }
        addTab("President", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());
        }
        addTab("Examinateur", panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new BorderLayout());
        }
        addTab("Encadreur Interne", panel3);

        //======== panel4 ========
        {
            panel4.setLayout(new BorderLayout());
        }
        addTab("Rapporteur", panel4);

        //======== panel5 ========
        {
            panel5.setLayout(new BorderLayout());
        }
        addTab("Encadreur Exterieur", panel5);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
