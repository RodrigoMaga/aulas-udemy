package org.example.exercicios.estruturascond;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de x: ");
        double x = scanner.nextDouble();
        System.out.print("Informe o valor de y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y== 0){
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}