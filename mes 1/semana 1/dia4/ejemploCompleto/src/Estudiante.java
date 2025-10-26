public class Estudiante extends Visitante {
    
    private String carrera;
    private int semestre;

    public Estudiante(){

    }

    public Estudiante(String nombre, String email, String carrera, int semestre) {
        super(nombre, email);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if(validarDatos(carrera)){
            this.carrera = carrera;
        }
        
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        try {
            if(semestre <=0){
                throw new IllegalArgumentException("El semestre debe ser un número positivo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return;
        }
        if(semestre >1 && semestre <13){
            this.semestre = semestre;
        }else{
            System.out.println("El semestre debe estar entre 2 y 12.");
        }
        
    }

    @Override
    public void mostrarInformacionVisitante() {
        System.out.println("Estudiante: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }

}
