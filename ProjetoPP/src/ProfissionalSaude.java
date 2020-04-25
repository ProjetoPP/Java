public class ProfissionalSaude {
    private String codigo;
    private String nome;
    private String enfermariaTrabalho;
    
    public ProfissionalSaude () {
        
    }
    
    public ProfissionalSaude (String codigo, String nome, String enfermariaTrabalho) {
        this.codigo = codigo;
        this.nome = nome;
        this.enfermariaTrabalho = enfermariaTrabalho;
    }

    public String getCodigoProfissional() {
        return codigo;
    }

    public void setCodigoProfissional(String codigoProfissional) {
        this.codigo = codigoProfissional;
    }

    public String getNomeProfissional() {
        return nome;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nome = nomeProfissional;
    }

    public String getEnfermariaTrabalho() {
        return enfermariaTrabalho;
    }

    public void setEnfermariaTrabalho(String enfermariaTrabalho) {
        this.enfermariaTrabalho = enfermariaTrabalho;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "codigo=" + codigo + ", nome=" + nome + ", enfermariaTrabalho=" + enfermariaTrabalho + '}';
    }
    
    
    
    
}
