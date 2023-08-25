package org.example.exercicios.estruturascond;

import org.example.exercicios.domain.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int code, amount, total;

        Product hotDog = new Product(1, 4.50);
        Product xSalad = new Product(2, 4.50);
        Product xBacon = new Product(3, 5.00);
        Product simpleToast = new Product(4, 2.00);
        Product soda = new Product(5, 1.50);

        System.out.print("Informe o código do item: ");
        code = scanner.nextInt();

        switch (code){
            case 1 -> System.out.printf("Total: %.2f", getTotal(hotDog));
            case 2 -> System.out.printf("Total: %.2f", getTotal(xSalad));
            case 3 -> System.out.printf("Total: %.2f", getTotal(xBacon));
            case 4 -> System.out.printf("Total: %.2f", getTotal(simpleToast));
            case 5 -> System.out.printf("Total: %.2f", getTotal(soda));
        }
    }

    private static double getTotal(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade: ");
        int amount = scanner.nextInt();
        return amount * product.getPrice();
    }
}