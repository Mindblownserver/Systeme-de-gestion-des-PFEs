package model;

import java.util.List;

// A changer l'exception

public class Local implements ColumnNames{
    private int numSalle;
    private String nomSalle;
    private static int columnCount=2;
    private String []columnNames = {"Num Salle","Nom Salle"};
    // implement an interface which has the field column Names!!!!!
    
    public Local(String nom, int num){
        nomSalle = nom;
        numSalle = num;
    }
    public int getNumSalle() {
        return numSalle;
    }
    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }
    public String getNomSalle() {
        return nomSalle;
    }
    public void setNomSalle(String salle) {
        this.nomSalle = salle;
    }
    
    public static int getColumnCount(){
        return columnCount;
    }
    @Override
    public String[] getColumnNames() {
        String [] res = {"Nom Salle","Num Salle"};
        return res;
    }
}
