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
public class EJERCICIO14 {
   


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            suma += numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}

