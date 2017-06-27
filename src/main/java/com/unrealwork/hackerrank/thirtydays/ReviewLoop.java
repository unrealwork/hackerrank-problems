package com.unrealwork.hackerrank.thirtydays;

import java.util.Scanner;

public class ReviewLoop {

  private static void printFiltered(String s, boolean isOdd) {
    for (int i = 0; i < s.length(); i++) {
      if ((i % 2 == 1)  == isOdd) {
        System.out.print(s.charAt(i));
      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      String s = in.next();
      printFiltered(s, false);
      System.out.print(" ");
      printFiltered(s, true);
      System.out.println();
    }
    in.close();
  }
}