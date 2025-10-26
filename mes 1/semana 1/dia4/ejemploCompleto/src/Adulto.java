public class Adulto extends Visitante {
    
    private String ocupacion;

    public Adulto(){

    }

    public Adulto(String nombre, String email, String ocupacion) {
        super(nombre, email);
        this.ocupacion = ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        if(validarDatos(ocupacion)){
            this.ocupacion = ocupacion;
        }
        
    }

    @Override
    public void mostrarInformacionVisitante() {
        System.out.println("Adulto: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Ocupación: " + ocupacion);
    }

}
