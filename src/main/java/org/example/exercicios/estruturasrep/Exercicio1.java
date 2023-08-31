package org.example.exercicios.estruturasrep;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua senha: ");
        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}