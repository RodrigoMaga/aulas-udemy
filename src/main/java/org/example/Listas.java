package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Listas {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("rodrigo@gmail.com");
        emails.add("mateus@gmail.com");
        emails.add("gustavo@hotmail.com");

        System.out.println(emails);
        System.out.println(emails.get(1));
        emails.add(2, "cesar@bol.com");

        System.out.println(emails);

        for (String email : emails) {
            System.out.println(email);
            boolean mateus = email.contains("mateus");
            System.out.println(mateus);
        }

        convertendoVetorToLista();
        criarArrayOneLine();
        testandoOrdenacoes();
    }

    private static void convertendoVetorToLista() {
        Integer[] numero = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(numero);

        System.out.println(list.get(0));
    }

    private static void criarArrayOneLine() {
        List<String> emails = List.of("rodrigo@gmail.com", "mateus@gmail.com", "bolsonaro@bol.com");
//        emails.add("otario"); quando usar "List.of" a lista é imutável (não pode adicionar, nem remover)
        System.out.println(emails);
    }

    private static void testandoOrdenacoes() {
        List<String> emailsOdernados = List.of("rodrigo@gmail.com", "mateus@gmail.com", "bolsonaro@bol.com");
        Set<String> emailsDesordenados = Set.of("rodrigo@gmail.com", "mateus@gmail.com", "bolsonaro@bol.com");

        System.out.println("Ordenados: " + emailsOdernados);
        System.out.println("Ordenados: " + emailsOdernados);
        System.out.println("Desordenados: " + emailsDesordenados);
        System.out.println("Desordenados: " + emailsDesordenados);
        System.out.println("Desordenados: " + emailsDesordenados);
        System.out.println("Desordenados: " + emailsDesordenados);
    }
}
