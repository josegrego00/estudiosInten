public class Telefono  implements EnviadorDeMensaje {

    private String modelo;
    private String numero;

    public Telefono(String modelo, String numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje a través del teléfono " + modelo + " al número " + numero + ": " + mensaje);
    }


}
