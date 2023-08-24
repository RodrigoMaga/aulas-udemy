package org.example.exercicios.domain;

public class Circulo extends FormasGeometricas{

    public Circulo(double A, double B, double C) {
        super(A, B, C);
    }

    @Override
    public double calcularArea() {
        return  3.14159 * Math.pow(C, 2);
    }

    @Override
    public String getTitle() {
        return "circulo";
    }
}
