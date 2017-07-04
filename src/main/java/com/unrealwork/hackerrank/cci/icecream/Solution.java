package com.unrealwork.hackerrank.cci.icecream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  private static class OrderedPair {

    private int first;
    private int second;

    private OrderedPair(int first, int second) {
      if (first <= second) {
        this.first = first;
        this.second = second;
      } else {
        this.first = second;
        this.second = first;
      }
    }

    @Override
    public String toString() {
      return String.format("%d %d", first, second);
    }
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int m = in.nextInt();
      int n = in.nextInt();
      int a[] = new int[n];
      for (int a_i = 0; a_i < n; a_i++) {
        a[a_i] = in.nextInt();
      }
      System.out.println(solve(a, m));
    }
  }

  private static OrderedPair solve(int[] a, int m) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      int diff = m - a[i];
      if (map.containsKey(diff)) {
        return new OrderedPair(map.get(diff), i + 1);
      }
      map.put(a[i], i + 1);
    }
    throw new IllegalStateException("Solution must exist!");
  }
}

