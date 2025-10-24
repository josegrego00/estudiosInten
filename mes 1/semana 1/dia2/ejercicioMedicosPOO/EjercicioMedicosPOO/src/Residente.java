public class Residente implements Sanitario, Docente, Urgenciable {

    @Override
    public void atenderEmergencia(String emergencia) {
        
        System.out.println("Atendiendo emergencia: " + emergencia);
    }

    @Override
    public int getNivelUrgencia() {
        System.out.println("Obteniendo nivel de urgencia...");
        return 1;
    }

    @Override
    public void impartirClase(String materia) {
        System.out.println("Impartiendo clase de: " + materia);
    }

    @Override
    public void calificarExamen(String estudiante, double nota) {
        System.out.println("Calificando examen de " + estudiante + " con nota: " + nota);
    }

    @Override
    public void atenderPaciente(String paciente) {
        System.out.println("Atendiendo paciente: " + paciente);
    }

    @Override
    public String obtenerEspecialidad() {
        System.out.println("Obteniendo especialidad del residente...");
        return "Medicina General";
    }
      @Override
    
    public String toString() {
        
        return "Aprende, atiende y ayuda en emergencias\n";
                        
    }

}
