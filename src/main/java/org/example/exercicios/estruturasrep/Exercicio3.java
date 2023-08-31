package org.example.exercicios.estruturasrep;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcool, gasolina, diesel, fim, input, alcoolCounter, gasolinaCounter, dieselCounter;
        alcool = 1;
        gasolina = 2;
        diesel = 3;
        fim = 4;
        alcoolCounter = 0;
        gasolinaCounter = 0;
        dieselCounter = 0;
        input = scanner.nextInt();

        while (input != fim){
            if (input == alcool){
                input = scanner.nextInt();
                alcoolCounter++;
            }
            else if (input == gasolina){
                input = scanner.nextInt();
                gasolinaCounter++;
            }
            else if (input == diesel) {
                input = scanner.nextInt();
                dieselCounter++;
            } else {
                input = scanner.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcoolCounter);
        System.out.println("Gasolina: " + gasolinaCounter);
        System.out.println("Diesel: " + dieselCounter);

        scanner.close();
    }
}
