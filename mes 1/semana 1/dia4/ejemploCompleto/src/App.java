public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Museo de jose Pino");

            GestionMuseo museoJosePino= new GestionMuseo();
            museoJosePino.aperturaMuseo();

            museoJosePino.entradaVisitante(new Estudiante("Ana García", "ana.garcia@universidad.edu", "Ingeniería de Sistemas", 4));
            //museoJosePino.entradaVisitante(new Estudiante("Carlos López", "carlos.lopez@universidad.edu", "Arquitectura", 6));
            //museoJosePino.entradaVisitante(new Estudiante("María Rodríguez", "maria.rod@universidad.edu", "Medicina", 8));

            //museoJosePino.entradaVisitante(new Adulto("Roberto Pérez", "roberto.p@gmail.com", "Empresario"));
            museoJosePino.entradaVisitante(new Adulto("Carmen Silva", "carmen.s@hotmail.com", "Docente"));
            //museoJosePino.entradaVisitante(new Adulto("Luis Torres", "luis.t@yahoo.com", "Arquitecto"));
        
        
            //museoJosePino.entradaVisitante(new Investigador("Diana Martínez", "diana.m@instituto.org", "Historia del Arte", "Universidad Nacional"));
            //museoJosePino.entradaVisitante(new Investigador("Pedro Ramírez", "pedro.r@centro.edu", "Restauración", "Instituto de Conservación"));
            museoJosePino.entradaVisitante(new Investigador("Laura Gómez", "laura.g@museo.org", "Arte Contemporáneo", "Museo Moderno"));
            museoJosePino.generarReporteDiario();
            museoJosePino.cierreMuseo();
            
    }
}
