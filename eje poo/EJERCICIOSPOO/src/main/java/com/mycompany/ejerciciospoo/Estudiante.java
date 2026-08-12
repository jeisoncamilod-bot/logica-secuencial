package com.mycompany.ejerciciospoo;

public class Estudiante {

    String nombre;
    int edad;
    String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
    }

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Jeison",
                20,
                "ADSO"
        );

        estudiante.mostrarInformacion();
    }
}