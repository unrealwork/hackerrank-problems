package com.unrealwork.hackerrank.algorithms.sorting.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

  private static final PriorityQueue<Integer> LEFT_HALF = new PriorityQueue<>(
      Collections.reverseOrder());
  private static final PriorityQueue<Integer> RIGHT_HALF = new PriorityQueue<>();

  public static void add(Integer n) {
    if (LEFT_HALF.isEmpty() && RIGHT_HALF.isEmpty()) {
      RIGHT_HALF.add(n);
    } else {
      double currentMedian = median();
      if (n > currentMedian) {
        if (RIGHT_HALF.size() > LEFT_HALF.size()) {
          LEFT_HALF.add(RIGHT_HALF.poll());
        }
        RIGHT_HALF.add(n);
      } else {
        if (LEFT_HALF.size() > RIGHT_HALF.size()) {
          RIGHT_HALF.add(LEFT_HALF.poll());
        }
        LEFT_HALF.add(n);
      }
    }
  }

  public static double median() {
    if (LEFT_HALF.size() == RIGHT_HALF.size()) {
      return (RIGHT_HALF.peek() + LEFT_HALF.peek()) / 2.0;
    } else {
      return (LEFT_HALF.size() > RIGHT_HALF.size()) ? LEFT_HALF.peek() : RIGHT_HALF.peek();
    }
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      add(in.nextInt());
      System.out.println(median());
    }
  }
}
