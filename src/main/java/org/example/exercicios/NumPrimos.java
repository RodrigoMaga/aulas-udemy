package org.example.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++){
            if (i < number && number % i == 0){

            }
        }
        System.out.println(number);
    }
}
