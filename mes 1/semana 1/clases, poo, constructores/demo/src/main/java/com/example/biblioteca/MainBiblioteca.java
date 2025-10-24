package com.example.biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        
        System.out.println("-------------- Ejemplo con el libro ---------------");
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 417, "Realismo Mágico");
        System.out.println(libro1.mostrarInformacion());
        System.out.println("jose pide un libro");
        System.out.println(libro1.prestar());
        System.out.println(libro1.mostrarInformacion());
        System.out.println("Moraima pide el mismo libro q jose");
        System.out.println(libro1.prestar());
        System.out.println(libro1.devolver());
        System.out.println(libro1.mostrarInformacion());
        System.out.println("Moraima pide el libro que devolvio jose");
        System.out.println(libro1.prestar());
        System.out.println(libro1.mostrarInformacion());

        System.out.println("---------------Ejemplo con la revista-------------");
        Revista revista1 = new Revista("National Geographic", "Varios Autores", 2023, 150, "Mensual");
        System.out.println(revista1.mostrarInformacion());
        System.out.println("Ana pide una revista");
        System.out.println(revista1.prestar());
        System.out.println(revista1.mostrarInformacion());
        System.out.println("Luis pide la misma revista que Ana");
        System.out.println(revista1.prestar());

        

       
        
      
    }

}
 