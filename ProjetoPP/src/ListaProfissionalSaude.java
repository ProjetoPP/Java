import java.util.*;

public class ListaProfissionalSaude extends ProfissionalSaude {
    
    //Instancia
    private ArrayList<ProfissionalSaude> ListaProfissionalSaude;

    
    public ListaProfissionalSaude() {
        ListaProfissionalSaude = new ArrayList<>();
    }

    //devolve a lista de doentes
    public ArrayList<ProfissionalSaude> getListaProfissionalSaude() {
        return ListaProfissionalSaude;
    }
    
    //inserir um novo profissional de saude
    public boolean add(ProfissionalSaude e) {
        return ListaProfissionalSaude.add(e);
    }

    //remover um profissional de saude
    public boolean remove(Object o) {
        return ListaProfissionalSaude.remove(o);
    }
    
    
    @Override
    public String toString() {
        return "Lista de Profissionais de Saude{" + ListaProfissionalSaude + "}";
    }

}
