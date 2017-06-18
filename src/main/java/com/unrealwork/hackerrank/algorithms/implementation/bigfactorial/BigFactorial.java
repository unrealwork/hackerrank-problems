package com.unrealwork.hackerrank.algorithms.implementation.bigfactorial;


import java.math.BigInteger;

public class BigFactorial {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
