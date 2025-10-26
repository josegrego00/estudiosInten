public class Escultura extends ObraArte implements IRestaurable, Valuable, Interactiva {

    private String material;
    private double altura;
    private int desgastePorInteraccion;
    
    public Escultura(){

    }
    public Escultura(String titulo, String autor, int anoCreacion, String material, double altura) {
        super(titulo, autor, anoCreacion);
        this.material = material;
        this.altura = altura;
        this.desgastePorInteraccion = 100; // Valor inicial de desgaste
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        datosValidos(material);
        this.material = material;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        try{
            if(Double.isNaN(altura)){
                throw new NumberFormatException("La altura debe ser un número válido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());  
            return;
        }
        
        if(altura <= 0){
            System.out.println("Error: La altura debe ser un valor positivo.");
            return;
        }    
        if (altura > 100) {
            System.out.println("Error: La altura no puede ser mayor a 100 metros, Esto es un Museo, no el Monte Everest.");
            return;
        }
        this.altura = altura;
    }


    @Override
    public String exibirDetallesInformacion() {
        return "Escultura: " + getTitulo() + "\n" +
               "Autor: " + getAutor() + "\n" +
               "Año de Creación: " + getAnoCreacion() + "\n" +
               "Material: " + material + "\n" +
               "Altura: " + altura + " metros\n";
    }
    @Override
    public void interactuar() {
      System.out.println("👁️  Visitante observando la escultura: " + getTitulo());
    System.out.println("   Material: " + material + " - Altura: " + altura + " metros");
    desgastePorInteraccion--;
    }
    @Override
    public double getValue() {
        if(desgastePorInteraccion<=10){
            System.out.println("La escultura " + getTitulo() + " está muy desgastada y necesita restauración.");
            restaurarEstadoOriginal();
            System.out.println("La escultura ha sido restaurada a su estado original.");
            double valorBase = 2000.0; // Valor base de la escultura
            double valorPorDesgaste = desgastePorInteraccion * 20.0; // Cada punto de desgaste reduce el valor en 20
            double valorTotal = valorBase - valorPorDesgaste;
            return Math.max(valorTotal, 0); // El valor no puede ser negativo
        } else {
            double valorBase = 2000.0; // Valor base de la escultura
            double valorPorDesgaste = desgastePorInteraccion * 20.0; // Cada punto de desgaste reduce el valor en 20
            double valorTotal = valorBase - valorPorDesgaste;
            return Math.max(valorTotal, 0); // El valor no puede ser negativo
        }
    }
    @Override
    public void restaurarEstadoOriginal() {
        this.desgastePorInteraccion = 100;
            System.out.println("La escultura " + getTitulo() + " ha sido restaurada a su estado original.");
    }

}
