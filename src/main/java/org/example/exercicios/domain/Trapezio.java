package org.example.exercicios.domain;

public class Trapezio extends FormasGeometricas{

    @Override
    public double calcularArea() {
        return (A + B) / 2.0 * C;
    }
}
