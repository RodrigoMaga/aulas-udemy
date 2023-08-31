package org.example.exercicios.estruturasrep;

import java.util.*;

public class ExercicioBonus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"java", "programacao", "computador", "desenvolvimento", "algoritmo"};

        String chosenWord = randomizeArray(words);

        System.out.println(chosenWord);

        System.out.println(letterCount(chosenWord));


    }

    private static String randomizeArray(String[] array) {
        Random random = new Random();

        int randomString = random.nextInt(array.length);
        return array[randomString];
    }

    private static void gamePlay() {

    }
    private static int letterCount(String word){
        return word.length();
    }
}
