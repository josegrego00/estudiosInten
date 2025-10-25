public class PanelLED implements Notificacion {

    private String ubicacion;
    private int brillo;
    private int nivelElectrico;

    public PanelLED() {
    }

        public PanelLED(String ubicacion) {
            this.ubicacion = ubicacion;
            this.brillo = 0;
            this.nivelElectrico = 20;
        }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("El panel LED muestra el siguiente mensaje: " + mensaje);
        this.brillo += 5;
        this.nivelElectrico -= 3;

    }

    @Override
    public boolean validarConexion() {
        if(this.nivelElectrico > 10) {
            System.out.println("El panel LED en la ubicacion " + this.ubicacion + " tiene conexion valida.");
            System.out.println("Nivel electrico actual: " + this.nivelElectrico);
            return true;
        } else {
            System.out.println("El panel LED en la ubicacion " + this.ubicacion + " no tiene conexion valida.");
            System.out.println("Nivel electrico actual: " + this.nivelElectrico);
            return false;
        }
       
    }

    public void recargarEnergia() {
        this.nivelElectrico = 100;
        System.out.println("El panel LED en la ubicacion " + this.ubicacion + " ha sido recargado a nivel electrico completo.");
    }

}
