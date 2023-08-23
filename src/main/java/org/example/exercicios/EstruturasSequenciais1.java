package org.example.exercicios;

import java.util.Scanner;

public class EstruturasSequenciais1 {
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
