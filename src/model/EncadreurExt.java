package model;

public class EncadreurExt extends Personne implements ColumnNames{
    private String poste;
    private OrganismeExt societe;
    private static int columnCount = 10;
    public EncadreurExt(String n, String p, String c,String e,String t,String poste, OrganismeExt societe) {
        super(n, p, c,e,t);
        this.poste = poste;
        this.societe = societe;
    }
    public EncadreurExt(String n, String p, String c,String e,String t,String poste, String idSc, String nomSc, String domAct, String adresse) {
        super(n, p, c,e,t);
        this.poste = poste;
        this.societe = new OrganismeExt(idSc, nomSc, domAct, adresse);
    }
    public String getPoste() {
        return poste;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    }
    public OrganismeExt getSociete() {
        return societe;
    }
    public void setSociete(OrganismeExt societe) {
        this.societe = societe;
    }
    
    
    public static int getColumnCount(){
        return columnCount;
    }

    @Override
    public String[] getColumnNames() {
        String[]res = {"Nom & Prenom", "Cin","Email","tel","Poste","id Société","Nom société","domaine d'activité de la société","adresse"};
        return res;
    }
    

}
