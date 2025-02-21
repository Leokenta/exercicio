package org.example.exercicio5;
import java.util.Scanner;

public class Produto {
    String nome;
    Double preco;

    Double porcento;

    void desconto(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos porcento (%) de desconto?");
        porcento = sc.nextDouble();
        porcento = porcento / 100;
        preco = preco - (preco * porcento);
        System.out.println("Preco do produto "+nome+" ficou = "+preco+" Reais");
        sc.close();
    }
}
