package com.unrealwork.hackerrank.cci.runningmedian;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    int previousMedian = 0;
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
      if (i % 2 == 0) {
        System.out.println(a[i]);
      }
      System.out.println();
    }
  }
}
