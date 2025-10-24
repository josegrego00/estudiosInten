package com.example.biblioteca;

public class Revista extends MaterialBiblioteca implements MostrarInformacion {

    private int numeroEdicion;
    private String periodicidad;
    
    public Revista() {
    }

    public Revista(String titulo, String autor, int annioPublicacion, int numeroEdicion,
            String mesPublicacion) {
        super(titulo, autor, annioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString().concat(" Revista [numeroEdicion=" + numeroEdicion + ", periodicidad=" + periodicidad + "]");
        }

        @Override
        protected String getMensajePrestado(){
            return "Revista";
        }

    @Override
    public String mostrarInformacion() {
        return String.format("Revista: %s | Autor: %s | Numero Edicion: %s | Disponible: %s", 
        getTitulo(), getAutor(), getNumeroEdicion(), isDisponible() ? "Si": "No");
    }
    
}
