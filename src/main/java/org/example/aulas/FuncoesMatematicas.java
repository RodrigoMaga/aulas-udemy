package org.example.aulas;

import java.util.Scanner;

public class FuncoesMatematicas {
    public static void main(String[] args) {
//        double x = 3.0;
//        double y = 4.0;
//        double z = -5.0;
//        double A, B, C;
//
//        A = Math.sqrt(x);
//        B = Math.sqrt(y);
//        C = Math.sqrt(25.0);
//        System.out.println("Raiz quadrada de " + x + " = " + A);
//        System.out.println("Raiz quadrada de " + x + " = " + B);
//        System.out.println("Raiz quadrada de 25 = " + C);
//
//        A = Math.pow(x, y);
//        B = Math.pow(x, 2.0);
//        C = Math.pow(5.0, 2.0);
//        System.out.println(x + " elevado a " + y + " = " + A);
//        System.out.println(x + " elevado ao quadrado = " + B);
//        System.out.println("5 elevado ao quadrado = " + C);
//
//        A = Math.abs(y);
//        B = Math.abs(z);
//        System.out.println("Valor absoluto de " + y + " = " + A);
//        System.out.println("Valor absoluto de " + z + " = " + B);

        FuncoesMatematicas funcoesMatematicas = new FuncoesMatematicas();
        funcoesMatematicas.baskara();
    }

    private void baskara(){
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.printf("Informe o valor de A: ");
        a = scanner.nextDouble();
        System.out.printf("Informe o valor de B: ");
        b = scanner.nextDouble();
        System.out.printf("Informe o valor de C: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2.0) - 4.0 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
