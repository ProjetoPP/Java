import java.util.*;

public class Teste {
    
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Hospital h1 = new Hospital();
        
        h1.setNomeHospital("O meu Hospital");
        h1.setCodigoHospital("123");
        
        System.out.println("nome: " + h1.getNomeHospital()); 
        
        System.out.println("codigo: " + h1.getCodigoHospital());
    
        Enfermaria e1 = new Enfermaria("444", "normal", "23");
        
        System.out.println("enfermaria 1: " + e1);
        
        System.out.println("cod enfermaria: " + e1.getCodigoEnfermaria());
    
        Equipamento eq1 = new Equipamento();
        
        Doente d1 = new Doente();
        
        d1.setNomeDoente("Tommy Shelby");
        d1.setGravidadeEstado("MUITO GRAVE");
        d1.setCodigoDoente("333");
        
        System.out.println ("Doente nome: " + d1.getNomeDoente() + ", estado do paciente: " + d1.getGravidadeEstado());
        
        Doente d2 = new Doente();
        d2.setCodigoDoente("123");
        d2.setNomeDoente("Alberto");
        
        ListaDoentes doentes1 = new ListaDoentes();
        doentes1.add(d1);
        doentes1.add(d2);
        
        System.out.println(doentes1);
        
        ProfissionalSaude ps1 = new ProfissionalSaude("123", "Bernardo", "GuiEnfer");
        ProfissionalSaude ps2 = new ProfissionalSaude("133", "Leandro", "GuiEnfermaria");
        
        ListaProfissionalSaude lista1 = new ListaProfissionalSaude();
        
        lista1.add(ps1);
        lista1.add(ps2);
        
        System.out.println(lista1);
        
        lista1.remove(ps1);
        
        System.out.println(lista1);
    }
}
