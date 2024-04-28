package model;

public class EncadreurExt extends Personne implements ColumnNames{
    private String poste;
    private OrganismeExt societe;
    private static int columnCount = 10;
    public EncadreurExt(String n, String p, String c,String e,String t,String poste, OrganismeExt societe) {
        super(c, n, p,e,t);
        this.poste = poste;
        this.societe = societe;
    }
    public EncadreurExt(String n, String p, String c,String e,String t,String poste, String idSc, String nomSc, String domAct, String adresse) {
        super(c, n, p,e,t);
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
    public static String[] getColumnNames() {
        String[]res = {"Cin","Prenom","Nom","Email","tel","Poste","id Société"};
        return res;
    }
    public String toString(){
        return super.toString()+":"+societe.getIdSc()+"="+societe.getAdress();
    }
    
    

}
