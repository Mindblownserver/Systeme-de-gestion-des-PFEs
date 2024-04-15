package model;

public class Groupe implements ColumnNames{
    private String idGr;
    private String libelle;
    private Specialite specialite;
    private static int columnCount=4;
    /**
     * Default Constructor
     * @param libelle
     * @param specialité
     */
    public Groupe(String id,String libelle,Specialite sp){
        this.libelle = libelle;
        specialite=sp;
        idGr=id;

    }
    /**
     * Second Constructor
     * @param libelle
     * @param fillière
     */
    public Groupe(String id,String libelle, String idFilliere, String specialite){
        idGr=id;
        this.libelle = libelle;
        this.specialite= new Specialite(idFilliere,specialite);
    }
    
    public String getIdGr() {
        return idGr;
    }
    public void setIdGr(String idGr) {
        this.idGr = idGr;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Specialite getSpecialite() {
        return specialite;
    }
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    public static int getColumnCount(){
        return columnCount;
    }
    
    @Override
    public String[] getColumnNames() {
        String [] res = {"Id Group","Libelle", "Id Filliere", "Filliere"};
        return res;
    }
}
