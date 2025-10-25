public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PartidoDelBuenCodigo partido= new PartidoDelBuenCodigo();
        partido.agregarMensajero(new Ave("CUCU", 1));
        partido.agregarMensajero(new Telefono("Samsung Galaxy S21", "123-456-7890"));
        partido.agregarMensajero(new Ave("Patito Feo", 2));
        partido.hacerCapaña();


/* 

Enunciado del Ejercicio:

Un partido político, "El Partido del Buen Código", necesita hacer campaña. Para ello, quieren utilizar tanto palomas mensajeras como teléfonos móviles para enviar mensajes a los votantes.

Palomas Mensajeras: Son aves que pueden volar y lanzar un papelito con el mensaje.
Teléfonos Móviles: Son dispositivos que pueden encenderse y enviar mensajes a través de WhatsApp.
El partido quiere tener una lista de "mensajeros" que pueda incluir tanto palomas como teléfonos, y poder enviarles el mismo mensaje de campaña sin importar su tipo.

Requisitos:

Define las clases Ave y Dispositivo (que pueden ser clases base o interfaces, dependiendo de cómo quieras estructurar el código).
Define una interfaz EnviadorDeMensaje que tenga un método enviarMensaje(String mensaje).
Crea las clases PalomaMensajera y TelefonoMovil que implementen la interfaz EnviadorDeMensaje. Cada clase debe implementar el método enviarMensaje de manera específica para su tipo de mensajero.
Crea una clase PartidoDelBuenCodigo que tenga una lista de EnviadorDeMensaje y un método hacerCampaña(String mensaje) que recorra la lista y envíe el mensaje a cada mensajero.
El objetivo es demostrar cómo las interfaces permiten tener una lista de objetos de diferentes tipos que comparten un comportamiento común (enviar mensajes) y cómo se puede trabajar con ellos de manera polimórfica.
  */  
    
    }
}
