public class InvestigadorMedico implements Investigador, Docente{

    @Override
    public void impartirClase(String materia) {
        System.out.println("Impartiendo clase de: " + materia);
    }

    @Override
    public void calificarExamen(String estudiante, double nota) {
        System.out.println("Calificando examen de " + estudiante + " con nota: " + nota);
    }

    @Override
    public void realizarInvestigacion(String proyecto) {
        System.out.println("Realizando investigacion en el proyecto: " + proyecto);
    }

    @Override
    public boolean publicarPaper() {
        System.out.println("Publicando paper medico...");
        return true;
    }
     @Override
    
    public String toString() {
        
        return "Investiga y enseña, pero no atiende pacientes\n";
                        
    }

}
