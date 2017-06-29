package com.unrealwork.hackerrank.thirtydays;

import java.util.Scanner;

public class BinaryNumbers {

  public static int solve(int n) {
    int result = 0;
    int sequenceLength = 0;
    while (n != 0) {
      int currentByte = n % 2;
      if (currentByte == 1) {
        sequenceLength++;
      } else {
        result = Math.max(result, sequenceLength);
        sequenceLength = 0;
      }
      n /= 2;
    }
    result = Math.max(sequenceLength, result);
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(solve(n));
  }

}
