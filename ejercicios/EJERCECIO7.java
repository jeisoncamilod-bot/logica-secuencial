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
public class EJERCECIO7 {
 



    {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else if (edad >= 60) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Edad no válida.");
        }

        sc.close();
    }
}

