
import java.util.ArrayList;

public class ListaUtilizador {
    
    //Instancia
    private ArrayList<Utilizador> ListaUtilizador;

    //construct
    public ListaUtilizador() {
        ListaUtilizador = new ArrayList<>();
    }

    //devolve a lista
    public ArrayList<Utilizador> getListaUtilizador() {
        return ListaUtilizador;
    }

    //adiciona um utilizador a lista
    public boolean add(Utilizador e) {
        return ListaUtilizador.add(e);
    }

    //remove um utilizador da lista
    public boolean remove(Utilizador o) {
        return ListaUtilizador.remove(o);
    }

    @Override
    public String toString() {
        return "ListaUtilizador{" + "ListaUtilizador=" + ListaUtilizador + '}';
    }

    

    
    
}
