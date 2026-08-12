package com.mycompany.ejerciciospoo;

public class Mascota {

    String nombre;
    String especie;
    int edad;
    double peso;
    String propietario;

    public Mascota(String nombre, String especie, int edad, double peso, String propietario) {

        this.nombre = nombre;
        this.especie = especie;
        this.propietario = propietario;

        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }

        if (peso >= 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Propietario: " + propietario);
    }

    public void registrarConsulta() {
        System.out.println("Consulta medica registrada");
    }

    public static void main(String[] args) {

        Mascota mascota = new Mascota(
                "Max",
                "Perro",
                3,
                12.5,
                "Jeison"
        );

        mascota.mostrarInformacion();
        mascota.registrarConsulta();
    }
}