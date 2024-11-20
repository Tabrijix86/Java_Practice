package com.tabriji.objectAndClass;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(4);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle1.getArea());
        System.out.println("Area of circle3: " + circle1.getArea());

        System.out.println("circle1 = " + circle1.getNumOfObjectsCreated());
        System.out.println("circle2 = " + circle2.getNumOfObjectsCreated());
        System.out.println("circle3 = " + circle3.getNumOfObjectsCreated());
    }
}
