package models;

public class Specialite {
    private String fillier;
    private String idFill;

    public Specialite(String id, String fillier) {
        this.fillier=fillier;
        idFill=id;
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
    
    
}
