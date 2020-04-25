import java.util.*;

public class ListaEquipamento extends Equipamento{
    
    //Instancia
    private ArrayList<Equipamento> listaEquipamento;
    
    //constructores
    public ListaEquipamento() {
        listaEquipamento = new ArrayList<>();
    }

    //devolve a lista de equipamentos
    public ArrayList<Equipamento> getListaEquipamento() {
        return listaEquipamento;
    }

    //inserir um novo equipamento
    public boolean add(Equipamento e) {
        return listaEquipamento.add(e);
    }

    //remover um equipamento
    public boolean remove(Equipamento o) {
        return listaEquipamento.remove(o);
    }
    
    

    @Override
    public String toString() {
        return "listaEquipamento{" + "listaEquipamento=" + listaEquipamento + '}';
    }
    
    
}
