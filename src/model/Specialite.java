package model;

import java.util.ArrayList;
import java.util.List;

public class Specialite implements ColumnNames{
    private String fillier;
    private String idFill;
    private static int columnCount=2;
    public static List<String> ids=new ArrayList<>();
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

    @Override
    public String[] getColumnNames() {
        String [] res = {"Id Filliere","Filliere"};
        return res;
    }
    
}
