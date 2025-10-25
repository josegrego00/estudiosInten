import java.time.LocalDateTime;

public class TarjetaCredito  implements MetodoPagos {

    private long numeroTarjeta;
    private LocalDateTime fechaVencimiento;
    private int cvv;
    private double limiteCredito;
    private double saldoUtilizado;

    public TarjetaCredito() {
    }

    public TarjetaCredito(long numeroTarjeta,LocalDateTime fechaVencimiento, int cvv, double limiteCredito) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.limiteCredito = limiteCredito;
        this.saldoUtilizado = 0.0;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean validarPago(double monto) {
        if(this.fechaVencimiento.isAfter(LocalDateTime.now()) && this.numeroTarjeta > 15 && (this.cvv >= 3 || this.cvv <=4)){
            if( monto <= this.limiteCredito ) 
                return true;
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void procesarPago(double monto) {
        if(validarPago(monto)){
            saldoUtilizado += monto;
            limiteCredito -= monto;
            System.out.println("Pago de " + monto + " procesado con tarjeta de crédito " + numeroTarjeta);
            System.out.println("Se notifico al banco emisor.");
        } else {
            System.out.println("Pago no válido para la tarjeta de crédito " + numeroTarjeta);
        }
    }

    @Override
    public double calcularComision(double monto) {
        return monto * 0.025; // 2.5% de comisión
    }

    @Override
    public String obtenerTipo() {
        return "Tarjeta de Crédito";
    }
    


}
