import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ProcesadorPagos procesador = new ProcesadorPagos();
        procesador.getHistorialTransacciones();
        System.out.println("--------------------");
        procesador.cambiarEstrategia(new TarjetaCredito(1234567890123456L, LocalDateTime.of(2025, 12, 31, 0, 0), 123, 5000.0));
        procesador.ejecutarPago(1500.0);
        System.out.println("--------------------");
        procesador.cambiarEstrategia(new CriptoMoneda(  "Bitcoin", "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", 0.0001));
        procesador.ejecutarPago(200.0);
        System.out.println("--------------------");
        procesador.cambiarEstrategia(new TransferenciaBancaria("12345678901234567890", "12345678", "Ahorros"));
        procesador.ejecutarPago(8000.0);
        System.out.println("--------------------");
        procesador.getHistorialTransacciones();
        procesador.calcularComisionTotal();

        
        
    }
}
