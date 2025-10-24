public class Medico implements Sanitario, Urgenciable{

    @Override
    public void atenderEmergencia(String emergencia) {
     System.out.println("Atiende pacientes y emergencias");
    }

    @Override
    public int getNivelUrgencia() {
        return 2;
    }

    @Override
    public void atenderPaciente(String paciente) {
        System.out.println("Atendiendo paciente: " + paciente);
    }

    @Override
    public String obtenerEspecialidad() {
        return "Medicina General";
    }
    @Override
    
    public String toString() {
        
        return "Atiende pacientes y emergencias\n";
                        
    }


}
