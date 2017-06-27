package com.unrealwork.hackerrank.thirtydays;

import java.util.Scanner;

public class Factorial {

  private static int factorial(int n) {
    return (n < 2) ? 1 : n * factorial(n - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int n = in.nextInt();
    System.out.print(factorial(n));
    in.close();
  }
}
