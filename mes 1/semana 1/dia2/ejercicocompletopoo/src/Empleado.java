

public abstract class Empleado {

    private String nombre;
    private String id;
    private double sueldo;

    public Empleado() {
    }
    
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo < 0){
            this.sueldo = 0;
        }else{
            this.sueldo = sueldo;
        }
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", sueldo=" + sueldo + '}';
    }

    abstract double calcularSueldo();
    

    
}
