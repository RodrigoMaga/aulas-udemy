package org.example.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        for (int i = 3; i < number; i++){
            if (number % i == 0 || number == 4){
                System.out.println("O numero " + number + " nao e primo ");
                return;
            }
        }
        System.out.println("O numero " + number + " e primo");
    }
}
