public abstract class ObraArte {

    private String titulo;
    private String autor;
    private int anoCreacion;

    public ObraArte(){

    }
    public ObraArte(String titulo, String autor, int anoCreacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoCreacion = anoCreacion;
    }

 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        datosValidos(titulo);
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        datosValidos(autor);
        this.autor = autor;
    }
    public int getAnoCreacion() {
        return anoCreacion;
    }
    public void setAnoCreacion(int anoCreacion) {
        anoCreacionValido(anoCreacion);
        this.anoCreacion = anoCreacion;
    }

    public boolean datosValidos(String informacion){
        try{
            if(informacion == null){
                throw new NullPointerException("La información no puede ser nula.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }catch(NumberFormatException e){
            System.out.println("Error: La información debe ser un texto válido.");
            return false;
        }catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }
        
        if(informacion.isEmpty()){
            System.out.println("Error: La información no puede estar vacía.");
            return false;
        }
        if(informacion.length() < 3){
            System.out.println("Error: La información debe tener al menos 3 caracteres.");
            return false;
        }
        if(informacion.isBlank()){
            System.out.println("Error: La información no puede estar en blanco.");
            return false;
        }
        return true;
    }

    public boolean anoCreacionValido(int anoCreacion){
        try{
            String anoStr = Integer.toString(anoCreacion);
            if(anoStr == null){
                throw new NullPointerException("El año de creación no puede ser nulo.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }catch(NumberFormatException e){
            System.out.println("Error: El año de creación debe ser un número válido.");
            return false;
        }catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
            return false;
        }

        if(anoCreacion <= 0){
            System.out.println("Error: El año de creación debe ser un número positivo.");
            return false;
        }
        if(anoCreacion > 2025){
            System.out.println("Error: El año de creación no puede ser mayor al año actual.");
            return false;
        }
        return true;
    }

    public abstract String exibirDetallesInformacion();

}
