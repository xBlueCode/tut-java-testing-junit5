package com.xbc.junit5tut.test;

import com.xbc.junit5tut.math.EasyMath;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class EasyMathDynamicTest {

    static int[][] data;

    @BeforeAll // @BeforeEach & @AfterEach doesn't work with DynamicTest
    public static void setUp(){
        data = new int[][] {
                {1,9,10}, // data for addition test
                {1,5,-4}, // data for substraction test
                {-3,1,2,0}, // data for sum test
        };
    }

    @TestFactory
    public Collection<DynamicTest> additionTest(){

        return Arrays.asList(
                DynamicTest.dynamicTest("Addition test",
                        () -> assertEquals(
                                data[0][2],
                                EasyMath.add(data[0][0],data[0][1]),
                                data[0][0]+"+"+data[0][1]+ " = "
                        )),
                DynamicTest.dynamicTest("Substraction test",
                        () -> assertEquals(
                                data[1][2],EasyMath.substract(data[1][0],data[1][1]),
                                data[0][0]+"-"+data[0][1]+ " = "
                        )),
                DynamicTest.dynamicTest("Sum function test",
                        () -> assertEquals(
                                data[2][3],
                                EasyMath.sum(data[2][0],data[2][1], data[2][2]),
                                data[2][0]+"+"+data[2][1]+"+"+data[2][2]+" = "
                        ))
        );
    }
}