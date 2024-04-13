package model;

public class OrganismeExt {
    private String nomSc;
    private String idSc;

    public OrganismeExt(String idSc, String nomSc) {
        this.nomSc = nomSc;
        this.idSc=idSc;
    }

    public String getNomSc() {
        return nomSc;
    }

    public void setNomSc(String nomSc) {
        this.nomSc = nomSc;
    }

    public String getIdSc() {
        return idSc;
    }

    public void setIdSc(String idSc) {
        this.idSc = idSc;
    }
    

}
