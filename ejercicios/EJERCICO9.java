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
public class EJERCICO9 {
  

 {

    {

        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Mayor: " + num1);
            System.out.println("Menor: " + num2);
        } else if (num2 > num1) {
            System.out.println("Mayor: " + num2);
            System.out.println("Menor: " + num1);
        } else {
            System.out.println("Los dos números son iguales.");
        }

        sc.close();
    }
}
}
