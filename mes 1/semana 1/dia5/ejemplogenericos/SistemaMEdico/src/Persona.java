public abstract class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String contacto;

    
    public Persona() {
    }

    
    public Persona(int id, String nombre, int edad, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.contacto = contacto;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id= (id<0) ? id= 1: id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(validarTexto(nombre)){
            this.nombre=nombre;
            return;
        }
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
  
        if(edad<0){
            this.edad=0;
        }else{
            this.edad = edad;
        }
  
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        if(validarTexto(contacto)){
            this.contacto = contacto;
        }else{
            this.contacto="no tiene contacto";
        }
        
    }

    protected boolean validarTexto(String texto){
    try{

        if(texto == null){
            System.out.println("El dato no puede ser nulo");
            return false;
        }

        if(texto.isEmpty()){
            System.out.println("El dato no puede estar vacio");
            return false;
        }
     
        }catch(Exception ex){
            System.out.println("Error inisperado...");
            System.out.println(ex.getMessage());
            return false;
        }

       return true;
    }

    public abstract String mostrarInformacion();
    

}
