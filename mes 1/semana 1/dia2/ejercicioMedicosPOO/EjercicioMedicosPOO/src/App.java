import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplo de proyecto Java");

        List<Object> listaPersonalDelHOrpital = new ArrayList<>();
        listaPersonalDelHOrpital.add(new Medico());
        listaPersonalDelHOrpital.add(new Cirujano());
        listaPersonalDelHOrpital.add(new Enfermero());
        listaPersonalDelHOrpital.add(new InvestigadorMedico());
        listaPersonalDelHOrpital.add(new Residente());

        for(Object persinal:listaPersonalDelHOrpital){
            System.out.println(persinal.toString());
        }
        for (Object persona : listaPersonalDelHOrpital) {
            
    String nombreClase = persona.getClass().getSimpleName();
    int capacidades = 0;
    
    System.out.println("\n🧑‍⚕️ " + nombreClase + ":");
    
    StringBuilder habilidades = new StringBuilder();
    
    if (persona instanceof Sanitario) {
        habilidades.append("  • Atender pacientes\n");
        capacidades++;
    }
    if (persona instanceof Investigador) {
        habilidades.append("  • Investigar\n");
        capacidades++;
    }
    if (persona instanceof Docente) {
        habilidades.append("  • Enseñar\n");
        capacidades++;
    }
    if (persona instanceof Urgenciable) {
        habilidades.append("  • Urgencias (nivel " + ((Urgenciable) persona).getNivelUrgencia() + ")\n");
        capacidades++;
    }
    
    if (capacidades > 0) {
        System.out.println("  Capacidades: " + capacidades);
        System.out.print(habilidades.toString());
    } else {
        System.out.println("  ❌ Sin capacidades registradas");
    }
}

    }
}
