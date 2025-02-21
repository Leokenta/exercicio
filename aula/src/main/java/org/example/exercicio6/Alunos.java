package org.example.exercicio6;

import java.util.Scanner;

public class Alunos {
    String nome;
    Double nota1;
    Double nota2;
    Double media;

    void somarMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do Aluno?");
        nome = sc.nextLine();
        System.out.println("Qual a nota da primeira prova?");
        nota1 = sc.nextDouble();
        System.out.println("Qual a nota da segunda prova?");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A media do aluno "+nome+" ficou de "+media);

        sc.close();
    }
}
