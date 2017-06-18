package com.unrealwork.hackerrank.algorithms.implementation.bigfactorial;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static class BigFactorial {
        public static BigInteger factorial(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    private static int readData(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            Scanner scanner = new Scanner(reader);
            return scanner.nextInt();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BigInteger solve(int n) {
        return BigFactorial.factorial(n);
    }

    private static void printResult(OutputStream os, BigInteger result) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os))) {
            bufferedWriter.write(String.format("%s%n", result));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static InputStream resourceFile(String name) {
        return Solution.class.getClassLoader().getResourceAsStream(name);
    }

    public static void main(String[] args) {
        printResult(System.out, solve(readData(System.in)));
    }
}
