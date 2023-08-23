package org.example.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasSequenciais2 {

    final static double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio, area;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o raio do cículo: ");

        raio = scanner.nextDouble();

        area = PI * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f", area );

        scanner.close();


    }
}
