import java.util.ArrayList;
import java.util.List;

public class PartidoDelBuenCodigo {

    private List<EnviadorDeMensaje> mensajerosL;

    public PartidoDelBuenCodigo(){
        mensajerosL= new ArrayList<>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero){
        mensajerosL.add(mensajero);
    }
    public void hacerCapaña(){
        for(EnviadorDeMensaje ElMensajero: mensajerosL){
            ElMensajero.enviarMensaje("Este es el mensaje de campaña del Partido del Buen Código... Puto");
        }

    }
    

}
