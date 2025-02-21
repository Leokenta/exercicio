package org.example.exercicio7;

import java.util.Scanner;

public class Funcionario {
    String nome;
    Double salario;

    Double porcento;

    void desconto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do Funcionario?");
        nome = sc.nextLine();

        System.out.println("Qual o Salario do funcionario "+nome+ " ?");
        salario = sc.nextDouble();

        System.out.println("Quantos porcento (%) de desconto?");
        porcento = sc.nextDouble();

        porcento = porcento / 100;
        salario = salario - (salario * porcento);

        System.out.println("O salario do funcionario "+nome+" ficou de "+salario+" Reais");
        sc.close();
    }
}
