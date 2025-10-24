package com.example.clases;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    public String detalles(){
        StringBuilder miString= new StringBuilder();
        miString.append("Fabricante: ").append(this.fabricante).append("\n");
        miString.append("Modelo: ").append(this.modelo).append("\n");
        miString.append("Color: ").append(this.color).append("\n");
        miString.append("Cilindrada: ").append(this.cilindrada).append("\n");
        
        return miString.toString();
    }
}
