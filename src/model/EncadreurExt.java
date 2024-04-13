package model;

public class EncadreurExt extends Personne{
    private String poste;
    private String theme;
    private OrganismeExt societe;
    public EncadreurExt(String n, String p, String c, String theme,String poste, OrganismeExt societe) {
        super(n, p, c);
        this.theme = theme;
        this.poste = poste;
        this.societe = societe;
    }
    public String getPoste() {
        return poste;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    }
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public OrganismeExt getSociete() {
        return societe;
    }
    public void setSociete(OrganismeExt societe) {
        this.societe = societe;
    }
    

}
