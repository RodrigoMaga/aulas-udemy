package org.example.exercicios.estruturasseq;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.printf("Insira o valor de A: ");
        A = scanner.nextInt();
        System.out.printf("Insira o valor de B: ");
        B = scanner.nextInt();
        System.out.printf("Insira o valor de C: ");
        C = scanner.nextInt();
        System.out.printf("Insira o valor de D: ");
        D = scanner.nextInt();

        int diferenca = A * B - C * D;

        System.out.println("DIFERENCA = " + diferenca);

        scanner.close();


    }
}
