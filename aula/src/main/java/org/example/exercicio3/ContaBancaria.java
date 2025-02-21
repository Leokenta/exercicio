package org.example.exercicio3;

public class ContaBancaria {
    String titular;
    int saldo;
    int saque;
    int deposito;

    void sacar() {
        System.out.println("O titular da conta " +titular+ " sacou "+saque+" Reais do seu saldo bancario de "+saldo+ " reais");
        System.out.println("saldo total de "+(saldo - saque));
    }
    void depositar() {
        System.out.println("O titular da conta "+titular+" depositou " +deposito+" reais na sua Conta Bancaria");
        System.out.println("Salto total de "+(saldo + deposito)+ " reais");
    }
}
