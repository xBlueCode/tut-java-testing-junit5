package com.xbc.junit5tut.test;

import com.xbc.junit5tut.math.EasyMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
    Targeted Class : com.xbc.junit5tut.math
        Targeted Methods: add, substract, getSign, sum, divide & max.
*/

public class EasyMathTest {

    static int pNum1, pNum2, nNum1, nNum2, zero, sum ;

    // Initializing the data for testing
    @BeforeAll
    public static void setUp (){
        pNum1 = 15 ;
        pNum2 = 4 ;
        nNum1 = -5 ;
        nNum2 = -24 ;
        zero = 0 ;
        sum = pNum1 + pNum2 + nNum1 + nNum2 + zero ;
    }

    @Test   @DisplayName("Ignored test")
    @Disabled
    public void ignoredFailedTest() {
        fail();
    }

    @Test   @DisplayName("Addition test")
    @Tag("basic")
    public void additionTest(){
        assertEquals(
                nNum1+pNum2, // expected value
                EasyMath.add(nNum1, pNum2), // actual result
                nNum1+"+"+pNum2+ " = "); // optional message
    }

    @Test
    @Tag("basic") @DisplayName("Substraction test")
    public void substractionTest(){
        assertEquals(
                pNum1-pNum2, // expected value
                EasyMath.substract(pNum1, pNum2), // actual result
                pNum1+"-"+pNum2+ " = "); // optional message
    }

    @Test
    @Tag("basic")   @DisplayName("Sign of zero test")
    public void signOfZeroShouldBeNull(){
        assertEquals(
                "Null", // expected value
                EasyMath.getSign(zero), // actual result
                "Sign of Zero is: "); // optional message
    }

    @Test   @DisplayName("Sign of positive number test")
    @Tag("basic")
    public void signOfPositiveNumShouldBePositive(){
        assertEquals(
                "Positive", // expected value
                EasyMath.getSign(pNum1), // actual result
                "Sign of "+ pNum1 + " is: "); // optional message
    }

    @Test
    @Tag("basic")   @DisplayName("Sign of negative number test")
    public void signOfNegativeNumShouldBeNegative(){
        assertEquals(
                "Negative", // expected value
                EasyMath.getSign(nNum1), // actual result
                "Sign of "+ nNum1 + " is: "); // optional message
    }

    @Test
    @Tag("basic")   @DisplayName("Sum funtion test")
    public void sumTest(){
        assertEquals(
                sum, // expected value
                EasyMath.sum(pNum1,pNum2,nNum1,nNum2,zero), // actual result
                "The Sum of all numbers should be "); // optional message
    }

    @Test   @DisplayName("Throwing Exception test")
    @Tag("excetion_test")
    public void DivisionByZeroShouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> EasyMath.divide(pNum1,zero));
    }

    // TODO : Testing EasyMath.max(n1,n2) funtion
}