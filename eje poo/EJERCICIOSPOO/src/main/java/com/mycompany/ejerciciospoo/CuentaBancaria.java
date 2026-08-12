package com.mycompany.ejerciciospoo;

public class CuentaBancaria {

    String numeroCuenta;
    String titular;
    double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(
                "123456",
                "Jeison",
                500000
        );

        cuenta.depositar(100000);
        cuenta.retirar(50000);

        cuenta.mostrarInformacion();
    }
}