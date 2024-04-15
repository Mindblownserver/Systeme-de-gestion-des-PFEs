package model;

public class OrganismeExt implements ColumnNames{
    private String nomSc;
    private String idSc;
    private String domAct;
    private String addresse;
    private static int columnCount = 4;

    public OrganismeExt(String idSc, String nomSc, String dom,String address) {
        this.nomSc = nomSc;
        this.idSc=idSc;
        domAct=dom;
        addresse = address;
    }

    public String getNomSc() {
        return nomSc;
    }

    public void setNomSc(String nomSc) {
        this.nomSc = nomSc;
    }

    public String getIdSc() {
        return idSc;
    }

    public void setIdSc(String idSc) {
        this.idSc = idSc;
    }
    public String getDomAct(){
        return domAct;
    }
    public String getAdress(){
        return addresse;
    }
    public static int getColumnCount(){
        return columnCount;
    }
    @Override
    public String[] getColumnNames() {
        String [] res = {"Id Societé","Nom Société", "Domaine d'activité", "adresse"};
        return res;
    }
}
