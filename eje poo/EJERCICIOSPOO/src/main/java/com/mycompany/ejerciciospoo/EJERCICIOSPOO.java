/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciospoo;
import java.util.Scanner;
/**
 *
 * @author jeiso
 */
public class EJERCICIOSPOO {
public class Libro {

    String titulo;
    String autor;
    int paginas;

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }
 public static void main(String[] args) {

        libro.titulo = "Cien años de soledad";
        libro.autor = "Gabriel Garcia Marquez";
        libro.paginas = 417;

        libro.mostrarInformacion();
    }
}
   

