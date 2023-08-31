package org.example.exercicios.estruturasrep;

import java.util.Random;
import java.util.Scanner;

public class ExercicioBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxValue = 100;
        int intRandom = random.nextInt(maxValue);

        int input = scanner.nextInt();

        while (input != intRandom) {

            if (input > intRandom) {
                System.out.println(input + " é maior");
            }else {
                System.out.println(input + " é menor");
            }
            input = scanner.nextInt();
        }
        System.out.println("Parabéns!");
        scanner.close();
    }
}