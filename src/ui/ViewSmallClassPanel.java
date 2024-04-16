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
public class ViewSmallClassPanel extends JPanel {
	private JLabel title;
	private JPanel border2;
	private JPanel centerContent;
	private JPanel buttonPanel;
	private JButton modifyBtn=new JButton();
	private JButton deleteBtn = new JButton();
	private JButton ajouterBtn = new JButton("Ajouter");
        
	private Boolean estVisible=false;

	public ViewSmallClassPanel(String nomDuClasse, List<? extends ColumnNames> info) {
                JComponent leftComp = null;
                ComponentWithTable tableComp=null;
                switch(nomDuClasse){
                    case "Groupe":
                        leftComp = new AjouterPage.AjouterGroupe();
                        tableComp = new MyComponents.GroupeTable(info);
                        break;
                    case "Specialité":
                        leftComp= new AjouterPage.AjouterSp();
                        tableComp = new MyComponents.SpTable(info);
                        break;
                    case "Local":
                        leftComp=new AjouterPage.AjouterLocal();
                        tableComp = new MyComponents.LocalTable(info);
                        break;
                    case "Encadreur Exterieure":
                        leftComp= new AjouterPage.AjouterEncadreurExt();
                        tableComp = new MyComponents.EncadreurExterieurTable(info);
                        break;
                    case "Organisme":
                        leftComp = new AjouterPage.AjouterOrganisme();
                        tableComp = new MyComponents.OrganismeTable(info);
                        break;
                    case "Soutenance":
                        tableComp = new MyComponents.SoutenanceTableSansModSupp();
                        leftComp=new JPanel();
                        leftComp.setVisible(false);
                        break;
                }
		initComponents(nomDuClasse,info.get(0).getColumnNames(),tableComp,leftComp);
	}

	private void initComponents(String nomDuClasse, String[] critereTab, ComponentWithTable table ,JComponent leftAddition) {
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
                    estVisible = !estVisible;
                    leftAddition.setVisible(estVisible);
                });
                searchBtn.addActionListener(l->{
                    DefaultTableModel myTableModel = (DefaultTableModel) table.getTable().getModel();
                    TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(myTableModel);
                    table.getTable().setRowSorter(obj);
                    TableColumnModel searchedColumn = table.getTable().getColumnModel();
                    System.out.println(critereCB.getSelectedIndex());
                    obj.setRowFilter(RowFilter.regexFilter(searchBar.getText(),critereCB.getSelectedIndex()));
                });
                
                this.add(titlePanel,BorderLayout.NORTH);
		this.add(border2, BorderLayout.SOUTH);
                this.add(leftAddition, BorderLayout.EAST);
                

	}
}

