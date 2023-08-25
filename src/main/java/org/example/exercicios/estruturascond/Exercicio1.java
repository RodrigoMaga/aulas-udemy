package org.example.exercicios.estruturascond;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Informe a hora final: ");
        int fim = scanner.nextInt();
        int duracao;

        if (inicio >= fim) {
            duracao = Math.abs(inicio - 24) + fim;
        } else {
            duracao = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}
