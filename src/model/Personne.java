package model;

public class Personne {
    private String nom;
    private String prenom;
    private String cin;

    public Personne(String n, String p, String c){
        nom=n;prenom=p;cin=c;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    
}
