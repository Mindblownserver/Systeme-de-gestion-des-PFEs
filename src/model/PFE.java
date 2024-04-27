package model;

import java.util.Date;

public class PFE {

    /**
     *  DUREESTAGE, ISAPPROVED, ISSCHEDULED, ISVALIDBYRAPP, "
    + "ISMONOME, HASINTERNSHIP, ISINTERNSHIPLOCAL, DATEDEBUT, DATEFIN, DATER1, DATER2, ENCADEUREXT, "
    + "FIRSTETU, SECONDETU, ENCADREUR, RAPPORTEUR, IDGR, IDFILL, IDSOU from PFE
     */
    public PFE() {
    }
    private int id;
    private String theme;
    private String Sujet;
    private String description;
    private Groupe type;
    private int annee;
    private Date dateDebut;
    private int dureeStage; // en mois
    private Date dateFin;
    private Date dateR1; // date de la mise du rapport 1
    private Date dateR2; // date de la mise du rapport 2
    private String encadreurExt;
    private String firstEtu;
    private String secondEtu;
    private String encadIsimm;
    private String rappIsimm;
    private String idSout;
    private boolean isApproved;
    private boolean isScheduled;
    private boolean isValidByRapp;
    private boolean isMonome;
    private boolean hasInternship;
    private boolean isInternshipLocal;

    public PFE(int id, String theme, String Sujet, String description, String idGr, String idFill, int annee, Date dateDebut, int dureeStage, Date dateFin, Date dateR1, Date dateR2, String encadreurExt, String firstEtu, String secondEtu, String encadIsimm, String rappIsimm, String idSout, boolean isApproved, boolean isScheduled, boolean isValidByRapp, boolean isMonome, boolean hasInternship, boolean isInternshipLocal) {
        this.id = id;
        this.theme = theme;
        this.Sujet = Sujet;
        this.description = description;
        this.type = new Groupe(idGr, null, idFill, null);
        this.annee = annee;
        this.dateDebut = dateDebut;
        this.dureeStage = dureeStage;
        this.dateFin = dateFin;
        this.dateR1 = dateR1;
        this.dateR2 = dateR2;
        this.encadreurExt = encadreurExt;
        this.firstEtu = firstEtu;
        this.secondEtu = secondEtu;
        this.encadIsimm = encadIsimm;
        this.rappIsimm = rappIsimm;
        this.idSout = idSout;
        this.isApproved = isApproved;
        this.isScheduled = isScheduled;
        this.isValidByRapp = isValidByRapp;
        this.isMonome = isMonome;
        this.hasInternship = hasInternship;
        this.isInternshipLocal = isInternshipLocal;
    }
    public static String[] getColumnNames(){
        return new String []{"ID ", "Ann\u00e9e", "Trait\u00e9 en", "Nature", "Filliere", "Date debut", "Dur\u00e9e", "Date Fin", "Approuv\u00e9", "Valid\u00e9 par Rapporteur", "Plannifi\u00e9", "A un Stage"};
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String Sujet) {
        this.Sujet = Sujet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Groupe getType() {
        return type;
    }

    public void setType(Groupe type) {
        this.type = type;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDureeStage() {
        return dureeStage;
    }

    public void setDureeStage(int dureeStage) {
        this.dureeStage = dureeStage;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateR1() {
        return dateR1;
    }

    public void setDateR1(Date dateR1) {
        this.dateR1 = dateR1;
    }

    public Date getDateR2() {
        return dateR2;
    }

    public void setDateR2(Date dateR2) {
        this.dateR2 = dateR2;
    }

    public String getEncadreurExt() {
        return encadreurExt;
    }

    public void setEncadreurExt(String encadreurExt) {
        this.encadreurExt = encadreurExt;
    }

    public String getFirstEtu() {
        return firstEtu;
    }

    public void setFirstEtu(String firstEtu) {
        this.firstEtu = firstEtu;
    }

    public String getSecondEtu() {
        return secondEtu;
    }

    public void setSecondEtu(String secondEtu) {
        this.secondEtu = secondEtu;
    }

    public String getEncadIsimm() {
        return encadIsimm;
    }

    public void setEncadIsimm(String encadIsimm) {
        this.encadIsimm = encadIsimm;
    }

    public String getRappIsimm() {
        return rappIsimm;
    }

    public void setRappIsimm(String rappIsimm) {
        this.rappIsimm = rappIsimm;
    }

    public String getIdSout() {
        return idSout;
    }

    public void setIdSout(String idSout) {
        this.idSout = idSout;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean isIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public boolean isIsValidByRapp() {
        return isValidByRapp;
    }

    public void setIsValidByRapp(boolean isValidByRapp) {
        this.isValidByRapp = isValidByRapp;
    }

    public boolean isIsMonome() {
        return isMonome;
    }

    public void setIsMonome(boolean isMonome) {
        this.isMonome = isMonome;
    }

    public boolean isHasInternship() {
        return hasInternship;
    }

    public void setHasInternship(boolean hasInternship) {
        this.hasInternship = hasInternship;
    }

    public boolean isIsInternshipLocal() {
        return isInternshipLocal;
    }

    public void setIsInternshipLocal(boolean isInternshipLocal) {
        this.isInternshipLocal = isInternshipLocal;
    }
    
    
}