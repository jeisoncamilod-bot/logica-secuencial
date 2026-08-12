package com.mycompany.ejerciciospoo;

public class Plato {

    String nombre;
    double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Plato: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}
