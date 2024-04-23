package model;

public class Personne {
    private String nom;
    private String prenom;
    private String cin;
    private String email,tel;
    

    public Personne(String c,String n, String p,  String e, String t){
        nom=n;prenom=p;cin=c;email=e;tel=t;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return prenom +" "+ nom+ ","+cin ;
    }
    
    
    
    
}
