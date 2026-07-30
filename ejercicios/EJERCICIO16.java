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
public class EJERCICIO16 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números almacenados:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

