package model;

public class Etudiant extends Personne implements ColumnNames{
    private String NCE;
    private String photo;
    private boolean hasBinome;
    private static int columnCount = 6;
    public Etudiant(String c,String n, String p, String ph, String e,String t,String nce, boolean hasBinome) {
        super(c,n, p,e,t);
        this.NCE = nce;
        photo = ph;
        this.hasBinome = hasBinome;
    }
    public String getNCE() {
        return NCE;
    }
    public void setNCE(String nCE) {
        NCE = nCE;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isHasBinome() {
        return hasBinome;
    }

    public void setHasBinome(boolean hasBinome) {
        this.hasBinome = hasBinome;
    }
    
    public static String[] getColumnNames() {
        return new String[]{"Cin","Prenom","Nom","Photo","Nce","Email","Tel","A un binôme"};
    }
   
    
}
