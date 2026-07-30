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
public class EJERCICIO2 {
    public static void main (string[] args){
        Scanner teclado=new Scanner(System.in);
        
        double valor, iva, total;
        
        System.out.println("Ingrese el valor del producto");
        valor=sc.nextDouble();
        
        iva=valor *0.19;
        total=valor + iva;
        System.out.println("valor del producto: $" + valor);
        System.out.println("iva: $"+ total);
    }
}
