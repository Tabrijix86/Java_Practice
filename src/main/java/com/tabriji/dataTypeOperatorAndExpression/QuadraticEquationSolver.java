package com.tabriji.dataTypeOperatorAndExpression;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = -3;

        double determinant = b * b - 4.0 * a * c;

        if (determinant > 0.0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2.0 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
