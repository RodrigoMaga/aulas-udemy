package org.example.exercicios.estruturasrep;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        scanner.close();
    }
}