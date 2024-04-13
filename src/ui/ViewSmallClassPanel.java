package ui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import java.util.List;
import model.*;
public class ViewSmallClassPanel extends JPanel {
	private JLabel title;
	private JPanel border2;
	private JPanel centerContent;
	private JPanel buttonPanel;
	private JButton modifyBtn=new JButton();
	private JButton deleteBtn = new JButton();
	private JButton ajouterBtn = new JButton("Ajouter");
        
	private Boolean estVisible=false;

	public ViewSmallClassPanel(String nomDuClasse, List<? extends Object> info) {
                JComponent leftComp = null;
                JComponent tableComp=null;
                switch(nomDuClasse){
                    case "Groupe":
                        leftComp = new AjouterPage.AjouterGroupe();
                        tableComp = new MyComponents.GroupeTable();
                        break;
                    case "Specialité":
                        leftComp= new AjouterPage.AjouterSp();
                        tableComp = new MyComponents.SpTable();
                        break;
                    case "Local":
                        leftComp=new AjouterPage.AjouterLocal();
                        tableComp = new MyComponents.LocalTable();
                        break;
                    case "Encadreur Exterieure":
                        leftComp= new AjouterPage.AjouterEncadreurExt();
                        tableComp = new MyComponents.EncadreurExterieurTable();
                        break;
                    case "Organisme":
                        leftComp = new AjouterPage.AjouterOrganisme();
                        tableComp = new MyComponents.OrganismeTable();
                        break;
                    case "Soutenance":
                        tableComp = new MyComponents.SoutenanceTableSansModSupp();
                        leftComp=new JPanel();
                        leftComp.setVisible(false);
                        break;
                }
		initComponents(nomDuClasse,tableComp,leftComp);
	}

	private void initComponents(String nomDuClasse, JComponent table ,JComponent leftAddition) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		border2 = new JPanel();
		centerContent = new JPanel();
		buttonPanel = new JPanel();
		title = new JLabel("Consulter "+nomDuClasse);
                JButton searchBtn= new JButton();
                JTextField searchBar= new JTextField();
                JComboBox critereCB= new JComboBox<>();
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

                //======== buttonPanel ========

                buttonPanel.setBackground(Color.white);
                buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
                buttonPanel.add(title);
                buttonPanel.add(ajouterBtn);
                title.setFont(MyComponents.h1);
                title.setPreferredSize(new Dimension(300,100));
//                ajouterBtn.setBounds(new Rectangle(new Point(500, 80), new Dimension(100,30)));
                
                centerContent.add(table);
                table.setBounds(0,0,1000,500);

             
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
                titlePanel.setLayout(new FormLayout(
                        "166dlu, $lcgap, 56dlu, 3dlu, 42dlu, default",
                        "26dlu, $lgap, fill:20dlu, $lgap, 21dlu"));

                //---- title ----
                title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
                title.setHorizontalAlignment(SwingConstants.LEFT);
                titlePanel.add(title, CC.xywh(1, 1, 3, 1));
                titlePanel.add(searchBar, CC.xy(1, 3));
                titlePanel.add(critereCB, CC.xy(3, 3));

                //---- searchBtn ----
                searchBtn.setText("chercher");
                titlePanel.add(searchBtn, CC.xy(5, 3));

                //---- ajouterBtn ----
                ajouterBtn.setText("Ajouter");
                titlePanel.add(ajouterBtn, CC.xy(5, 5, CC.DEFAULT, CC.FILL));
                ajouterBtn.addActionListener(ee->{
                    estVisible = !estVisible;
                    leftAddition.setVisible(estVisible);
                });
                
                eastBorder.setPreferredSize(new Dimension(10,0));
                
                
                this.add(titlePanel,BorderLayout.NORTH);
		this.add(border2, BorderLayout.SOUTH);
                this.add(eastBorder, BorderLayout.EAST);
                

	}
}

