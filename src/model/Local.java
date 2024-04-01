package models;

import java.util.List;

// A changer l'exception

public class Local {
    private int NumSalle;
    private String salle;
    private static List<String> ids;
    public Local(String salle, int NumSalle) throws Exception{
        this.NumSalle = NumSalle;
        this.salle = salle;
        if (ids.contains(salle+ " "+NumSalle))
            throw new Exception();
        else
            ids.add(salle+ " "+NumSalle);
    }
    public int getNumSalle() {
        return NumSalle;
    }
    public void setNumSalle(int numSalle) {
        NumSalle = numSalle;
    }
    public String getSalle() {
        return salle;
    }
    public void setSalle(String salle) {
        this.salle = salle;
    }
    
}
