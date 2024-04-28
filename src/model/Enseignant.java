package model;

public class Enseignant extends Personne implements ColumnNames{
    private String grad;
    private boolean canBePresident;
    private String photo;

    public Enseignant(String c, String n, String p, String photo,String e,String t, String grad, boolean cBePrez) {
        super(c,n, p,e,t);
        this.photo = photo;
        this.grad = grad;
        canBePresident =cBePrez;
    }
    public Enseignant(String c, String n, String p, String photo,String e,String t, String grad) {
        super(c,n, p,e,t);
        this.photo = photo;
        this.grad = grad;
        canBePresident =false;
    }
    
    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public boolean isCanBePresident() {
        return canBePresident;
    }

    public void setCanBePresident(boolean canBePresident) {
        this.canBePresident = canBePresident;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
    public static String[] getColumnNames() {
        return new String[]{"Cin","Prenom","Nom","Photo","Grad","Email","Tel", "Peut être president"};
    }
}
