public class Utilizador {
    private String nome;
    
    public Utilizador(){
        
    }
    
    public Utilizador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "nome=" + nome + '}';
    }
    
    
    
}
