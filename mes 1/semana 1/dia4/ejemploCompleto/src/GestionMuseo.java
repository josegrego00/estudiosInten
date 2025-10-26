import java.util.ArrayList;
import java.util.List;

public class GestionMuseo {

    private List<ObraArte> listaArtes;
    private List<String> historicoAcciones;
    private List<Visitante> visitantesDelDia;
    private boolean museoAbierto;

    public GestionMuseo() {
        this.historicoAcciones= new ArrayList<>();
        this.listaArtes= new ArrayList<>();
        this.visitantesDelDia= new ArrayList<>();
        this.museoAbierto=false;
    }

    public void registrarAccion(String accion) {
        historicoAcciones.add(accion);
    }
    public List<String> getHistoricoAcciones() {
        return historicoAcciones;
    }

    public void aperturaMuseo() {
        if (museoAbierto) {
            System.out.println("⚠️ El museo ya está abierto");
            return;
        }
        String accion = "El museo ha abierto sus puertas. a la HOra actual: " + java.time.LocalTime.now();
        System.out.println(accion);
        this.listaArtes=cargarListaObraArte();
        registrarAccion(accion);
        registrarAccion("se cargo la lista de Obras que hay en el Museo");
        this.museoAbierto=true;
    }

       private List<ObraArte> cargarListaObraArte() {
            List<ObraArte> listaArtes= new ArrayList<>();   
            
            ObraArte obra1 = new Pintura("La Mona Lisa", "Leonardo da Vinci", 1503, "Óleo", "Renacimiento");
            ObraArte obra2 = new Pintura("La noche estrellada", "Vincent van Gogh", 1889, "Óleo", "Post-impresionismo");
            ObraArte obra3 = new Pintura("El grito", "Edvard Munch", 1893, "Témpera", "Expresionismo");
            
            ObraArte obra4 = new Escultura("David", "Miguel Ángel", 1504, "Mármol", 5.17);
            ObraArte obra5 = new Escultura("El Pensador", "Auguste Rodin", 1902, "Bronce", 1.89);
            ObraArte obra6 = new Escultura("La Piedad", "Miguel Ángel", 1499, "Mármol", 1.74);
    
    
            ObraArte obra7 = new ObraDigital("Everydays", "Beeple", 2021, "NFT", 100);
            ObraArte obra8 = new ObraDigital("Quantum", "Kevin McCoy", 2014, "Animación Digital", 200);
            ObraArte obra9 = new ObraDigital("CryptoPunk #7523", "Larva Labs", 2017, "Pixel Art", 250);
    
            listaArtes.add(obra1);
            listaArtes.add(obra2);
            listaArtes.add(obra3);
            listaArtes.add(obra4);
            listaArtes.add(obra5);
            listaArtes.add(obra6);
            listaArtes.add(obra7);
            listaArtes.add(obra8);
            listaArtes.add(obra9);
            
            return listaArtes;
    }

    public void cierreMuseo() {
        if(museoAbierto){
            String accion = "El museo ha cerrado sus puertas. a la HOra actual: " + java.time.LocalTime.now();
            System.out.println(accion);
            registrarAccion(accion);
        }else{
            return;
        }
                
    }

    public void entradaVisitante(Visitante  visitante){
            if(!museoAbierto){
                System.out.println("El museo esta cerrado no pueden ingresar los visitantes");
                return;
            }
            visitantesDelDia.add(visitante);
            registrarAccion("Ingreso el Visitante "+visitante.getNombre());
             // Interactuar con 2-3 obras aleatorias
            int obrasAInteractuar = Math.min(3, listaArtes.size());
            for (int i = 0; i < obrasAInteractuar; i++) {
            ObraArte obra = listaArtes.get(i);
            
            if (obra instanceof Interactiva) {
                System.out.println("   👁️  Observando: " + obra.getTitulo());
                ((Interactiva) obra).interactuar();
            }
        }
        
        registrarAccion("🖼️ " + visitante.getNombre() + " interactuó con " + obrasAInteractuar + " obras");
            
    }

     public void generarReporteDiario() {
        System.out.println("\n📊 === REPORTE DIARIO DEL MUSEO ===");
        System.out.println("Total visitantes: " + visitantesDelDia.size());
        
        // Contar por tipo de visitante
        long estudiantes = visitantesDelDia.stream().filter(v -> v instanceof Estudiante).count();
        long adultos = visitantesDelDia.stream().filter(v -> v instanceof Adulto).count();
        long investigadores = visitantesDelDia.stream().filter(v -> v instanceof Investigador).count();
        
        System.out.println("🏫 Estudiantes: " + estudiantes);
        System.out.println("👨‍💼 Adultos: " + adultos);
        System.out.println("🔬 Investigadores: " + investigadores);
        System.out.println("🖼️ Obras en exhibición: " + listaArtes.size());
        
        registrarAccion("📈 Reporte: " + visitantesDelDia.size() + " visitantes, " + listaArtes.size() + " obras");
    }


}
