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
	private JMenu file;
        private JMenu pfe;
	private JMenu jury;
	private JMenu etudiant;
	private JMenu enseignant;
	private JMenu param;
        private JMenuItem paramSoutenance;
	private JMenuItem paramGroupe;
	private JMenuItem paramOrganismeExt;
	private JMenuItem paramSpecialite;
	private JMenuItem paramEncadreurExt;
	private JMenuItem fileExit;
        private JPanel cardContainer;
	private CardLayout cl=new CardLayout();
	// declare pages
	private MainLoginPage loginPanel;
	private ViewSmallClassPanel smallClassP;
        private HomePage homePage;

	public MainWindow(){
            // inits
            mb=new JMenuBar();
            file =new JMenu("file");
            pfe = new JMenu("PFE");
            jury = new JMenu("Jury");
            etudiant = new JMenu("Etudiant");
            enseignant = new JMenu("Enseignant");
            param = new JMenu("Paramètres");
            paramSoutenance = new JMenuItem("Soutenance");
            paramEncadreurExt = new JMenuItem("Encadreur Exterieure");
            paramOrganismeExt = new JMenuItem("Organisme Exterieure");
            paramGroupe = new JMenuItem("Groupe");
            paramSpecialite = new JMenuItem("Specialité");
            fileExit = new JMenuItem("exit");
            cardContainer = new JPanel();
            loginPanel = new MainLoginPage();
            smallClassP = new ViewSmallClassPanel("Specialite",null);
            homePage = new HomePage();
            this.setUndecorated(true);
            // Setup menu bar
            {
                mb.setBackground(Color.white);
                mb.setOpaque(true);
                
                file.add(fileExit);
                param.add(paramSoutenance); // sa propre façon de lecture
                param.addSeparator();
                param.add(paramGroupe);
                param.add(paramSpecialite);
                param.addSeparator();
                param.add(paramOrganismeExt);
                param.add(paramEncadreurExt);
                mb.add(file);
                mb.add(pfe);
                mb.add(jury);
                mb.add(etudiant);
                mb.add(enseignant);
                mb.add(param);
            }
            // setup this cardContainer
            cardContainer.setLayout(cl);
            cardContainer.add(loginPanel,"1");
            cardContainer.add(homePage,"2");
            cardContainer.add(smallClassP,"3");
            cl.show(cardContainer,"1");
            // setup button events
            loginPanel.getAuthBtn().addActionListener(e->{
                this.setJMenuBar(mb);
                cl.show(cardContainer,"2");
            });
            
            fileExit.addActionListener(l->{
                System.exit(0);
            });
            GraphicsEnvironment graphics =GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = graphics.getDefaultScreenDevice();
            device.setFullScreenWindow(this);

            this.setSize(520,540);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

            this.add(cardContainer);
	}
}
