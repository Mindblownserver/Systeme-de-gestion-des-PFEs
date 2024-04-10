import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 12:14:42 CET 2024
 */



/**
 * @author yassine
 */
public class TabbedPfePane {
    public TabbedPfePane() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pfeTabPanel = new JTabbedPane();
        etudiantTab = new JPanel();
        juryTab = new JPanel();
        soutTab = new JPanel();

        //======== pfeTabPanel ========
        {

            //======== etudiantTab ========
            {
                etudiantTab.setLayout(new BorderLayout());
            }
            pfeTabPanel.addTab("Etudiant (2)", etudiantTab);

            //======== juryTab ========
            {
                juryTab.setLayout(new BorderLayout());
            }
            pfeTabPanel.addTab("Jury (1)", juryTab);

            //======== soutTab ========
            {
                soutTab.setLayout(new BorderLayout());
            }
            pfeTabPanel.addTab("Soutenance (1)", soutTab);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane pfeTabPanel;
    private JPanel etudiantTab;
    private JPanel juryTab;
    private JPanel soutTab;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
