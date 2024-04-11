import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
/*
 * Created by JFormDesigner on Thu Apr 11 12:53:08 CET 2024
 */



/**
 * @author yassine
 */
public class upperConsulterContent extends JPanel {
    public upperConsulterContent() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label5 = new JLabel();
        textField3 = new JTextField();
        comboBox2 = new JComboBox();
        button4 = new JButton();
        button2 = new JButton();

        //======== this ========
        setLayout(new FormLayout(
            "166dlu, $lcgap, 56dlu, 3dlu, 42dlu, default",
            "26dlu, $lgap, fill:20dlu, $lgap, 21dlu"));


        //---- label5 ----
        label5.setText("Consulter Jury");
        label5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
        label5.setHorizontalAlignment(SwingConstants.LEFT);
        add(label5, CC.xywh(3, 3, 5, 1));
        add(textField3, CC.xy(3, 5));
        add(comboBox2, CC.xy(5, 5));

        //---- button4 ----
        button4.setText("chercher");
        add(button4, CC.xy(7, 5));

        //---- button2 ----
        button2.setText("Ajouter");
        add(button2, CC.xy(7, 7, CC.DEFAULT, CC.FILL));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label5;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JButton button4;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
