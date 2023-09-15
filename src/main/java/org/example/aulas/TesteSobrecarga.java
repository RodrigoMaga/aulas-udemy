package org.example.aulas;

public class TesteSobrecarga {
    public static void main(String[] args) {

        printa();
    }
    private static void printa() {
        printa();
    }

    private static void printa(Pessoa a) {
        System.out.println(a);
    }
}