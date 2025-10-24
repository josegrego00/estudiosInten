package com.example.biblioteca;

public abstract class MaterialBiblioteca {
    
    private String titulo;
    private String autor;
    private int annioPublicacion;
    private boolean disponible;
    
    public MaterialBiblioteca() {
    }
    public MaterialBiblioteca(String titulo, String autor, int annioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.annioPublicacion = annioPublicacion;
        this.disponible = true;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnnioPublicacion() {
        return annioPublicacion;
    }
    public void setAnnioPublicacion(int annioPublicacion) {
        this.annioPublicacion = annioPublicacion;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    protected String getMensajePrestado(){
        return "Material";
    }


    public String prestar(){
        if(this.disponible){
            this.disponible = false;
            return "Prestamos:  "+getMensajePrestado()+" con exito";
        }else{
            return "No esta disponible "+getMensajePrestado()+" para prestar";
        }
    }
    public String devolver(){
        if(!this.disponible){
            this.disponible = true;
            return "Devuelto con exito "+getMensajePrestado()+" a la biblioteca";
        }else{
            return " El "+getMensajePrestado()+" no estaba prestado";
        }
    }
   
}
