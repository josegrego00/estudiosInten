package com.example.clases;

public class Director extends Empleado {

    String idDirector;
    String area;

    public Director() {
    }

    public Director(int id, String dni, String nombre, String apellido, String direccion, String telefono,
            String idDirector, String area) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.idDirector = idDirector;
        this.area = area;
    }

    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    

    



}
