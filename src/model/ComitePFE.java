package model;

public class ComitePFE {
    private Personne Responsable;

    public ComitePFE(Personne responsable) {
        Responsable = responsable;
    }

    public Personne getResponsable() {
        return Responsable;
    }

    public void setResponsable(Personne responsable) {
        Responsable = responsable;
    }
    
    /**
     * Comité Approuve Le sujet du PFE
     * @param sujet
     * @return true(approbed) or false (otherwise)
     */
    public boolean ApprouverSujet(String sujet){
        return false;
    }
    /**
     * Plannifier La soutenance (relié à la soutenance) d'un PFE
     */
    public void plannifierSoutenance(){

    }
    /**
     * Choisir Le jury (relié au jury) pour un PFE
     */
    public void choisirJury(){

    }
    /**
     * Definir la calendrier d'un PFE
     */
    public void definirLaCalendrier(){

    }
    
}
