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
        private ViewSpecialitePanel specialiteP;
        private ViewGroupePanel groupeP;
        private ViewEncadreurExternePanel encadreurExtP;
        private ViewOrganismePanel organismeP;
        private ViewLocalPanel localeP;
        // declaring list of Models
        private MyDataBaseConnector dbc;
        private List<Specialite> spList = new ArrayList<>();
        private List<Groupe> grList= new ArrayList<>();
        private List<Local> locList= new ArrayList<>();
        private List<OrganismeExt> orgList= new ArrayList<>();
        private List<EncadreurExt> encExtList= new ArrayList<>();
        private List<Enseignant> ensList = new ArrayList<>();
        private List<Etudiant> etuList = new ArrayList<>();
        private List<Jury> juryList = new ArrayList<>();
        private List<PFE> pfeList = new ArrayList<>();
        private List<Soutenance> soutList = new ArrayList<>();
        
        
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
            // inits models

            setUpDatabaseData();

            // inits pages
            cardContainer = new JPanel();
            loginPanel = new MainLoginPage();
            homePage = new HomePage();
            enseignantP = new ViewEnseignantPanel(Enseignant.getColumnNames(),ensList);
            etudiantP = new ViewEtudiantPanel(Etudiant.getColumnNames(),etuList);
            pfeP = new viewPfePanel(PFE.getColumnNames(), pfeList, ensList, encExtList, etuList,grList,soutList);
            specialiteP = new ViewSpecialitePanel("Specialité",spList, null);
            groupeP = new ViewGroupePanel("Groupe", grList, Specialite.getFilliers());
            encadreurExtP = new ViewEncadreurExternePanel("Encadreur Exterieure",encExtList, OrganismeExt.getOrgs());
            organismeP = new ViewOrganismePanel("Organisme", orgList, null);
            localeP =new ViewLocalPanel("Local", locList, null);
            juryP = new ViewJuryPanel(Jury.getColumnNames(), juryList, ensList,soutList);
            
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
                    groupeP = new ViewGroupePanel("Groupe", grList, Specialite.getFilliers());
                    cardContainer.add(groupeP,"Groupe");
                    cl.show(cardContainer,"Groupe");
                });
                paramEncadreurExt.addActionListener(l->{
                    encadreurExtP = new ViewEncadreurExternePanel("Encadreur Exterieure",encExtList, OrganismeExt.getOrgs());
                    cardContainer.add(encadreurExtP,"Encadreur Exterieure");
                    cl.show(cardContainer,"Encadreur Exterieure");
                });
                paramLocal.addActionListener(l->{
                    cl.show(cardContainer,"Local"); 
                });
                paramOrganismeExt.addActionListener(l->{
                    cl.show(cardContainer,"Organisme"); 
                });
                etudConsult.addActionListener(l->{
                    cl.show(cardContainer,"Etudiant");
                });
                ensConsult.addActionListener(l->{
                    cl.show(cardContainer,"Enseignant");
                });
                pfeConsult.addActionListener(l->{
                    pfeP = new viewPfePanel(PFE.getColumnNames(), pfeList, ensList, encExtList, etuList,grList,soutList);
                    cardContainer.add(pfeP, "PFE");
                    cl.show(cardContainer,"PFE");
                });
                juryConsult.addActionListener(l->{
                    juryP = new ViewJuryPanel(Jury.getColumnNames(), juryList, ensList,soutList);
                    cardContainer.add(juryP,"Jury");
                    cl.show(cardContainer,"Jury");
                });
                homePage.getJuryBtn().addActionListener(l->{
                    juryP = new ViewJuryPanel(Jury.getColumnNames(), juryList, ensList,soutList);
                    cardContainer.add(juryP,"Jury");
                    
                    cl.show(cardContainer,"Jury");
                });
                homePage.getPfeBtn().addActionListener(l->{
                    pfeP = new viewPfePanel(PFE.getColumnNames(), pfeList, ensList, encExtList, etuList,grList,soutList);
                    cardContainer.add(pfeP, "PFE");
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
	}
        private void setUpDatabaseData() {
            try{
                dbc = new MyDataBaseConnector();
                loadSp();
                loadLoc();
                loadGroup();
                loadOrg();
                loadEncExt();
                loadEns();
                loadEtu();
                loadJury();
                loadPfe();
                loadSout();
                dbc.conn.close();
                
            }catch(Exception e){
                System.out.println("ERROORRRR "+e);
            }
            
            
        }
        private void loadSp()throws ClassNotFoundException,SQLException{
            dbc.query("select * from specialite order by idFill");
            
            //System.out.print(dbc.rsMetadata.getColumnName(0)+ " ");
            ResultSet res = dbc.rs;
            
            while(dbc.rs.next()){
                System.out.println("\n"+res.getString(1)+" "+ dbc.rs.getString(2));
                spList.add(new Specialite(res.getString(1), res.getString(2)));
                
                
            }
        }
        private void loadLoc()throws ClassNotFoundException,SQLException{
            dbc.query("Select * from Loc order by NomSalle");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                locList.add(new Local(res.getString(2), Integer.parseInt(res.getString(1))));
                //System.out.println("\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2));
                
            }   
        }
        private void loadGroup()throws ClassNotFoundException,SQLException{
            dbc.query("Select idGr,libelle,idFill,filliere from Groupe join Specialite using (idFill) order by idGr asc");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                grList.add(new Groupe(res.getString(1),res.getString(2),res.getString(3),res.getString(4)));
                //System.out.println("\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2)+dbc.rs.getString(3)+" "+ dbc.rs.getString(4));
                
            }   
        }
        private void loadOrg()throws ClassNotFoundException,SQLException{
            dbc.query("Select idSc, nomSc, domaineActivite, adresse from OrganismeExt order by idSc asc");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                orgList.add(new OrganismeExt(res.getString(1),res.getString(2),res.getString(3),res.getString(4)));
                //System.out.println("\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2)+dbc.rs.getString(3)+" "+ dbc.rs.getString(4));
                
            }   
        }
        private void loadEncExt()throws ClassNotFoundException,SQLException{
            dbc.query("Select nom, prenom, cin, email, tel,poste, idSc,nomSc,domaineActivite, adresse from EncadreurExt join OrganismeExt using(idSc)");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                encExtList.add(new EncadreurExt(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)));
                //System.out.println("\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2)+dbc.rs.getString(3)+" "+ dbc.rs.getString(4));
                
            }   
        }
        private void loadEns()throws ClassNotFoundException,SQLException{
            dbc.query("Select cin, nom, prenom, photo, email, tel, grad,canBePres from Enseignant");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                ensList.add(new Enseignant(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getBoolean(8)));
                System.out.println("Ens:\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2)+dbc.rs.getString(3)+" "+ dbc.rs.getString(4));
                
            }   
        }
        private void loadEtu()throws ClassNotFoundException,SQLException{
            dbc.query("Select cin, nom, prenom, email, tel, photo,nce,hasBinome from Etudiant ");// add groupe(?)
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                etuList.add(new Etudiant(res.getString(1),res.getString(2),res.getString(3),res.getString(6),res.getString(4),res.getString(5),res.getString(7),res.getBoolean(8)));
                //System.out.println("\n"+dbc.rs.getString(1)+" "+ dbc.rs.getString(2)+dbc.rs.getString(3)+" "+ dbc.rs.getString(4));
                
            }   
        }
        private void loadJury()throws ClassNotFoundException,SQLException{
            dbc.query("Select idJury, president, nom, prenom, grad,idGr, idFill,nomSalle, numSalle from Jury j join Enseignant e on j.president = e.cin order by idJury");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                //System.out.println(res.getInt(1)+ " "+ res.getString(2)+ " "+res.getString(3)+ " "+res.getString(4)+ " "+res.getString(5)+ " "+res.getString(6)+ " "+res.getString(7)+ "s "+ res.getString(8)+ " "+ res.getInt(9));
                juryList.add(new Jury(res.getInt(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getInt(9)));
                
                
            }   
        }
        private void loadSout()throws ClassNotFoundException,SQLException{
            dbc.query("Select IDSOU, DATESOUT, HEURE, ISVALID, EXAMINATEUR, IDJURY, ens.NOM,ens.PRENOM from Soutenance s "
                    + "join Enseignant e on e.cin = s.EXAMINATEUR");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                // IDSOU, DATESOUT, HEURE, ISVALID, EXAMINATEUR, IDJURY
                soutList.add(new Soutenance(res.getInt("IDSou"), res.getDate("DateSout"), res.getString("Heure"), res.getBoolean("IsValid"),
                res.getString("examinateur"),res.getString(7),res.getString(8), res.getInt("IDJURY")));
                
                
            }   
        }
        private void loadPfe()throws ClassNotFoundException,SQLException{
            dbc.query("select IDPFE, THEMEPFE, SUJETPFE, ANNEE, DESCPFE, DUREESTAGE, ISAPPROVED, ISSCHEDULED, ISVALIDBYRAPP, "
                    + "ISMONOME, HASINTERNSHIP, ISINTERNSHIPLOCAL, DATEDEBUT, DATEFIN, DATER1, DATER2, ENCADEUREXT, "
                    + "FIRSTETU, SECONDETU, ENCADREUR, RAPPORTEUR, IDGR, IDFILL, IDSOU from PFE order by idPFE");
            ResultSet res = dbc.rs;
            while(dbc.rs.next()){
                pfeList.add(new PFE(res.getInt(1), res.getString(2), res.getString(3), res.getString(5), res.getString("IDGR"),
                        res.getString("IDFILL"),res.getInt("ANNEE"), res.getDate("DateDebut"), res.getInt("DUREESTAGE"), res.getDate("DATEFIN"), 
                        res.getDate("DATER1"), res.getDate("DATER2"), res.getString("ENCADEUREXT"), res.getString("FIRSTETU"), res.getString("SECONDETU"),
                        res.getString("ENCADREUR"),res.getString("RAPPORTEUR"), res.getString("IDSOU"), res.getBoolean("ISAPPROVED"), 
                        res.getBoolean("ISSCHEDULED"), res.getBoolean("ISVALIDBYRAPP"),res.getBoolean("ISMONOME"),res.getBoolean("HASINTERNSHIP"),
                        res.getBoolean("ISINTERNSHIPLOCAL")));
                
                
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