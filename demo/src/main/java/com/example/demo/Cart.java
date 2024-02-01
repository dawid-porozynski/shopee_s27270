package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Client client;

    private final List<String> productList=new ArrayList<>();;

    public Cart(Client client){

        this.client=client;
    }

    public List<String> getProductList() {
        return productList;
    }

    public Client getClient() {
        return client;
    }

    public void addItemToCart(String productToAdd){

            productList.add(productToAdd);
        }

    }

