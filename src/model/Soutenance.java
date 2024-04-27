package model;

import java.util.Date;

public class Soutenance {

    private Date date;
    private String heure;
    private boolean isValid;
    private String examinateur;
    private int idJury;
    private int idSout;
    //IDSOU, DATESOUT, HEURE, ISVALID, EXAMINATEUR, IDJURY

    public Soutenance(int id, Date date, String heure, boolean isValid, String examinateur, int idJury) {
        this.idSout = id;
        this.date = date;
        this.heure = heure;
        this.examinateur = examinateur;
        this.idJury = idJury;
        this.isValid = isValid;
    }

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

    public String getExaminateur() {
        return examinateur;
    }

    public void setExaminateur(String examinateur) {
        this.examinateur = examinateur;
    }

    public int getIdJury() {
        return idJury;
    }

    public int getIdSout() {
        return idSout;
    }

}
