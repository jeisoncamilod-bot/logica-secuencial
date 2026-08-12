package com.mycompany.ejerciciospoo;

public class Pedido {

    int numero;
    String fecha;
    String cliente;
    Plato plato;

    public Pedido(int numero, String fecha, String cliente, Plato plato) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plato = plato;
    }

    public void mostrarInformacion() {

        System.out.println("Numero de pedido: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);

        plato.mostrarInformacion();
    }

    public static void main(String[] args) {

        Plato plato = new Plato(
                "Hamburguesa",
                25000
        );

        Pedido pedido = new Pedido(
                1,
                "12/08/2026",
                "Jeison",
                plato
        );

        pedido.mostrarInformacion();
    }
}
