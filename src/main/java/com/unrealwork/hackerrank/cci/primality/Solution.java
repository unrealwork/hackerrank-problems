package com.unrealwork.hackerrank.cci.primality;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

  public static boolean isPrime(final long number) {
    if (number == 1) {
      return false;
    }
    return LongStream.range(2, Math.round(Math.sqrt(number)) + 1).boxed()
        .allMatch(aLong -> number % aLong != 0);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    for (int a0 = 0; a0 < p; a0++) {
      int n = in.nextInt();
      System.out.println(isPrime(n) ? "Prime" : "Not prime");
    }
  }
}
