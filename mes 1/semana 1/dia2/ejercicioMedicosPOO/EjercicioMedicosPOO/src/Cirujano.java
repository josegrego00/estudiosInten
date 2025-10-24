public class Cirujano implements Sanitario, Urgenciable, Investigador {

    @Override
    public void realizarInvestigacion(String proyecto) {
        System.out.println("Realizando investigacion en: " + proyecto);
    }

    @Override
    public boolean publicarPaper() {
        System.out.println("Publicando paper cientifico");
        return true;
    }

    @Override
    public void atenderEmergencia(String emergencia) {
        System.out.println("Opera, atiende emergencias y hace investigación en "+ emergencia);
    }

    @Override
    public int getNivelUrgencia() {
        return 3;
    }

    @Override
    public void atenderPaciente(String paciente) {
        System.out.println("Atendiendo paciente quirurgicamente: " + paciente);
    }

    @Override
    public String obtenerEspecialidad() {
        return "Cirugia General";
    }
    @Override
    
    public String toString() {
        
        return "Opera, atiende emergencias y hace investigación\n";
                        
    }

}
