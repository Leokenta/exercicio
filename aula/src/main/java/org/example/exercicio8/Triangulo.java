package org.example.exercicio8;

import java.util.Scanner;

public class Triangulo {
    Double base;
    Double altura;

    Double area;
    Double perimetro;

    void calcularArea(){
        area = (base * altura)/2;

        System.out.println("Area do triangulo = "+area);
    }
    void calcularPerimetro(){
        perimetro = (base + base + base);
        System.out.println("Perimetro = " + perimetro);

    }
}
