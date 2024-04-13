package model;

import java.util.List;
import java.util.Arrays;

public class Enseignant extends Personne{
    private String poste;
    private List<String> theme;

    public Enseignant(String n, String p, String c, String poste, String ...theme) {
        super(n, p, c);
        this.poste = poste;
        this.theme= Arrays.asList(theme);
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public List<String> getTheme() {
        return theme;
    }

    public void setTheme(List<String> theme) {
        this.theme = theme;
    }
    /**
     * Un enseignant d'un PFE doit le faire
     * relié au PFE auquel il est un encadreur
     */
    public void deposerJournalEncadeur(){

    }
    /**
     * Un enseignant d'un PFE doit le faire
     * relié au PFE auquel il est un rapporteur
     */
    public void deposerRapport(){

    }
}

/* public Fiche getJournal(){return null;}

public void modifierJournal(Fiche nouveauJournal){journal=nouveauJournal;}
 */