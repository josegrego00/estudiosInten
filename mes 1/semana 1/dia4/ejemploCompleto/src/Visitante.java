public abstract class Visitante {
    
    private String nombre;
    private String email;

    public Visitante(){

    }

    public Visitante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarDatos(String informacion){
        try {
            if(informacion == null || informacion.trim().isEmpty()){
                throw new IllegalArgumentException("La información no puede estar vacía.");
            }
        
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }
        if (informacion.length()<3) {
            System.out.println("La información debe tener al menos 3 caracteres.");
            return false;
        }
        if (informacion.length() > 100) {
            System.out.println("La información no puede exceder los 100 caracteres.");
            return false;
        }
        return true;
        
    }
    public abstract void mostrarInformacionVisitante();

}
