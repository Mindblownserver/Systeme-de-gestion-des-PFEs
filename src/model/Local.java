package model;

import java.util.List;

// A changer l'exception

public class Local {
    private int NumSalle;
    private String salle;
    public Local(String salle, int NumSalle){
        this.NumSalle = NumSalle;
        this.salle = salle;
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
