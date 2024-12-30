package com.tabriji.objectOrientedProgramming;


public class Product {
    public static final int SHIPPING_RATE = 5;
    public static final int DIMENSION_CHARGE = (int) 1.5;
    private final String name;
    private final int weight;
    private final Dimension dimension;
    private double price;
    private int discount;

    public Product(String name, int weight, Dimension dimension, double price, int discount) {
        this.name = name;
        this.weight = weight;
        this.dimension = dimension;
        this.price = price;
        this.discount = discount;
    }

    public int getWeight() {
        return weight;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", dimension=" + dimension +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
