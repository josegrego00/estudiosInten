package com.example;

import com.example.clases.Consultor;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Ejemplo de Herencia en POO");
        Consultor consultor= new Consultor();
        consultor.setId(1);
        consultor.setNombre("Juan");
        consultor.setApellido("Perez");
        consultor.setIdConsultor("C-001");
        consultor.setEspecialidad("Java");
        System.out.println("Consultor: " + consultor.getNombre() + " " + consultor.getApellido() +
                ", ID Consultor: " + consultor.getIdConsultor() + ", Especialidad: " + consultor.getEspecialidad());


    }
}