package org.example;

import org.example.aulas.JankenponHands;


public class TesteEnum {
    public static void main(String[] args) {
        JankenponHands pedra = JankenponHands.PEDRA;
        JankenponHands papel = JankenponHands.PAPEL;
        JankenponHands tesoura = JankenponHands.TESOURA;

        System.out.println(pedra.code);

        JankenponHands.fromCode(1);

        System.out.println("Hello World!");

        calculaGanhador(tesoura, papel);
    }
    public static void calculaGanhador(JankenponHands hand1, JankenponHands hand2) {
        if (hand1 == JankenponHands.PEDRA && hand2 == JankenponHands.TESOURA) {
            System.out.println("jogador 1 ganhou");
        }
    }
}