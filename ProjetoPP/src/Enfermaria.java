
public class Enfermaria {
    private String codigo;
    private String tipo;
    private String numeroCamas;
    
    public Enfermaria() {
    }
    
    public Enfermaria(String codigo, String tipo, String numeroCamas) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.numeroCamas = numeroCamas;
    
    }

    public String getCodigoEnfermaria() {
        return codigo;
    }

    public void setCodigoEnfermaria(String codigoEnfermaria) {
        this.codigo = codigoEnfermaria;
    }

    public String getTipoEnfermaria() {
        return tipo;
    }

    public void setTipoEnfermaria(String tipoEnfermaria) {
        this.tipo = tipoEnfermaria;
    }

    public String getNumeroCamasEnfermaria() {
        return numeroCamas;
    }

    public void setNumeroCamasEnfermaria(String numeroCamasEnfermaria) {
        this.numeroCamas = numeroCamasEnfermaria;
    }

    @Override
    public String toString() {
        return "Enfermaria{" + "codigo=" + codigo + ", tipo=" + tipo + ", numeroCamas=" + numeroCamas + '}';
    }
    
    
}
