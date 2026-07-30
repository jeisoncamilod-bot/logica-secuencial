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
public class EJERCICIO4 {
    {
        Scanner teclado=new Scanner(System.in);
        
        double horas, valorHora;
        double salarioBruto, salud, pension, salarioNeto;

        System.out.print("Horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();

        salarioBruto = horas * valorHora;
        salud = salarioBruto * 0.04;
        pension = salarioBruto * 0.04;
        salarioNeto = salarioBruto - salud - pension;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Descuento Salud: $" + salud);
        System.out.println("Descuento Pensión: $" + pension);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
