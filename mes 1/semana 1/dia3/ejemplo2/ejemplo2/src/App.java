public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        FabricaInteligente fabrica = new FabricaInteligente();
        fabrica.agregarDispositivo(new PanelLED("Entrada Principal"));
        fabrica.agregarDispositivo(new Sirena("Zona de Carga"));
        fabrica.ejecutarNotificaciones("1- Alerta de Seguridad: Intruso Detectado");
        fabrica.ejecutarNotificaciones("1- Alerta de Seguridad: Incendio Detectado");
        fabrica.ejecutarNotificaciones("2- Alerta de Seguridad: Intruso Detectado");
        fabrica.ejecutarNotificaciones("2- Alerta de Seguridad: Incendio Detectado");
        fabrica.ejecutarNotificaciones("3- Alerta de Seguridad: Intruso Detectado");
        fabrica.ejecutarNotificaciones("3- Alerta de Seguridad: Incendio Detectado");
        fabrica.ejecutarNotificaciones("4- Alerta de Seguridad: Intruso Detectado");
        fabrica.ejecutarNotificaciones("4- Alerta de Seguridad: Incendio Detectado");
        
    }
}
