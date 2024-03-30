package ui;
import java.awt.*;

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
	JMenuBar mb;
	JMenu pfe;
	JMenu jury;
	JMenu etudiant;
	JMenu enseignant;
	JMenu param;
	JMenuItem paramGroupe;
	JMenuItem paramOrganismeExt;
	JMenuItem paramSpecialite;
	JMenuItem paramEncadreurExt;

	public MainWindow(){
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

		this.setSize(520,540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setJMenuBar(mb);
	}
}
