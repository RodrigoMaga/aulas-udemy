package org.example.exercicios.estruturasseq;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int funcionario, horas;
        double salarioHora, salario;

        System.out.printf("Informe o numero do usuario: ");
        funcionario = scanner.nextInt();
        System.out.printf("Informe a quantidade de horas trabalhadas: ");
        horas = scanner.nextInt();
        System.out.printf("Informe o salario por hora do funcionario: ");
        salarioHora = scanner.nextDouble();
        salario = salarioHora * horas;


        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f", salario);


    }
}
