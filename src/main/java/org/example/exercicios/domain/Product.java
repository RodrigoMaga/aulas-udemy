package org.example.exercicios.domain;

public class Product {

    private final double price;

    public Product(int code, double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}