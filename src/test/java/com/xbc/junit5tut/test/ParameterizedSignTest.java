package com.xbc.junit5tut.test;

import com.xbc.junit5tut.math.EasyMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class ParameterizedSignTest {

    // Generating the data
    private static Collection<Object[]> generateEntries() {
        return Arrays.asList(new Object[][] {
                { 2, "Positive" },
                { -6, "Negative" },
                { 0, "Null" },
                { 1290, "Positive" },
                { -5234, "Negative" },
                { 0000, "Null" }
        });
    }

    @ParameterizedTest // (name = "Testing sign")
    @MethodSource("generateEntries") // using the provided method to generate data
    public void randomSignTest(int number, String eSign, TestInfo info, TestReporter reporter){
        // reporter.publishEntry(info.getDisplayName(), "Sign of " + number);
        assertEquals(
                eSign, // expected sign
                EasyMath.getSign(number), // actual sign
                "The Number "+number+" is: " ); // optional message
    }
}