public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplo de Generic!");
        
        
        Cajas<String> cajaDeString= new Cajas<>();
        cajaDeString.ponerContenido("Colocando algo en la caja");
        String contenidoCaja=cajaDeString.obtenerContenido();

        Cajas<Integer> cajaInteger= new Cajas<>();
        cajaInteger.ponerContenido(34);
        Integer contenidoInteger=cajaInteger.obtenerContenido();
        
        System.out.println("Contenido de la Primera Caja: "+contenidoCaja);
        System.out.println("Contenido de la segunda caja "+contenidoInteger);


    }
}
