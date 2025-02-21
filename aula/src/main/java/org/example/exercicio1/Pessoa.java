package org.example.exercicio1;

public class Pessoa {

    //iniciando as Variaveis
    String nome;
    int idade;

    //Criando o contrutor
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    //Criando o método
    void buscarInformacoes(){
        System.out.println(nome + " tem "+ idade + " anos");
    }

}
