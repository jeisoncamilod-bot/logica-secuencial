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
public class EJERCECIO6 {
    Scanner teclado=new Scanner(System.in);

     {

        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        sc.close();
    }
}
       
        }

    
