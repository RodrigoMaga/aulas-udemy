package org.example.exercicios.domain;

public class Triangulo extends FormasGeometricas {

    public Triangulo(double A, double B, double C) {
        super(A, B, C);
    }

    @Override
    public double calcularArea() {
        return (A * C) / 2;
    }

    @Override
    public String getTitle() {
        return "triangulo";
    }
}
