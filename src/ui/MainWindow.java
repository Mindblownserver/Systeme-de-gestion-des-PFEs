package ui;
import java.awt.*;
import java.util.concurrent.Flow;

import javax.management.JMException;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Mar 29 13:45:27 WAT 2024
 */



/**
 * @author Mohamed Yassine Kharrat
 */
public class MainWindow extends JFrame {
	private JMenuBar mb;
	private JMenu pfe;
	private JMenu jury;
	private JMenu etudiant;
	private JMenu enseignant;
	private JMenu param;
	private JMenuItem paramGroupe;
	private JMenuItem paramOrganismeExt;
	private JMenuItem paramSpecialite;
	private JMenuItem paramEncadreurExt;
	private JPanel cardContainer;
	private CardLayout cl=new CardLayout();
	// declare pages
	private LoginPage loginPage;
	private ViewGroupePanel viewGP;

	public MainWindow(){
		// inits
		mb=new JMenuBar();
		pfe = new JMenu("PFE");
		jury = new JMenu("Jury");
		etudiant = new JMenu("Etudiant");
		enseignant = new JMenu("Enseignant");
		param = new JMenu("Paramètres");
		paramEncadreurExt = new JMenuItem("Encadreur Exterieure");
		paramOrganismeExt = new JMenuItem("Organisme Exterieure");
		paramGroupe = new JMenuItem("Groupe");
		paramSpecialite = new JMenuItem("Specialité");
		cardContainer = new JPanel();
		loginPage = new LoginPage();
		viewGP = new ViewGroupePanel(null);
		this.setUndecorated(true);
		
		// Setup menu bar
		{
			mb.setBackground(Color.white);
			mb.setOpaque(true);

			param.add(paramGroupe);
			param.add(paramSpecialite);
			param.addSeparator();
			param.add(paramOrganismeExt);
			param.add(paramEncadreurExt);
			mb.add(pfe);
			mb.add(jury);
			mb.add(etudiant);
			mb.add(enseignant);
			mb.add(param);
		}
		// setup this cardContainer
		cardContainer.setLayout(cl);
		cardContainer.add(loginPage,"1");
		cardContainer.add(viewGP,"2");
		cl.show(cardContainer,"1");
		// setup button events
		loginPage.getBtn1().addActionListener(e->{
			cl.show(cardContainer,"2");
		});

		GraphicsEnvironment graphics =GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = graphics.getDefaultScreenDevice();
		device.setFullScreenWindow(this);

		this.setSize(520,540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(mb);
		this.setVisible(true);
		
		this.add(cardContainer);
	}
}
