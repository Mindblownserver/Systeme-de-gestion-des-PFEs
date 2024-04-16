package model;

public class Etudiant extends Personne{
    private String NCE;
    public Etudiant(String n, String p, String c, String e,String t,String nce) {
        super(n, p, c,e,t);
        this.NCE = nce;
    }
    public String getNCE() {
        return NCE;
    }
    public void setNCE(String nCE) {
        NCE = nCE;
    }
    /**
     * Deposer le sujet du PFE
     */
    public void deposerSujet(){

    }
    /**
     * Le rendu deposé peut être Rendu 1, 2 (memoire) ou la presentation
     */
    public void deposerRendu(){

    }
    

}
