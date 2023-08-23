package org.example.exercicios.domain;

public class Circulo extends FormasGeometricas{

    @Override
    public double calcularArea() {
        return  3.14159 * Math.pow(C, 2);
    }
}
