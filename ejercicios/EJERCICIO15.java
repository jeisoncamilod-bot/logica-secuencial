/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;
import java.util.Scanner;
/**
 *
 * @author jeiso
 */
public class EJERCICIO15 {
  


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int cantidad = 0;
        double promedio;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {

            suma += numero;
            cantidad++;

            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = sc.nextInt();
        }

        if (cantidad > 0) {
            promedio = (double) suma / cantidad;

            System.out.println("Cantidad de números: " + cantidad);
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No ingresó números.");
        }

        sc.close();
    }
}

