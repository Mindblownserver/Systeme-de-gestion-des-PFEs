package models;

import java.util.Date;

public class Calendrier {
    private Date Rendu1;
    private Date Rendu2;
    private Date Soutenance;
    public Calendrier(Date rendu1, Date rendu2, Date soutenance) {
        Rendu1 = rendu1;
        Rendu2 = rendu2;
        Soutenance = soutenance;
    }
    public Date getRendu1() {
        return Rendu1;
    }
    public void setRendu1(Date rendu1) {
        Rendu1 = rendu1;
    }
    public Date getRendu2() {
        return Rendu2;
    }
    public void setRendu2(Date rendu2) {
        Rendu2 = rendu2;
    }
    public Date getSoutenance() {
        return Soutenance;
    }
    public void setSoutenance(Date soutenance) {
        Soutenance = soutenance;
    }
    
}
