package org.example.aulas;

public class Dj extends Pessoa {

    private String musicStyle;

    public Dj(String name, String email, String musicStyle) {
        super(name, email);
        this.musicStyle = musicStyle;
    }

    private void printName() {
        name = "Rodrigão";
    }
}