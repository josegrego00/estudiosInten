import java.util.ArrayList;
import java.util.List;

public class ProcesadorPagos {

    private MetodoPagos MetodoDePago;
     private List<String> historialTransacciones;
     private double comisionTotal;
    

    public ProcesadorPagos() {
        historialTransacciones = new ArrayList<>();
        comisionTotal = 0.0;
    }
    
    public void cambiarEstrategia(MetodoPagos nuevaEstrategia){
        this.MetodoDePago = nuevaEstrategia;
        System.out.println("Estrategia de pago cambiada a: " + nuevaEstrategia.obtenerTipo());
    }
    public boolean ejecutarPago(double monto){
        if(MetodoDePago == null){
            System.out.println("No se ha seleccionado un método de pago.");
            return false;   
        }

        if(MetodoDePago.validarPago(monto)){
            MetodoDePago.procesarPago(monto);
            historialTransacciones.add("Pago de " + monto + " procesado con " + MetodoDePago.obtenerTipo() + ".");
            comisionTotal += MetodoDePago.calcularComision(monto);
            return true;
        } else {
            System.out.println("Pago no válido. No se pudo procesar el pago con " + MetodoDePago.obtenerTipo() + ".");
            return false;
        }
    
    }
    public void mostrarEstadisticas(){
        System.out.println("El Metodo de Pago seleccionado es: " + MetodoDePago.obtenerTipo());
    }

    public void revertirUltimaTransaccion(){
        historialTransacciones.remove(historialTransacciones.size() - 1);
        System.out.println("Última transacción revertida o Eliminada.");
    }
    public void calcularComisionTotal(){
        System.out.println("la comision Total es: "+comisionTotal);
    }

    public void getHistorialTransacciones() {
        if(historialTransacciones.isEmpty()){
            System.out.println("No hay transacciones en el historial.");
        } else {
            System.out.println("Historial de Transacciones:");
            for(String transaccion : historialTransacciones){
                System.out.println(transaccion);
            }

        }
    }



    

}
