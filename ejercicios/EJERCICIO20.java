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
public class EJERCICIO20 {
  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[25];

        for (int i = 0; i < 25; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 25; i++) {

            if (numeros[i] == buscar) {

                System.out.println("El número existe.");
                System.out.println("Se encuentra en la posición: " + i);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número no existe en el arreglo.");
        }

        sc.close();
    }
}

