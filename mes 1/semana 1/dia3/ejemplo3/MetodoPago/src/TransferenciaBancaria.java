public class TransferenciaBancaria implements MetodoPagos {

    private String numeroCuentaOrigen;
    private String numeroDeBanco;
    private String tipoCuenta;

    public TransferenciaBancaria() {
    }
    public TransferenciaBancaria(String numeroCuentaOrigen, String numeroDeBanco, String tipoCuenta) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.numeroDeBanco = numeroDeBanco;
        this.tipoCuenta = tipoCuenta;
    }
    // Getters and Setters
    public String getNumeroCuentaOrigen() {
        return numeroCuentaOrigen;
    }
    public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
    }
    public String getNumeroDeBanco() {
        return numeroDeBanco;
    }
    public void setNumeroDeBanco(String numeroDeBanco) {
        this.numeroDeBanco = numeroDeBanco;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    @Override
    public boolean validarPago(double monto) {
        if(this.numeroCuentaOrigen.length() ==20 && this.numeroDeBanco.length() ==8 && monto <=10000){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void procesarPago(double monto) {
        if(validarPago(monto)){
            System.out.println("Pago de " + monto + " procesado con Transferencia Bancaria.");
            System.out.println("Se notifico al banco " + this.numeroDeBanco + " para debitar de la cuenta " + this.numeroCuentaOrigen + ".");
        } else {
            System.out.println("Pago no válido. No se pudo procesar el pago con Transferencia Bancaria.");
        }
    }
    @Override
    public double calcularComision(double monto) {
        return monto * 0.05; // 5% de comisión
    }
    @Override
    public String obtenerTipo() {
        return "Transferencia Bancaria";
    }


}
