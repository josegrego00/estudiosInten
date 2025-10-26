public class Investigador extends Visitante {
    
    private String institucion;
    private String areaInvestigacion;

    public Investigador(){

    }

    public Investigador(String nombre, String email, String institucion, String areaInvestigacion) {
        super(nombre, email);
        this.institucion = institucion;
        this.areaInvestigacion = areaInvestigacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        if(validarDatos(institucion)){
            this.institucion = institucion;
        }
        
    }

    public String getAreaInvestigacion() {
        return areaInvestigacion;
    }

    public void setAreaInvestigacion(String areaInvestigacion) {
        if(validarDatos(areaInvestigacion)){
            this.areaInvestigacion = areaInvestigacion;
        }
        
    }

    @Override
    public void mostrarInformacionVisitante() {
        System.out.println("Investigador: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Institución: " + institucion);
        System.out.println("Área de Investigación: " + areaInvestigacion);
    }

}
