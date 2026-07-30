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
public class EJERCICIO1 {
    
     public static void main(String[] args) {
        Scanner teclado;
         teclado = new Scanner(System.in);
        
        double base, altura, area, perimetro;
        
        System.out.print("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}

