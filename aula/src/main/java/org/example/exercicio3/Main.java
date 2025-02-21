package org.example.exercicio3;

public class Main {
    public static void main(String[] args) {
    ContaBancaria contabancaria = new ContaBancaria();

    contabancaria.titular = "Leonardo";
    contabancaria.saldo = 300;
    contabancaria.saque = 20;
    contabancaria.deposito = 100;

    contabancaria.sacar();
    contabancaria.depositar();


    }
}
