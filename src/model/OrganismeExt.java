package model;

import java.util.Set;
import java.util.TreeSet;

public class OrganismeExt implements ColumnNames{
    private String nomSc;
    private String idSc;
    private String domAct;
    private String addresse;
    private static int columnCount = 4;
    private static Set<String> ids= new TreeSet<>();
    public OrganismeExt(String idSc, String nomSc, String dom,String address) {
        this.nomSc = nomSc;
        this.idSc=idSc;
        domAct=dom;
        addresse = address;
        ids.add(idSc);
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
    public static String[] getOrgs(){
        return ids.toArray(new String[0]);
    }
    @Override
    public String[] getColumnNames() {
        String [] res = {"Id Societé","Nom Société", "Domaine d'activité", "adresse"};
        return res;
    }
}
