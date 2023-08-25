package org.example.exercicios.estruturasseq;

import org.example.exercicios.Peca;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Peca peca1 = new Peca();
        Peca peca2 = new Peca();

        System.out.print("Informe o código da peça: ");
        peca1.numero = scanner.nextInt();
        System.out.print("Informe a quantidade: ");
        peca1.quantidade = scanner.nextInt();
        System.out.print("Informe o valor: ");
        peca1.valor = scanner.nextDouble();

        System.out.print("Informe o código da peça: ");
        peca2.numero = scanner.nextInt();
        System.out.print("Informe a quantidade: ");
        peca2.quantidade = scanner.nextInt();
        System.out.print("Informe o valor: ");
        peca2.valor = scanner.nextDouble();

        double total = (peca1.quantidade * peca1.valor) + (peca2.quantidade * peca2.valor);

        System.out.printf("VALOR A PAGAR: %.2f", total);


    }
}
