package org.example;

public class CuentaBancaria {
    private double saldo;

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El depósito debe ser mayor que 0.");
            return;
        }
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El retiro debe ser mayor que 0.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
            return false;
        }
        saldo -= monto;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
