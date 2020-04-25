import java.util.*;

public class ListaDoentes extends Doente {
    
    //Instancia
    private ArrayList<Doente> ListaDoentes;
    
    public ListaDoentes() {
        ListaDoentes = new ArrayList<>();
    }

    //devolve a lista de doentes
    public ArrayList<Doente> getListaDoentes() {
        return ListaDoentes;
    }

    
    //inserir um novo doente (fim da lista)
    public boolean add(Doente d) {
        return ListaDoentes.add(d);
    }

    //remover um doente
    public boolean remove(Doente o) {
        return ListaDoentes.remove(o);
    }
    
    

    @Override
    public String toString() {
        return "listaDoentes{" + "listaDoentes=" + ListaDoentes + '}';
    }
  
}
