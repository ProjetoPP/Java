
import java.util.ArrayList;

public class ListaAdministrador {
    
    //Instancia
    private ArrayList<Administrador> ListaAdministrador;

    //construct
    public ListaAdministrador()  {
        ListaAdministrador = new ArrayList<>();
    }

    //devolve a lista
    public ArrayList<Administrador> getListaUtilizador() {
        return ListaAdministrador;
    }

    //adiciona um utilizador a lista
    public boolean add(Administrador e) {
        return ListaAdministrador.add(e);
    }

    //remove um utilizador da lista
    public boolean remove(Administrador o) {
        return ListaAdministrador.remove(o);
    }

    @Override
    public String toString() {
        return "ListaAdministrador{" + "ListaAdministrador=" + ListaAdministrador + '}';
    }

    

    
    

}
