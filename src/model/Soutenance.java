package models;

import java.util.Date;

public class Soutenance {
    private Date date;
    private String heure;
    private Boolean isValid = false;
    private Local locale;
    private Enseignant Examinateur;
    private PFE pfe;
    public Soutenance() {
    }

    /**
     * @param b 
     * @return
     */
    public void setValid(Boolean b) {
        isValid = b;
    }

    /**
     * @param date 
     * @param heure 
     * @param loc 
     * @return
     */
    public Boolean PlannifierSoutenance(Date date, Integer heure, Local loc) {
        return false;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Local getLocale() {
        return locale;
    }

    public void setLocale(Local locale) {
        this.locale = locale;
    }

    public Enseignant getExaminateur() {
        return Examinateur;
    }

    public void setExaminateur(Enseignant examinateur) {
        Examinateur = examinateur;
    }

    public PFE getPfe() {
        return pfe;
    }

    public void setPfe(PFE pfe) {
        this.pfe = pfe;
    }

    
}
