public interface MetodoPagos {

    boolean validarPago(double monto);
    void procesarPago(double monto);
    double calcularComision(double monto);
    String obtenerTipo();
    
}
