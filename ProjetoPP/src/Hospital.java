
public class Hospital {
    private String nome;
    private String codigo;
    private String localilade;

    public Hospital() {
    }

    public Hospital(String nome, String codigo, String localilade) {
        this.nome = nome;
        this.codigo = codigo;
        this.localilade = localilade;
    }

    
    public String getNomeHospital() {
        return nome;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nome = nomeHospital;
    }

    public String getCodigoHospital() {
        return codigo;
    }

    public void setCodigoHospital(String codigoHospital) {
        this.codigo = codigoHospital;
    }

    public String getLocaliladeHospital() {
        return localilade;
    }

    public void setLocaliladeHospital(String localiladeHospital) {
        this.localilade = localiladeHospital;
    }

    
}   
