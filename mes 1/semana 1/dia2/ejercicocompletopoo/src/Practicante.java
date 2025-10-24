public class Practicante extends Empleado implements Trabajador, Evaluable{
    
    private String Universidad;

    public Practicante() {
    }
    public Practicante(String nombre, String id, String Universidad) {
        super(nombre, id, 0);
        this.Universidad = Universidad;
    }

    public String getUniversidad() {
        return Universidad;
    }   
    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }
    @Override
    public void evaluarDesepeño() {
              System.out.println("Se Realizo una evaluacion anual...");
    }

    @Override
    public void realizarTarea(String tarea) {
        System.out.println("Realizando la tarea de: " + tarea);
    }

    @Override
    double calcularSueldo() {
        return 0;
    }
    @Override
    public String toString() {
        return "Soy un Practicante{" + "Universidad=" + Universidad + '}'+ super.toString();
    }



}
