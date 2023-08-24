package org.example.exercicios;

import org.example.exercicios.domain.*;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasSequenciais6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        FormasGeometricas formasGeometricas = new FormasGeometricas();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Trapezio trapezio = new Trapezio();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        formasGeometricas.A = scanner.nextDouble();
        formasGeometricas.B = scanner.nextDouble();
        formasGeometricas.C = scanner.nextDouble();

       double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
               areaTriangulo = triangulo.calcularArea();
               areaCirculo = circulo.calcularArea();
               areaTrapezio = trapezio.calcularArea();
               areaQuadrado = quadrado.calcularArea();
               areaRetangulo = retangulo.calcularArea();

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

    }

    private static void askInputs(FormasGeometricas formasGeometricas) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor de A: " + formasGeometricas.getClass().getName());
        formasGeometricas.A = scanner.nextDouble();
        System.out.print("Informe o valor de B: " + formasGeometricas.getClass().getName());
        formasGeometricas.B = scanner.nextDouble();
        System.out.print("Informe o valor de C: " + formasGeometricas.getClass().getName());
        formasGeometricas.C = scanner.nextDouble();
    }

}
