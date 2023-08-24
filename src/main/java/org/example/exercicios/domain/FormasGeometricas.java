package org.example.exercicios.domain;

public abstract class FormasGeometricas {
    public double A, B, C;


    public FormasGeometricas(double A,double B,double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public abstract double calcularArea();
    public abstract String getTitle();
}
