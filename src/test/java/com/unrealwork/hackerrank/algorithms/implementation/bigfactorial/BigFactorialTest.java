package com.unrealwork.hackerrank.algorithms.implementation.bigfactorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.*;


public class BigFactorialTest {
    @Test(dataProvider = "bigFactorialDataProvider")
    public void testFactorial(int n, BigInteger expectedResult) throws Exception {
        assertEquals(BigFactorial.factorial(n), expectedResult);
    }


    @DataProvider(name = "bigFactorialDataProvider")
    public Object[][] provideBigFactorialData() {
        return new Object[][]{
                {25, new BigInteger("15511210043330985984000000")},
                {0, BigInteger.ONE},
                {2, new BigInteger("2")},
        };
    }
}