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
public class EJERCICIO19 {
 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[30];

        double suma = 0;
        double mayor;
        double menor;

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < 30; i++) {

            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];
        }

        mayor = notas[0];
        menor = notas[0];

        for (int i = 0; i < 30; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / 30;

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}

