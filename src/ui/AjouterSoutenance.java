import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Apr 08 15:34:32 CET 2024
 */



/**
 * @author yassine
 */
public class AjouterSoutenance extends JDialog {
    public AjouterSoutenance() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        idSField = new JTextField();
        label3 = new JLabel();
        dateSField = new JFormattedTextField();
        label5 = new JLabel();
        heureSField = new JTextField();
        label4 = new JLabel();
        LoVExam = new JPanel();
        choisirPanel = new JPanel();
        cinField = new JTextField();
        label26 = new JLabel();
        nomField = new JTextField();
        label27 = new JLabel();
        choisirBtn = new JButton();
        panel7 = new JPanel();
        searchField = new JTextField();
        listScroll = new JScrollPane();
        list = new JList();
        label6 = new JLabel();
        textField1 = new JTextField();
        estValidChB = new JCheckBox();
        ajBtn = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[97,fill]" +
            "[147,fill]" +
            "[76,fill]" +
            "[73,grow,fill]",
            // rows
            "[]" +
            "[32]" +
            "[32]" +
            "[32]" +
            "[32,grow]" +
            "[32,shrink 0,top]" +
            "[32]" +
            "[]" +
            "[32]" +
            "[]"));

        //---- label1 ----
        label1.setText("Ajouter Soutenance");
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
        contentPane.add(label1, "cell 0 0 4 1");

        //---- label2 ----
        label2.setText("Id Soutenance");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(idSField, "cell 1 1,growy");

        //---- label3 ----
        label3.setText("Date");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(dateSField, "cell 1 2,growy");

        //---- label5 ----
        label5.setText("Heure");
        contentPane.add(label5, "cell 0 3");
        contentPane.add(heureSField, "cell 1 3,growy");

        //---- label4 ----
        label4.setText("Examinateur");
        contentPane.add(label4, "cell 0 4,aligny top,growy 0");

        //======== LoVExam ========
        {
            LoVExam.setLayout(new BorderLayout(0, 10));

            //======== choisirPanel ========
            {
                choisirPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

                //---- cinField ----
                cinField.setPreferredSize(new Dimension(75, 24));
                cinField.setText("cin");
                cinField.setEditable(false);
                choisirPanel.add(cinField);

                //---- label26 ----
                label26.setPreferredSize(new Dimension(5, 0));
                choisirPanel.add(label26);

                //---- nomField ----
                nomField.setPreferredSize(new Dimension(220, 24));
                nomField.setText("Nom et Prenom");
                nomField.setEditable(false);
                choisirPanel.add(nomField);

                //---- label27 ----
                label27.setPreferredSize(new Dimension(5, 0));
                choisirPanel.add(label27);

                //---- choisirBtn ----
                choisirBtn.setText("Choisir");
                choisirPanel.add(choisirBtn);
            }
            LoVExam.add(choisirPanel, BorderLayout.NORTH);

            //======== panel7 ========
            {
                panel7.setLayout(new BorderLayout(0, 10));
                panel7.add(searchField, BorderLayout.NORTH);

                //======== listScroll ========
                {
                    listScroll.setViewportView(list);
                }
                panel7.add(listScroll, BorderLayout.CENTER);
            }
            LoVExam.add(panel7, BorderLayout.CENTER);
        }
        contentPane.add(LoVExam, "cell 1 4 2 1");

        //---- label6 ----
        label6.setText("Jury");
        contentPane.add(label6, "cell 0 5,aligny top,growy 0");

        //---- textField1 ----
        textField1.setText("courant");
        textField1.setEditable(false);
        contentPane.add(textField1, "cell 1 5,aligny top,growy 0");

        //---- estValidChB ----
        estValidChB.setText("Est Valide");
        contentPane.add(estValidChB, "cell 0 6");

        //---- ajBtn ----
        ajBtn.setText("Ajouter");
        contentPane.add(ajBtn, "cell 0 8,growy");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JTextField idSField;
    private JLabel label3;
    private JFormattedTextField dateSField;
    private JLabel label5;
    private JTextField heureSField;
    private JLabel label4;
    private JPanel LoVExam;
    private JPanel choisirPanel;
    private JTextField cinField;
    private JLabel label26;
    private JTextField nomField;
    private JLabel label27;
    private JButton choisirBtn;
    private JPanel panel7;
    private JTextField searchField;
    private JScrollPane listScroll;
    private JList list;
    private JLabel label6;
    private JTextField textField1;
    private JCheckBox estValidChB;
    private JButton ajBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
