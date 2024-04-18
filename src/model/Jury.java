package model;

public class Jury {
    private int idJury;
    private Enseignant president;
    private Groupe type;
    private Local loc;

    public Jury(int idJury, Enseignant president, Groupe type, Local loc) {
        this.idJury = idJury;
        this.president = president;
        this.type = type;
        this.loc = loc;
    }
    public Jury(int idJury, String cinPrez, String nomPrez, String prenomPrez, String gradPrez, String idGr, String idFill, String nomLoc,int numLoc) {
        this.idJury = idJury;
        this.president = new Enseignant(cinPrez, nomPrez, prenomPrez,null,null,null, gradPrez, true);
        this.type = new Groupe(idGr,null,idFill,null);
        this.loc = new Local(nomLoc, numLoc);
    }
    
    public int getIdJury() {
        return idJury;
    }

    public void setIdJury(int idJury) {
        this.idJury = idJury;
    }

    public Enseignant getPresident() {
        return president;
    }

    public void setPresident(Enseignant president) {
        this.president = president;
    }

    public Groupe getType() {
        return type;
    }

    public void setType(Groupe type) {
        this.type = type;
    }

    public Local getLoc() {
        return loc;
    }

    public void setLoc(Local loc) {
        this.loc = loc;
    }
    public static String[] getColumnNames(){
        return new String[] {"IdJury", "nom & prenom president",  "CIN de president", "grad","Fillière","Local"};
    }
    
    
}
