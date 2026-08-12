package com.mycompany.ejerciciospoo;

public class Empleado {

    String nombre;
    String cargo;
    double salarioBase;
    int horasExtras;

    public Empleado(String nombre, String cargo, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public double calcularSalarioFinal() {

        double valorHoraExtra = 10000;
        return salarioBase + (horasExtras * valorHoraExtra);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salario final: $" + calcularSalarioFinal());
    }

    public static void main(String[] args) {

        Empleado empleado = new Empleado(
                "Jeison",
                "Desarrollador",
                2000000,
                10
        );

        empleado.mostrarInformacion();
    }
}
