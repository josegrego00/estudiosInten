public class Ave implements EnviadorDeMensaje {

    private String nombre;
    private int id;

    public Ave(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Paloma " + nombre + " (ID: " + id + ") enviando mensaje: " + mensaje);
    }



}
