package org.example;

import org.example.aulas.Pessoa;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        Pessoa rodrigo = new Pessoa("Rodrigo", "rodrigo@gmail.com");


//        pessoa.name = "Rodrigo";
//        pessoa.email = "rodrigo@gmail.com";



        rodrigo.toString();

        System.out.println(rodrigo);

        metodoAlteraPessoaBemObscuro(rodrigo);

        System.out.println(rodrigo);
    }

    private static void metodoAlteraPessoaBemObscuro(Pessoa pessoa) {
        pessoa.setName("Mateus");
        pessoa.setEmail("mateus@bol.com.br");
    }
}