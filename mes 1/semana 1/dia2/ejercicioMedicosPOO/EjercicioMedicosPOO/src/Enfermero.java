public class Enfermero implements Sanitario{

    @Override
    public void atenderPaciente(String paciente) {
        System.out.println("Atendiendo paciente: " + paciente);
    }

    @Override
    public String obtenerEspecialidad() {
        return "Enfermería";
    }
     @Override
    
    public String toString() {
        
        return "Solo atiende pacientes básicos\n";
                        
    }


}
