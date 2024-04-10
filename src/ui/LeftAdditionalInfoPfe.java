import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Mon Apr 08 12:39:14 CET 2024
 */



/**
 * @author yassine
 */
public class LeftAdditionalInfoPfe {
    public LeftAdditionalInfoPfe() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        plusInfoPane = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        themeField = new JTextField();
        label3 = new JLabel();
        sujetField = new JTextField();
        label4 = new JLabel();
        descScroll = new JScrollPane();
        descArea = new JTextArea();
        label5 = new JLabel();
        calendrierScroll = new JScrollPane();
        calendrierTable = new JTable();

        //======== plusInfoPane ========
        {
            plusInfoPane.setLayout(new FormLayout(
                "37dlu, 190dlu:grow, 9dlu",
                "23dlu, 2*(20dlu, 5dlu), 123dlu, 5dlu, fill:63dlu, $lgap, default"));

            //---- label1 ----
            label1.setText("Plus D'informations:");
            label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
            plusInfoPane.add(label1, CC.xywh(1, 1, 2, 1));

            //---- label2 ----
            label2.setText("th\u00e8me");
            plusInfoPane.add(label2, CC.xy(1, 2));

            //---- themeField ----
            themeField.setEditable(false);
            themeField.setText("Architecture des micro services");
            themeField.setBackground(Color.white);
            plusInfoPane.add(themeField, CC.xy(2, 2, CC.DEFAULT, CC.FILL));

            //---- label3 ----
            label3.setText("Sujet");
            plusInfoPane.add(label3, CC.xy(1, 4, CC.DEFAULT, CC.CENTER));

            //---- sujetField ----
            sujetField.setText("Migration d'une application vers une architecture micro services");
            sujetField.setEditable(false);
            sujetField.setBackground(Color.white);
            plusInfoPane.add(sujetField, CC.xy(2, 4, CC.DEFAULT, CC.FILL));

            //---- label4 ----
            label4.setText("Description");
            plusInfoPane.add(label4, CC.xy(1, 6, CC.DEFAULT, CC.TOP));

            //======== descScroll ========
            {

                //---- descArea ----
                descArea.setText("M\u00e9moire de fin de cycle pour l'obtention du dipl\u00f4me de master en sciences commerciales\nOption : Marketing Th\u00e8me : R\u00e9alis\u00e9 par : Encadr\u00e9 par : AMROUCHI Kaci Mr. KHERRI Abdenacer Maitre de conf\u00e9rences \u00e0 HEC Alger 5 \u00e8me promotion Juin 2018 \n\u00c9cole des Hautes \u00c9tudes Commerciales \nL'impact de la communication digitale sur la fid\u00e9lisation de la client\u00e8le \n\u00c9tude de cas : Formation-dz R\u00e9sum\u00e9 I R\u00e9sum\u00e9 : \nLe monde a chang\u00e9, la soci\u00e9t\u00e9 a \u00e9volu\u00e9, l'av\u00e8nement du digital a modifi\u00e9 nos habitudes et notre fa\u00e7on de vivre.");
                descArea.setRows(13);
                descArea.setLineWrap(true);
                descArea.setEditable(false);
                descArea.setBackground(Color.white);
                descScroll.setViewportView(descArea);
            }
            plusInfoPane.add(descScroll, CC.xy(2, 6, CC.DEFAULT, CC.FILL));

            //---- label5 ----
            label5.setText("Calendrier");
            plusInfoPane.add(label5, CC.xy(1, 8, CC.DEFAULT, CC.TOP));

            //======== calendrierScroll ========
            {

                //---- calendrierTable ----
                calendrierTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                    },
                    new String[] {
                        "ID", "Date limite du Rendu 1", "Date limite du Rendu 2", "Date de Soutenance"
                    }
                ));
                {
                    TableColumnModel cm = calendrierTable.getColumnModel();
                    cm.getColumn(1).setPreferredWidth(165);
                    cm.getColumn(2).setPreferredWidth(170);
                    cm.getColumn(3).setPreferredWidth(155);
                }
                calendrierScroll.setViewportView(calendrierTable);
            }
            plusInfoPane.add(calendrierScroll, CC.xy(2, 8));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel plusInfoPane;
    private JLabel label1;
    private JLabel label2;
    private JTextField themeField;
    private JLabel label3;
    private JTextField sujetField;
    private JLabel label4;
    private JScrollPane descScroll;
    private JTextArea descArea;
    private JLabel label5;
    private JScrollPane calendrierScroll;
    private JTable calendrierTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
