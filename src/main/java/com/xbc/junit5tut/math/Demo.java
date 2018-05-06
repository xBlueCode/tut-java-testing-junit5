package com.xbc.junit5tut.math;

public class Demo {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 0 ;

        System.out.println(a +"+"+ b +" = "+ EasyMath.add(a,b));
        System.out.println(a +"-"+ b +" = "+ EasyMath.substract(a,b));
        System.out.println(a +"/"+ b +" = "+ EasyMath.divide(a,b));
        System.out.println(a +" is "+ EasyMath.getSign(a));
        System.out.println(b +" is "+ EasyMath.getSign(b));
        System.out.println("Max Number is "+ EasyMath.max(a,b));
    }
}