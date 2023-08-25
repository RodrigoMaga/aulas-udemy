package org.example.exercicios.estruturasseq;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, result;
        System.out.printf("Insira um número inteiro: ");
        a = scanner.nextInt();
        System.out.printf("Insira um número inteiro: ");
        b = scanner.nextInt();
        result = a + b;
        System.out.println("SOMA = " + result);

        scanner.close();
    }
}
