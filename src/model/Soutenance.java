package model;

import java.util.Date;

public class Soutenance {
    private int idSout;
    private Date date;
    private String heure;
    private boolean isValid;
    private Enseignant examinateur;
    private int idJury;
    private int idPfe=-1;
    //IDSOU, DATESOUT, HEURE, ISVALID, EXAMINATEUR, IDJURY

    public Soutenance(int id, Date date, String heure, boolean isValid, String cinExam, String nomExam,String prenomExam,int idJury) {
        this.idSout = id;
        this.date = date;
        this.heure = heure;
        this.examinateur = new Enseignant(cinExam,nomExam,prenomExam,null,null,null,null);
        this.idJury = idJury;
        this.isValid = isValid;
    }
    public Soutenance(int id, Date date, String heure, boolean isValid, String cinExam,String nomExam,String prenomExam, int idJury,int pfe) {
        this.idSout = id;
        this.date = date;
        this.heure = heure;
        this.examinateur = new Enseignant(cinExam,nomExam,prenomExam,null,null,null,null);
        this.idJury = idJury;
        this.isValid = isValid;
        this.idPfe = pfe;
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

    public Enseignant getExaminateur() {
        return examinateur;
    }

    public void setExaminateur(Enseignant examinateur) {
        this.examinateur = examinateur;
    }

    public int getIdJury() {
        return idJury;
    }

    public int getIdSout() {
        return idSout;
    }
    public String toString(){
        return examinateur.getPrenom()+" "+ examinateur.getNom()+","+idSout+","+examinateur.getCin();
    }
}
