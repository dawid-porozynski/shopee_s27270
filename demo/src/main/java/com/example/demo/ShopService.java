package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ShopService {

    private final ShopStorage shopStorage;

    public ShopService(ShopStorage shopStorage) {
        this.shopStorage = shopStorage;
    }

    public void addProduct(int cost, String name) {
        Product newProduct = new Product(name,cost);
        shopStorage.addProduct(newProduct);
    }
    public boolean productDoesNotExist(String productName) {
        Optional<Product> product = shopStorage.getProductByName(productName);

        return product.isEmpty();
    }
    public Order orderItems(Cart cart) {
        Order order = new Order(StatusType.SUCCESS);
        List<String> productList=cart.getProductList();
        AtomicInteger totalCost= new AtomicInteger();
        boolean canMakeOrder=productList.stream().noneMatch(this::productDoesNotExist);
        if (!canMakeOrder ){
            order.setStatusType(StatusType.FAILED);
            return order;
        }
        productList.forEach(product-> totalCost.addAndGet(shopStorage.getProductByName(product).get().getCost()));
        if (cart.getClient().getBalance()-totalCost.get()<0){
            order.setStatusType(StatusType.FAILED);
            return order;

        }
        cart.getClient().withdraw(totalCost.get());
        return order;
    }

}
