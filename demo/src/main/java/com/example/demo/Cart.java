package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String name;

    private final List<String> productList;
    public Cart(){
        this.productList=new ArrayList<>();
    }

    public void addItemToCart(String productToAdd){

            productList.add(productToAdd);
        }

    }

