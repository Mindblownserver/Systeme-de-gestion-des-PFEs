package models;

import java.util.Date;
import java.util.Map;

public class PFE {

    /**
     * Default constructor
     */
    public PFE() {
    }
    private Integer id;
    private String theme;
    private String Sujet;
    private Groupe type;
    private Boolean isApproved;
    private String description;
    private Integer annéee;
    private Enseignant rapporteur;
    private Enseignant encadreurInt;
    private EncadreurExt encadreurExt;
    private Etudiant first;
    private Etudiant second;
    private int nbEtudiant;
    private Map<Date,Map.Entry<String,String>> JournalEncadreur;
    private Map<Date,Map.Entry<String,String>> Rapport;
    private Rendu memoire;
    private Rendu presentation;
    private Calendrier deadlines;
    private Soutenance soutenance;

    /**
     * @param memoire  
     * @param presentation
     * @return
     */
    public Boolean deposerRendu(Rendu rendu) {
        return null;
    }

    public Boolean deposerSujet() {
        return null;
    }

    public Boolean modifierRendu() {
        return null;
    }

    /**
     * @param fiche À changer
     * @return  À changer
     */
    public void deposerJournalEncadreur(Rendu fiche) { 
        return;
    }

    /**
     * @param fiche À changer
     * @return À changer
     */
    public void deposerFicheRapporteur(Rendu fiche) {
        return;
    }

    /**
     * @param approuve 
     * @return
     */
    public void SujetApprouvee(Boolean approuve) {
        return;
    }

    /**
     * @param rendu1 
     * @param rendu2 
     * @param soutenance 
     * @return
     */
    public void definirCalendrier(Date rendu1, Date rendu2, Date soutenance) {
        return;
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

    public void setSujet(String sujet) {
        Sujet = sujet;
    }

    public Groupe getType() {
        return type;
    }

    public void setType(Groupe type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAnnéee() {
        return annéee;
    }

    public void setAnnéee(Integer annéee) {
        this.annéee = annéee;
    }

    public Enseignant getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(Enseignant rapporteur) {
        this.rapporteur = rapporteur;
    }

    public Enseignant getEncadreurInt() {
        return encadreurInt;
    }

    public void setEncadreurInt(Enseignant encadreurInt) {
        this.encadreurInt = encadreurInt;
    }

    public EncadreurExt getEncadreurExt() {
        return encadreurExt;
    }

    public void setEncadreurExt(EncadreurExt encadreurExt) {
        this.encadreurExt = encadreurExt;
    }

    public Etudiant getFirst() {
        return first;
    }

    public void setFirst(Etudiant first) {
        this.first = first;
    }

    public Etudiant getSecond() {
        return second;
    }

    public void setSecond(Etudiant second) {
        this.second = second;
    }

    public int getNbEtudiant() {
        return nbEtudiant;
    }

    public void setNbEtudiant(int nbEtudiant) {
        this.nbEtudiant = nbEtudiant;
    }

    public Map<Date, Map.Entry<String, String>> getJournalEncadreur() {
        return JournalEncadreur;
    }

    public void setJournalEncadreur(Map<Date, Map.Entry<String, String>> journalEncadreur) {
        JournalEncadreur = journalEncadreur;
    }

    public Map<Date, Map.Entry<String, String>> getRapport() {
        return Rapport;
    }

    public void setRapport(Map<Date, Map.Entry<String, String>> rapport) {
        Rapport = rapport;
    }

    public Rendu getMemoire() {
        return memoire;
    }

    public void setMemoire(Rendu memoire) {
        this.memoire = memoire;
    }

    public Rendu getPresentation() {
        return presentation;
    }

    public void setPresentation(Rendu presentation) {
        this.presentation = presentation;
    }

    public Soutenance getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Soutenance soutenance) {
        this.soutenance = soutenance;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public Calendrier getDeadlines() {
        return deadlines;
    }
    

}