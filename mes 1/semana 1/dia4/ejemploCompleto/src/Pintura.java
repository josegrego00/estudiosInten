public class Pintura extends ObraArte implements IRestaurable, Valuable, Interactiva {

    private String tecnica;
    private String dimensiones;
    private int desgastePorInteraccion;

    public Pintura(){

    }

    public Pintura(String titulo, String autor, int anoCreacion, String tecnica, String dimensiones) {
        super(titulo, autor, anoCreacion);
        this.tecnica = tecnica;
        this.dimensiones = dimensiones;
        this.desgastePorInteraccion = 100; // Valor inicial de desgaste
    }

    
    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        //verificar que la tecnica sea valida
        if(datosValidos(tecnica)){
            this.tecnica = tecnica; 
        }
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        //verificar que las dimensiones sean validas
        if(datosValidos(dimensiones)){
            this.dimensiones = dimensiones;
        }       
        
    }

    @Override
    public String exibirDetallesInformacion() {
        return "Pintura: " + getTitulo() + "\n" +
               "Autor: " + getAutor() + "\n" +
               "Año de Creación: " + getAnoCreacion() + "\n" +
               "Técnica: " + tecnica + "\n" +
               "Dimensiones: " + dimensiones + "\n";
    }

    @Override
    public void interactuar() {
    System.out.println("👁️  Visitante observando la pintura: " + getTitulo() + " del autor " + getAutor() + ".");
    System.out.println("   Técnica: " + tecnica + " - " + dimensiones);
    desgastePorInteraccion--;
    }

    @Override
    public double getValue() {
        if(desgastePorInteraccion<=10){
            System.out.println("La pintura " + getTitulo() + " está muy desgastada y necesita restauración.");
            restaurarEstadoOriginal();
            System.out.println("La pintura ha sido restaurada a su estado original.");
            double valorBase = 1000.0; // Valor base de la pintura
            double valorPorDesgaste = desgastePorInteraccion * 10.0; // Cada punto de desgaste reduce el valor en 10
            double valorTotal = valorBase - valorPorDesgaste;
            return Math.max(valorTotal, 0); // El valor no puede ser negativo
        }else{
            double valorBase = 1000.0; // Valor base de la pintura
            double valorPorDesgaste = desgastePorInteraccion * 10.0; // Cada punto de desgaste reduce el valor en 10
            double valorTotal = valorBase - valorPorDesgaste;
            return Math.max(valorTotal, 0); // El valor no puede ser negativo
        }
        }

    @Override
    public void restaurarEstadoOriginal() {
        desgastePorInteraccion = 100; // Restaurar el desgaste al valor inicial
        System.out.println("La pintura " + getTitulo() + " ha sido restaurada a su estado original.");
    }

}
