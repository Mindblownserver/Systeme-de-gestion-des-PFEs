package model;

import java.util.Set;
import java.util.TreeSet;

public class Specialite implements ColumnNames{
    private String fillier;
    private String idFill;
    private static int columnCount=2;
    private static Set<String> ids=new TreeSet<>();
    public Specialite(String id, String fillier) {
        this.fillier=fillier;
        idFill=id;
        ids.add(idFill);
    }

    public String getFillier() {
        return fillier;
    }

    public void setFillier(String fillier) {
        this.fillier = fillier;
    }

    public String getIdFill() {
        return idFill;
    }

    public void setIdFill(String idFill) {
        this.idFill = idFill;
    }
    public boolean equals(Object o){
        if(o instanceof Specialite){
            Specialite aux = (Specialite)o;
            return aux.idFill.equals(idFill);
        }
        else
            return false;
    }
    public static int getColumnCount(){
        return columnCount;
    }

    public static String[] getFilliers(){
        return ids.toArray(new String[0]);
    }
    @Override
    public String[] getColumnNames() {
        String [] res = {"Id Filliere","Filliere"};
        return res;
    }
    
}
