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
public class EJERCICIO18 {
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        int suma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            suma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double promedio = (double) suma / 20;

        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);

        sc.close();
    }
}

