package org.example.exercicios.estruturascond;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();

        if (input >= 0 && input <= 25){
            System.out.println("Intervalo (0, 25]");
        }
        if (input > 25 && input <= 50){
            System.out.println("Intervalo (25, 50]");
        }
        if (input > 50 && input <= 75){
            System.out.println("Intervalo (50, 75]");
        }
        if (input > 75 && input <= 100){
            System.out.println("Intervalo (75, 100]");
        }
        if (input < 0 || input > 100){
            System.out.println("Fora do intervalo");
        }
        scanner.close();
    }
}
