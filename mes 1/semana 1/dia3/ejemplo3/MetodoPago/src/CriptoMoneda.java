public class CriptoMoneda  implements MetodoPagos {
    private String tipoCripto;
    private String direccionWallet;
    private double tipoRed;
    private double saldoDisponible;
    
    public CriptoMoneda() {
    }
    public CriptoMoneda(String tipoCripto, String direccionWallet, double tipoRed) {
        this.tipoCripto = tipoCripto;
        this.direccionWallet = direccionWallet;
        this.tipoRed = tipoRed;
    }

    // Getters and Setters
    public String getTipoCripto() {
        return tipoCripto;
    }
    public void setTipoCripto(String tipoCripto) {
        this.tipoCripto = tipoCripto;
    }
    public String getDireccionWallet() {
        return direccionWallet;
    }
    public void setDireccionWallet(String direccionWallet) {
        this.direccionWallet = direccionWallet;
    }
    public double getTipoRed() {
        return tipoRed;
    }
    public void setTipoRed(double tipoRed) {
        this.tipoRed = tipoRed;
    }   


    @Override
    public boolean validarPago(double monto) {
        if(this.direccionWallet.length() >=26 && this.direccionWallet.length() <=35 && monto >= 10){
                return true;
        } else {
                return false;
            }
    }
    @Override
    public void procesarPago(double monto) {
            if(validarPago(monto)){
                this.saldoDisponible -= monto;
                System.out.println("Pago de " + monto + " procesado con CriptoMoneda.");
                System.out.println("Se notifico a la red blockchain.");
            } else {
                System.out.println("Pago no válido. No se pudo procesar el pago con CriptoMoneda.");
            }
    }
    @Override
    public double calcularComision(double monto) {
        return monto * 0.01; // 1% de comisión
    }
    @Override
    public String obtenerTipo() {
        return "CriptoMoneda";
    }

}
