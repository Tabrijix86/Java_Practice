package com.tabriji.objectOrientedProgramming;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }

//    public double getTotalPrice() {
//        double totalPrice = 0;
//
//        for (Product product : products) {
//            double price = product.getPrice() * (100 - product.getDiscount()) / 100;
//            price += product.getWeight() * Product.SHIPPING_RATE;
//
//            if (product.getDimension().getVolume() > 10) {
//                price += product.getDimension().getVolume() * Product.DIMENSION_CHARGE;
//            }
//            totalPrice += price;
//        }
//        return totalPrice;
//    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "products=" + products + '}';
    }
}
