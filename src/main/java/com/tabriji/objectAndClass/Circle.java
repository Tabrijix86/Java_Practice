package com.tabriji.objectAndClass;

public class Circle {
    private static final double PI = 3.14159;
    private int radius;
    private static int numOfObjectsCreated = 0;

    public Circle(int radius) {
        this.radius = radius;
        numOfObjectsCreated++;
    }

    public static double getPi() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public int getNumOfObjectsCreated() {
        return numOfObjectsCreated;
    }
}
