import java.util.Scanner;

public class Equipamento {
    private String codigo;
    private String tipo;
    private String enfermariaAlocado;
    private String disponibiliade; //disponibilidade "livre" ou "em uso"
    private String codigoDoente;
   
    Scanner input = new Scanner(System.in);
    
    public Equipamento () {
    }
    
    public Equipamento (String codigo, String tipo, String enfermariaAlocado, String disponibilidade) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.enfermariaAlocado = enfermariaAlocado;
        this.disponibiliade = disponibilidade;
        
        if (disponibilidade.equals("em uso")) {
            System.out.println("Insira o Codigo de doente que está a usar o equipamento");
            this.codigoDoente = input.next();  
        }   
    }

    public String getCodigoEquipamento() {
        return codigo;
    }

    public void setCodigoEquipamento(String codigoEquipamento) {
        this.codigo = codigoEquipamento;
    }

    public String getTipoEquipamento() {
        return tipo;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipo = tipoEquipamento;
    }

    public String getEnfermariaAlocado() {
        return enfermariaAlocado;
    }

    public void setEnfermariaAlocado(String enfermariaAlocado) {
        this.enfermariaAlocado = enfermariaAlocado;
    }

    public String getDisponibiliade() {
        return disponibiliade;
    }

    public void setDisponibiliade(String disponibiliade) {
        this.disponibiliade = disponibiliade;
    }

    public String getCodigoDoente() {
        return codigoDoente;
    }

    public void setCodigoDoente(String codigoDoente) {
        this.codigoDoente = codigoDoente;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "codigo=" + codigo + ", tipo=" + tipo + ", enfermariaAlocado=" + enfermariaAlocado + ", disponibiliade=" + disponibiliade + ", codigoDoente=" + codigoDoente + ", input=" + input + '}';
    }
    
    
}
