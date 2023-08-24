package org.example.exercicios.domain;

public class Quadrado extends FormasGeometricas{

    public Quadrado(double A, double B, double C) {
        super(A, B, C);
    }


    @Override
    public double calcularArea() {
        return B * B;
    }

    @Override
    public String getTitle() {
        return "quadrado";
    }
}
