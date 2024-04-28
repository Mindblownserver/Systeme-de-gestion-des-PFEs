package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import model.*;
import net.miginfocom.swing.MigLayout;
import repo.MyDataBaseConnector;
import ui.AjouterPage.AjouterEncadreurExt;
import ui.MyComponents.EncadreurExterieurTable;
public class ViewEncadreurExternePanel extends JPanel {
	private JLabel title;
	private JPanel border2;
	private JPanel centerContent;
	private JPanel buttonPanel;
	private JButton modifyBtn=new JButton();
	private JButton deleteBtn = new JButton();
	private JButton ajouterBtn = new JButton("Ajouter");    
	private Boolean estVisible=false;
        private MyComponents.EncadreurExterieurTable table;
        private AjouterPage.AjouterEncadreurExt leftComp;
        
        private TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
                
            }

            @Override
            public void onDelete(int row) {
                System.out.println("Delete row : " + row);
                String idEncadExt = table.getTable().getModel().getValueAt(row, 0).toString();
                try{
                    MyDataBaseConnector dbc = new MyDataBaseConnector();
                    dbc.query("update PFE "
                            + "set ENCADEUREXT=null "
                            + "where ENCADEUREXT='"+idEncadExt+"'");
                    dbc.query("delete from ENCADREUREXT where cin='"+idEncadExt+"'");

                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        
	public ViewEncadreurExternePanel(String nomDuClasse, List<EncadreurExt> info, String[] comboBoxValues) {
                table = new MyComponents.EncadreurExterieurTable(info,event);
                leftComp= new AjouterPage.AjouterEncadreurExt(comboBoxValues, info, table);
                

                
		initComponents(nomDuClasse,info.get(0).getColumnNames(),table,leftComp);
	}

	private void initComponents(String nomDuClasse, String[] critereTab, EncadreurExterieurTable table ,AjouterEncadreurExt leftAddition) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		border2 = new JPanel();
		centerContent = new JPanel();
		buttonPanel = new JPanel();
		title = new JLabel("Consulter "+nomDuClasse);
                JButton searchBtn= new JButton();
                JTextField searchBar= new JTextField();
                JComboBox critereCB= new JComboBox<>(critereTab);
                JPanel titlePanel = new JPanel();
                JPanel eastBorder = new JPanel();
                
                deleteBtn.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("delete.svg")));
                modifyBtn.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("edit.svg")));

		//======== this ========
		setBackground(Color.white);
		//======== centerContent ======
		setLayout(new BorderLayout(5,10));
                centerContent.setLayout(null);
                centerContent.setBackground(Color.WHITE);
                //centerContent.setLayout(new BoxLayout(centerContent, BoxLayout.Y_AXIS));

                
//                ajouterBtn.setBounds(new Rectangle(new Point(500, 80), new Dimension(100,30)));
                
                centerContent.add((JComponent)table);
                ((JComponent)table).setBounds(10,0,1200,500);
                
             
		add(centerContent, BorderLayout.CENTER);
                //====Left ajouter Panel
                leftAddition.setVisible(false);
                leftAddition.setPreferredSize(new Dimension(500,leftAddition.getPreferredSize().height));
                add(leftAddition, BorderLayout.EAST);
		//======== border2 ========
		
                border2.setPreferredSize(new Dimension(200, 100));
                border2.setBackground(Color.white);
                border2.setLayout(new BorderLayout());
                
                //======== titlePanel ========
                       
                titlePanel.setBackground(Color.white);
                titlePanel.setPreferredSize(new Dimension(75, 150));
                titlePanel.setLayout(new MigLayout(
                    "insets 20 10 0 0, hidemode 3",
                    // columns
                    "[169,fill]" +
                    "[74,fill]" +
                    "[70,fill]",
                    // rows
                    "[30]" +
                    "[30]" +
                    "[32]"));

                //---- title ----
                title.setText("Consulter "+nomDuClasse);
                titlePanel.add(title, "cell 0 0");
                titlePanel.add(searchBar, "cell 0 1,grow");
                titlePanel.add(critereCB, "cell 1 1,growy");

                //---- chercherBtn ----
                searchBtn.setText("Chercher");
                titlePanel.add(searchBtn, "cell 2 1,growy");

                //---- ajouterBtn ----
                ajouterBtn.setText("Ajouter");
                titlePanel.add(ajouterBtn, "cell 2 2,growy");

                //---- title ----
                title.setFont(new Font("SansSerif", Font.BOLD, 24));
                title.setHorizontalAlignment(SwingConstants.LEFT);
                ajouterBtn.addActionListener(ee->{
                    leftAddition.setVisible(!leftAddition.isVisible());
                });
                // Modify Row
                 // Search functionality
                searchBtn.addActionListener(l->{
                    DefaultTableModel myTableModel = (DefaultTableModel) table.getTable().getModel();
                    TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(myTableModel);
                    table.getTable().setRowSorter(obj);
                    System.out.println(critereCB.getSelectedIndex());
                    obj.setRowFilter(RowFilter.regexFilter(searchBar.getText().toUpperCase(),critereCB.getSelectedIndex()));
                });
                
                this.add(titlePanel,BorderLayout.NORTH);
		this.add(border2, BorderLayout.SOUTH);
                this.add(leftAddition, BorderLayout.EAST);
                

	}
}

