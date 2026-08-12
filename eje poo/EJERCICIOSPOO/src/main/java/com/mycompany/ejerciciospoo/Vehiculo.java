package com.mycompany.ejerciciospoo;

public class Vehiculo {

    String placa;
    String marca;
    String modelo;
    double combustible;
    boolean encendido;

    public Vehiculo(String placa, String marca, String modelo, double combustible) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;
    }

    public void encender() {
        if (combustible > 0) {
            encendido = true;
            System.out.println("Vehiculo encendido");
        }
    }

    public void apagar() {
        encendido = false;
        System.out.println("Vehiculo apagado");
    }

    public void realizarRecorrido(double consumo) {
        if (encendido && consumo <= combustible) {
            combustible = combustible - consumo;
            System.out.println("Recorrido realizado");
        } else {
            System.out.println("No se puede realizar el recorrido");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustible: " + combustible);
    }

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo(
                "ABC123",
                "Toyota",
                "2024",
                40
        );

        vehiculo.encender();
        vehiculo.realizarRecorrido(10);
        vehiculo.mostrarInformacion();
        vehiculo.apagar();
    }
}
