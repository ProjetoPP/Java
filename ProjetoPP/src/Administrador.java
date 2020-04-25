public class Administrador extends Utilizador {
    private String cargo;
    private String nome;
    
    public Administrador() {
        
    }
    
    public Administrador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Administrador{" + "cargo=" + cargo + ", nome=" + nome + '}';
    }

    
    
    
    
}
