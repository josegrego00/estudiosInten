public class EmpleadoPorHora extends Empleado implements Trabajador, Evaluable{

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora() {
    }
    public EmpleadoPorHora(String nombre, String id, double sueldo, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }   
    public void setHorasTrabajadas(int horasTrabajadas) {
        
        if(horasTrabajadas<0){
            this.horasTrabajadas = 0;
            return;
        }else{
            this.horasTrabajadas = horasTrabajadas;
        }
        
    }
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    public void setTarifaPorHora(double tarifaPorHora) {
        if(tarifaPorHora<5){
            this.tarifaPorHora = 5;
            return;
        }else{
            this.tarifaPorHora = tarifaPorHora;
        }        
    }

    @Override
    public void evaluarDesepeño() {
        System.out.println("Se Realizo una evaluacion semestral...");
    }

    @Override
    public void realizarTarea(String tarea) {
        System.out.println("Realizando la tarea de: " + tarea);
    }

    @Override
    double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Soy un empleado PorHora{" + "horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}'+ super.toString();
    } 

    

}
