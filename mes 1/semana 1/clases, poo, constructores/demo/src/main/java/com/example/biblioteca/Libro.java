package com.example.biblioteca;

public class Libro extends MaterialBiblioteca implements MostrarInformacion {

    private int numeroPaginas;
    private String genero;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, int annioPublicacion, int numeroPaginas,
            String genero) {
        super(titulo, autor, annioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString().concat(" Libro [numeroPaginas=" + numeroPaginas + ", genero=" + genero + "]");
        }
  @Override
        protected String getMensajePrestado(){
            return "Libro";
        }

    @Override
    public String mostrarInformacion() {
    return String.format("Libro: %s | Autor: %s | Páginas: %d | Disponible: %s", 
        getTitulo(), getAutor(), numeroPaginas, 
        isDisponible() ? "Sí" : "No");
    }    

    

}
