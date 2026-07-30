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
public class EJERCICIO17 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 15; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}

