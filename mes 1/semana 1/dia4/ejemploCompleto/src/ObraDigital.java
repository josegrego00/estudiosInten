public class ObraDigital extends ObraArte implements IRestaurable, Valuable, Interactiva{

    private String formatoArchivo;
    private double tamanoArchivo; 
    private int vecesRestaurada; 
    private int desgastes;

    public ObraDigital(){

    }

    public ObraDigital(String titulo, String autor, int anoCreacion, String formatoArchivo, double tamanoArchivo) {
        super(titulo, autor, anoCreacion);
        this.formatoArchivo = formatoArchivo;
        this.tamanoArchivo = tamanoArchivo;
        this.vecesRestaurada = 0;
        this.desgastes = 10; // Valor inicial de desgastes
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        if(datosValidos(formatoArchivo)){
        this.formatoArchivo = formatoArchivo;
         }
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        try{
            if(Double.isNaN(tamanoArchivo)){
                throw new NumberFormatException("El tamaño del archivo debe ser un número válido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());  
            return;
        }
        if(tamanoArchivo <= 0){
            System.out.println("Error: El tamaño del archivo debe ser un valor positivo.");
            return;
        }
        if(tamanoArchivo > 5000){
            System.out.println("Error: El tamaño del archivo no puede ser mayor a 5000 MB.");
            return;
        }
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public String exibirDetallesInformacion() {
        return "Obra Digital: " + getTitulo() + "\n" +
               "Autor: " + getAutor() + "\n" +
               "Año de Creación: " + getAnoCreacion() + "\n" +
               "Formato de Archivo: " + formatoArchivo + "\n" +
               "Tamaño de Archivo: " + tamanoArchivo + " MB\n";
    }

    @Override
    public double getValue() {
        double baseValue = 1000.0;
        return baseValue+(baseValue/100*10000);

    }

    @Override
    public void restaurarEstadoOriginal() {
        System.out.println("Hay desarrolladores que estan trabajando en la restauración digital de obras de arte.");
        vecesRestaurada++;
        System.out.println("Restaurando la obra digital '" + getTitulo() + "' a su estado original.");
        System.out.println("Obra digital restaurada. Total de veces restaurada: " + vecesRestaurada);
    }

    @Override
    public void interactuar() {
      System.out.println("👁️  Visitante interactuando con la obra digital: " + getTitulo());
    System.out.println("   Formato: " + formatoArchivo + " - Tamaño: " + tamanoArchivo + " MB");
    desgastes--;

    }

}
