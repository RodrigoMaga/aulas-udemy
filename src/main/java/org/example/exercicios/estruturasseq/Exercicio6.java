package org.example.exercicios.estruturasseq;

import org.example.exercicios.domain.*;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();


        FormasGeometricas triangulo = new Triangulo(A, B, C);
        FormasGeometricas circulo = new Circulo(A, B, C);
        FormasGeometricas trapezio = new Trapezio(A, B, C);
        FormasGeometricas quadrado = new Quadrado(A, B, C);
        FormasGeometricas retangulo = new Retangulo(A, B, C);

        print(triangulo);
        print(circulo);
        print(trapezio);
        print(quadrado);
        print(retangulo);


    }

    private static void print(FormasGeometricas formasGeometricas){
        double area = formasGeometricas.calcularArea();
        String title = formasGeometricas.getTitle();
        System.out.printf(title + " : %.3f%n", area);

    }
}
