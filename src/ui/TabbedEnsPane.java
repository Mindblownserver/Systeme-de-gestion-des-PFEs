import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 13:37:59 CET 2024
 */



/**
 * @author yassine
 */
public class TabbedEnsPane {
    public TabbedEnsPane() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        EnsTab = new JTabbedPane();
        encadrePane = new JPanel();
        rapportePane = new JPanel();
        examinePane = new JPanel();
        presidePane = new JPanel();

        //======== EnsTab ========
        {

            //======== encadrePane ========
            {
                encadrePane.setLayout(new BorderLayout());
            }
            EnsTab.addTab("PFE encadr\u00e9 (n)", encadrePane);

            //======== rapportePane ========
            {
                rapportePane.setLayout(new BorderLayout());
            }
            EnsTab.addTab("PFE rapport\u00e9 (n)", rapportePane);

            //======== examinePane ========
            {
                examinePane.setLayout(new BorderLayout());
            }
            EnsTab.addTab("PFE examin\u00e9 (n)", examinePane);

            //======== presidePane ========
            {
                presidePane.setLayout(new BorderLayout());
            }
            EnsTab.addTab("PFE presid\u00e9 (n)", presidePane);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane EnsTab;
    private JPanel encadrePane;
    private JPanel rapportePane;
    private JPanel examinePane;
    private JPanel presidePane;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
