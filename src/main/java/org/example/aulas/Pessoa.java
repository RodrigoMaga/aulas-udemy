package org.example.aulas;

public class Pessoa {
    protected String name;

    private String email;

    public Pessoa(String name, String email) {
        this.name = name;
        this.email = email;
    }

    protected Pessoa() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}