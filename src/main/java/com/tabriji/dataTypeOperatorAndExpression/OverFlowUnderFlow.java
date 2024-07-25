package com.tabriji.dataTypeOperatorAndExpression;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        long a = 2_147_483_647;
        a = a + 1;
        System.out.println(a);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);

        int minInteger = Integer.MIN_VALUE;
        System.out.println("minInteger: " + minInteger);
    }
}
