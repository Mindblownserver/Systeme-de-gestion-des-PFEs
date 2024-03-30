/* package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Encadreur extends Enseignant{
    private ArrayList<String> themes;

    public Encadreur(String nom, String prenom, String cin, String poste, Fiche journal, String ...themes) {
        super(nom, prenom, cin, poste,journal);
        this.themes = new ArrayList<>(Arrays.asList(themes));
    }
    public Encadreur(String nom, String prenom, String cin, String poste, String ...themes) {
        super(nom, prenom, cin, poste);
        this.themes = new ArrayList<>(Arrays.asList(themes));
    }
    public String toString(){
        return "Encadreur:\nNom et prenom:"+getNom()+" "+ getPrenom();
    }

    @Override
    public void deposerFiche() {
        // Journal encadreur
    }
    public void modifierFiche(){
        
    }
    public ArrayList<String> getThemes() {
        return themes;
    }
    public void setThemes(ArrayList<String> themes) {
        this.themes = themes;
    }
    
}
 */