package org.example.exercicios.domain;

public class Retangulo extends FormasGeometricas{

    public Retangulo(double A, double B, double C) {
        super(A, B, C);
    }

    @Override
    public double calcularArea() {
        return A * B;
    }

    @Override
    public String getTitle() {
        return "retangulo";
    }
}
