package ui;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import model.*;
import repo.MyDataBaseConnector;
import java.util.List;
import java.sql.ResultSet;
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
        private JMenuItem pfeConsult;
	private JMenu jury;
        private JMenuItem juryConsult;
	private JMenu etudiant;
        private JMenuItem etudConsult;
	private JMenu enseignant;
        private JMenuItem ensConsult;
	private JMenu param;
        private JMenuItem jurySoutenance;
	private JMenuItem paramGroupe;
	private JMenuItem paramOrganismeExt;
	private JMenuItem paramSpecialite;
	private JMenuItem paramEncadreurExt;
        private JMenuItem paramLocal;
	private JMenuItem fileExit;
        private JMenuItem fileSave;
        private JPanel cardContainer;
	private CardLayout cl=new CardLayout();
        // declare pages
	private MainLoginPage loginPanel;
        private HomePage homePage;
        private ViewEnseignantPanel enseignantP;
        private ViewEtudiantPanel etudiantP;
        private viewPfePanel pfeP;
        private ViewJuryPanel juryP;
        private ViewSmallClassPanel specialiteP;
        private ViewSmallClassPanel groupeP;
        private ViewSmallClassPanel soutenanceP;
        private ViewSmallClassPanel encadreurExtP;
        private ViewSmallClassPanel organismeP;
        private ViewSmallClassPanel localeP;
        // declaring list of Models
        private MyDataBaseConnector dbc;
        private List<Specialite> spList;
        private List<Groupe> grList;
        private List<Local> locList;
        private List<OrganismeExt> orgList;
        private List<EncadreurExt> encExtList;
        
        
	public MainWindow(){
            // remplissage des SD relatifs au info
            // inits components
            System.out.println();
            mb=new JMenuBar();
            mb.setFont(MyComponents.h3);
            file =new JMenu("file");
            file.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("file.svg")));
            pfe = new JMenu("PFE");
            pfe.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("pfe.svg")));
            jury = new JMenu("Jury");
            jury.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("jurys.svg")));
            etudiant = new JMenu("Etudiant");
            etudiant.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("etudiant.svg")));
            enseignant = new JMenu("Enseignant");
            enseignant.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("enseignant.svg")));
            param = new JMenu("Paramètres");
            param.setIcon(new FlatSVGIcon(ClassLoader.getSystemResource("param.svg")));
            param.setFont(MyComponents.h3);
            jurySoutenance = new JMenuItem("Soutenance");
            juryConsult = new JMenuItem("Consulter jury");
            paramEncadreurExt = new JMenuItem("Encadreur Exterieure");
            paramOrganismeExt = new JMenuItem("Organisme Exterieure");
            paramGroupe = new JMenuItem("Groupe");
            paramSpecialite = new JMenuItem("Specialité");
            paramLocal = new JMenuItem("Locale");
            fileExit = new JMenuItem("exit");
            fileSave = new JMenuItem("save data");
            etudConsult= new JMenuItem("Consulter etudiant");
            ensConsult = new JMenuItem("Consulter enseignant");
            pfeConsult = new JMenuItem("Consulter PFE");
            juryP = new ViewJuryPanel();
            // inits pages
            cardContainer = new JPanel();
            loginPanel = new MainLoginPage();
            homePage = new HomePage();
            enseignantP = new ViewEnseignantPanel();
            etudiantP = new ViewEtudiantPanel();
            pfeP = new viewPfePanel();
            specialiteP = new ViewSmallClassPanel("Specialité",locList);
            groupeP = new ViewSmallClassPanel("Groupe", null);
            soutenanceP = new ViewSmallClassPanel("Soutenance", null);
            encadreurExtP = new ViewSmallClassPanel("Encadreur Exterieure",null);
            organismeP = new ViewSmallClassPanel("Organisme", null);
            localeP =new ViewSmallClassPanel("Local", locList);
            // inits models
            spList = new ArrayList<>();
            grList = new ArrayList<>();
            locList = new ArrayList<>();
            orgList = new ArrayList<>();
            encExtList= new ArrayList<>();
            
            this.setUndecorated(true);
            // Setup menu bar
            {
                mb.setBackground(Color.white);
                mb.setOpaque(true);
                
                etudiant.add(etudConsult);
                enseignant.add(ensConsult);
                pfe.add(pfeConsult);
                file.add(fileExit);
                file.add(fileSave);
                jury.add(juryConsult); // sa propre façon de lecture
                jury.add(jurySoutenance);
                param.addSeparator();
                param.add(paramGroupe);
                param.add(paramSpecialite);
                param.addSeparator();
                param.add(paramOrganismeExt);
                param.add(paramEncadreurExt);
                param.add(paramLocal);
                mb.add(file);
                mb.add(pfe);
                mb.add(jury);
                mb.add(etudiant);
                mb.add(enseignant);
                mb.add(param);
            }
            // setup this cardContainer & ActionListeners
            {
                cardContainer.setLayout(cl);
                cardContainer.add(loginPanel,"1");
                cardContainer.add(homePage,"2");
                cardContainer.add(specialiteP,"Specialité");
                cardContainer.add(groupeP,"Groupe");
                cardContainer.add(soutenanceP,"Soutenance");
                cardContainer.add(localeP,"Local");
                cardContainer.add(organismeP,"Organisme");
                cardContainer.add(encadreurExtP,"Encadreur Exterieure");
                cardContainer.add(enseignantP,"Enseignant");
                cardContainer.add(etudiantP,"Etudiant");
                cardContainer.add(pfeP, "PFE");
                cardContainer.add(juryP,"Jury");
                cl.show(cardContainer,"1");
                // setup button events
                loginPanel.getAuthBtn().addActionListener(e->{
                    this.setJMenuBar(mb);
                    cl.show(cardContainer,"2");
                });

                homePage.getEnseignantBtn().addActionListener(l->{
                    cl.show(cardContainer, "Enseignant");
                });
                homePage.getEtudiantBtn().addActionListener(l->{
                    cl.show(cardContainer, "Etudiant");
                });
                // paramètres page
                paramSpecialite.addActionListener(l->{
                    cl.show(cardContainer,"Specialité");
                });
                paramGroupe.addActionListener(l->{
                    cl.show(cardContainer,"Groupe");
                });
                paramEncadreurExt.addActionListener(l->{
                    cl.show(cardContainer,"Encadreur Exterieure");
                });
                paramLocal.addActionListener(l->{
                    cl.show(cardContainer,"Local"); 
                });
                paramOrganismeExt.addActionListener(l->{
                    cl.show(cardContainer,"Organisme"); 
                });
                jurySoutenance.addActionListener(l->{
                    cl.show(cardContainer,"Soutenance"); 
                });
                etudConsult.addActionListener(l->{
                    cl.show(cardContainer,"Etudiant");
                });
                ensConsult.addActionListener(l->{
                    cl.show(cardContainer,"Enseignant");
                });
                pfeConsult.addActionListener(l->{
                    cl.show(cardContainer,"PFE");
                });
                juryConsult.addActionListener(l->{
                    cl.show(cardContainer,"Jury");
                });
                homePage.getJuryBtn().addActionListener(l->{
                    cl.show(cardContainer,"Jury");
                });
                homePage.getPfeBtn().addActionListener(l->{
                    cl.show(cardContainer, "PFE");
                });


                fileExit.addActionListener(l->{
                    System.exit(0);
                });

            }
            GraphicsEnvironment graphics =GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = graphics.getDefaultScreenDevice();
            device.setFullScreenWindow(this);

            this.setSize(520,540);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);

            this.add(cardContainer);
            setUpDatabaseData();
	}
        private void setUpDatabaseData() {
            try{
                dbc = new MyDataBaseConnector();
                loadSp();
                loadLoc();
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }
        private void loadSp()throws ClassNotFoundException,SQLException{
            dbc.query("Select * from specialite");
            //System.out.print(dbc.rsMetadata.getColumnName(0)+ " ");
            int i=1;
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                spList.add(new Specialite(res.getString(1), res.getString(2)));
                System.out.println("\n"+dbc.rs.getString(i)+" "+ dbc.rs.getString(i+1));
                
            }
        }
        private void loadLoc()throws ClassNotFoundException,SQLException{
            dbc.query("Select * from Locale");
            int i=1;
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                locList.add(new Local(res.getString(2), Integer.parseInt(res.getString(1))));
                System.out.println("\n"+dbc.rs.getString(i)+" "+ dbc.rs.getString(i+1));
                
            }   
        }
}
//        Change SVG color
//        Function<Color, Color> mapper = null;
//        float[] redHSL = HSLColor.fromRGB(Color.red);
//        mapper = (color -> {
//            float[] hsl = HSLColor.fromRGB(color);
//            return HSLColor.toRGB(redHSL[0], 70.0F, hsl[2]);
//        });
//        FlatSVGIcon.ColorFilter.getInstance().setMapper(mapper);
//        SwingUtilities.windowForComponent(jPanel1).repaint();