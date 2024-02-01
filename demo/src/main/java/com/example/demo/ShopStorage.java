package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ShopStorage {

    private final List<Product> productsList;

    public ShopStorage(){
        this.productsList=new ArrayList<>();
    }

   public void addProduct(Product product){
        this.productsList.add(product);


    }
    public Optional<Product> getProductByName(String productName) {
        return productsList.stream().filter(product -> product.getProductName().equals(productName)).findFirst();
    }


}
