package com.example.clases;

public class Consultor extends Empleado {

    String idConsultor;
    String especialidad;

    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String direccion, String telefono,
            String idConsultor, String especialidad) {
        super(id, dni, nombre, apellido, direccion, telefono);
        this.idConsultor = idConsultor;
        this.especialidad = especialidad;
    }

    public String getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(String idConsultor) {
        this.idConsultor = idConsultor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
