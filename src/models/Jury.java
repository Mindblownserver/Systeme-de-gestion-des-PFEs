package models;

public class Jury {
    private Enseignant president;
    private Enseignant rapporteur;
    private Enseignant encadreur;
    private Enseignant examinateur;
    private Groupe type;

    /** Plannifier le Jury
     * @param president 
     * @param encadreur 
     * @param rapporteur 
     * @param examinateur 
     * @return
     */
    public Jury(Enseignant president, Enseignant encadreur, Enseignant rapporteur, Enseignant examinateur) {
    }

    public Enseignant getPresident() {
        return president;
    }

    public void setPresident(Enseignant president) {
        this.president = president;
    }

    public Enseignant getRapporteur() {
        return rapporteur;
    }

    public void setRapporteur(Enseignant rapporteur) {
        this.rapporteur = rapporteur;
    }

    public Enseignant getEncadreur() {
        return encadreur;
    }

    public void setEncadreur(Enseignant encadreur) {
        this.encadreur = encadreur;
    }

    public Enseignant getExaminateur() {
        return examinateur;
    }

    public void setExaminateur(Enseignant examinateur) {
        this.examinateur = examinateur;
    }

    public Groupe getType() {
        return type;
    }

    public void setType(Groupe type) {
        this.type = type;
    }

}
