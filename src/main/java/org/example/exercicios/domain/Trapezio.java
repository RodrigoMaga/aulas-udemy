package org.example.exercicios.domain;

public class Trapezio extends FormasGeometricas{

    public Trapezio(double A, double B, double C) {
        super(A, B, C);
    }

    @Override
    public double calcularArea() {
        return (A + B) / 2.0 * C;
    }

    @Override
    public String getTitle() {
        return "trapezio";
    }
}
