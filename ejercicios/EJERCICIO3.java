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
public class EJERCICIO3 {
    public static void main(String[] args){
        Scanner teclado=new   Scanner(System.in);
        
        double parcial1, parcial2, proyecto, definitiva;
        
        System.out.println("ingrese la nota del parcial 1: ");
        parcial1=sc.nextDouble();
        
        System.out.println("ingrese la nota del parcial 2: ");
        parcial2=sc.nextDouble();
        
        System.out.println("ingrese la nota del proyecto final: ");
        proyecto=sc.nextDouble();
        
        definitiva=parcial1 *0.30+
                   parcial2 *0.30+
                   proyecto * 0.40;
        
        System.out.println("la nota definitiva es:"+definitiva);
        
    }
    
}
