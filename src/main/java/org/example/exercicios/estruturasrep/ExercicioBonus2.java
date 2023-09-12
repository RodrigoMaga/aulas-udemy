package org.example.exercicios.estruturasrep;

import java.util.*;

public class ExercicioBonus2 {
    public static void main(String[] args) {
        gamePlay();
    }

    private static String randomizeArray(List<String> array) {
        Random random = new Random();

        int randomString = random.nextInt(array.size());
        return array.get(randomString);
    }

    private static void gamePlay() {
        List<String> words = List.of("java", "programacao", "computador", "desenvolvimento", "algoritmo");
        String chosenWord = randomizeArray(words);
        System.out.println(chosenWord);
        int tentativas = 1;
        String hiddenWord = "_".repeat(chosenWord.length());
        System.out.println(hiddenWord);
        String chosenLetter = askInput("Informe a letra: ");

        System.out.println("A palavra tem " + letterCount(chosenWord) + " letras");

        while (tentativas <= 5) {

            if (chosenLetter.equals(chosenWord)) {
                System.out.println("Parabens");
                return;
            } else if (chosenWord.contains(chosenLetter)) {
                System.out.println(chosenLetter + " tem na palavra ");
                System.out.println(chosenLetter + " esta na " + (chosenWord.indexOf(chosenLetter) + 1) + " posição");
                chosenLetter = askInput("Informe outra letra");
            } else if (!chosenWord.contains(chosenLetter)) {
                System.out.println(chosenLetter + " não tem na palavra");
                chosenLetter = askInput("Informe outra letra");
                tentativas++;
            }

        }
    }

    private static void letterPosition() {
    }

    private static int letterCount(String word) {
        return word.length();
    }

    public static String askInput(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.next();
    }
}
