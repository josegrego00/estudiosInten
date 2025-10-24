public class EmpleadoTiempoCompleto extends Empleado implements Trabajador, Evaluable{


    private double bonoAnual;


    public EmpleadoTiempoCompleto() {
    }   
    public EmpleadoTiempoCompleto(String nombre, String id, double sueldo, double bonoAnual) {
        super(nombre, id, sueldo);
        this.bonoAnual = bonoAnual;
    }

        public double getBonoAnual() {
        return bonoAnual;
    }
    public void setBonoAnual(double bonoAnual) {
        if(bonoAnual<100){
            this.bonoAnual = 100;
        }else{
            this.bonoAnual = bonoAnual;
        }
    }

    @Override
    double calcularSueldo() {
        return getSueldo()+ bonoAnual/12;
    }
    @Override
    public void evaluarDesepeño() {
        System.out.println("Se Realizo una evaluacion trimestral...");
    }
    @Override
    public void realizarTarea(String tarea) {
        System.out.println("Como empleado de Tiempo COmpleto hago: " + tarea);         
    }
    @Override
    public String toString() {
        return "Soy un empleado TiempoCompleto{" + "bonoAnual=" + bonoAnual + '}'+ super.toString();
    }

}
