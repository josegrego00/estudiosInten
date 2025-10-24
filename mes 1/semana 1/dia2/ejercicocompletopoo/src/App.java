import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este es un ejemplo de polimorfismo en Java");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPorHora(  "Juan Perez", "E001", 0, 160, 15.5));
        empleados.add(new EmpleadoTiempoCompleto(   "Maria Gomez", "E002", 3000, 1200));
        empleados.add(new Practicante(   "Luis Rodriguez", "E003", "Universidad Nacional"));

        for(Empleado elEmpleados: empleados){
            System.out.println(elEmpleados.toString());
            System.out.println("Sueldo Calculado: " + elEmpleados.calcularSueldo());
            if(elEmpleados instanceof Evaluable){
                Evaluable evaluable = (Evaluable) elEmpleados;
                evaluable.evaluarDesepeño();
            }
            if(elEmpleados instanceof Trabajador){
                Trabajador trabajador = (Trabajador) elEmpleados;
                trabajador.realizarTarea("Completar Reporte");
            }
            System.out.println("---------------------------------------------------");
        }

      

    }
}
