package org.example.exercicios.estruturascond;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double renda, impostoRenda;
        System.out.print("Informe seu salário: ");
        renda = scanner.nextDouble();

        if (renda > 2000) {
            if (renda <= 3000) {
                impostoRenda = (renda - 2000) / 100 * 8;
                System.out.printf("R$ %.2f", impostoRenda);
            }
            else if (renda <= 4500) {
                impostoRenda = (renda - 3000) / 100 * 18;
                impostoRenda += 80;
                System.out.printf("R$ %.2f", impostoRenda);
            }
            else {
                impostoRenda = (renda - 4500) / 100 * 28;
                impostoRenda += 80 + ((1500 / 100) * 18);
                System.out.printf("R$ %.2f", impostoRenda);
            }
        } else {
            System.out.println("Insento");
        }
        scanner.close();
    }
}