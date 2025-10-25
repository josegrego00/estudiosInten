import java.util.ArrayList;
import java.util.List;

public class FabricaInteligente {

    private List<Notificacion> listaDispositivos;

    public FabricaInteligente() {
        this.listaDispositivos = new ArrayList<>();
    }
    public void agregarDispositivo(Notificacion dispositivo) {
        this.listaDispositivos.add(dispositivo);
    }

    public void ejecutarNotificaciones(String mensaje) {
        notificarDispositivos(mensaje);
    }

    public void notificarDispositivos(String mensaje) {
        for (Notificacion dispositivo : listaDispositivos) {
            if (dispositivo.validarConexion()) {
                dispositivo.enviarMensaje(mensaje);
            } else {

                System.out.println("No se pudo enviar el mensaje al dispositivo debido a una conexion invalida.");
                System.out.println("Recargando energia de todos los dispositivos...");
                recargarTodos();

            }
        }
    }
       public void mostrarEstadoDispositivos() {
        System.out.println("\n=== ESTADO DE DISPOSITIVOS ===");
        for (Notificacion dispositivo : listaDispositivos) {
            dispositivo.validarConexion();
        }
    }
    
    public void recargarTodos() {
        for (Notificacion dispositivo : listaDispositivos) {
            if (dispositivo instanceof Sirena) {
                ((Sirena) dispositivo).recargarEnergia();
            } else if (dispositivo instanceof PanelLED) {
                ((PanelLED) dispositivo).recargarEnergia();
            }
        }
    }

}
