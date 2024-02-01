package com.example.demo;

public class Product {
    private int cost;
    private String name;

    public int getCost() {
        return cost;
    }
    public Product(String name,int cost){
        this.name = name;
        this.cost=cost;
    }

    public String getProductName() {
        return name;
    }
}
