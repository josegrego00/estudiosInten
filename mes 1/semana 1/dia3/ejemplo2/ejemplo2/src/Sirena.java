public class Sirena implements Notificacion {

    private String ubicacion;
    private int nivelDecibelios;
    private int nivelElectrico;

    public Sirena() {
    }

        public Sirena(String ubicacion) {
            this.ubicacion = ubicacion;
            this.nivelDecibelios = 0;
            this.nivelElectrico = 10;
        }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("La sirena emite el siguiente mensaje: " + mensaje);
        this.nivelDecibelios += 10;
        this.nivelElectrico -= 2;

    }

    @Override
    public boolean validarConexion() {
        if(this.nivelElectrico > 5) {
            System.out.println("La sirena en la ubicacion " + this.ubicacion + " tiene conexion valida.");
            System.out.println("Nivel electrico actual: " + this.nivelElectrico);
            return true;
        } else {
            System.out.println("La sirena en la ubicacion " + this.ubicacion + " no tiene conexion valida.");
            System.out.println("Nivel electrico actual: " + this.nivelElectrico);
            return false;
        }
       
    }

    public void recargarEnergia() {
        this.nivelElectrico = 100;
        System.out.println("La sirena en la ubicacion " + this.ubicacion + " ha sido recargada a nivel electrico completo.");
    }

}
