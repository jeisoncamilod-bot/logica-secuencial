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
public class EJERCICIO10 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese un año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

        sc.close();
    }
}

