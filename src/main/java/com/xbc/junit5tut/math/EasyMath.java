package com.xbc.junit5tut.math;

public class EasyMath {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int substract(int n1, int n2) {
        return n1 - n2;
    }

    public static int divide(int n1, int n2) throws IllegalArgumentException {
        if (n2 == 0) throw new IllegalArgumentException("Devisor == 0 !!!");
        return n1 / n2;
    }

    public static String getSign(int n) {
        if (n == 0) return "Null";
        if (n > 0) return "Positive";
        else return "Negative";
    }

    public static int max(int n1, int n2) {
        return n1>=n2 ? n1:n2 ;
    }

    public static int sum(int ... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum;
    }
}