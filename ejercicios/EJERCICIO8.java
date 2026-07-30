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
public class EJERCICIO8 {
   
 {

        Scanner sc = new Scanner(System.in);

        double compra, descuento, total;

        System.out.print("Ingrese el valor de la compra: ");
        compra = sc.nextDouble();

        if (compra > 200000) {
            descuento = compra * 0.10;
        } else {
            descuento = 0;
        }

        total = compra - descuento;

        System.out.println("Descuento: $" + descuento);
        System.out.println("Valor a pagar: $" + total);

        sc.close();
    }
}

