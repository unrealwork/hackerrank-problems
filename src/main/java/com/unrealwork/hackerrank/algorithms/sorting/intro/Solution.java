package com.unrealwork.hackerrank.algorithms.sorting.intro;

import java.util.Scanner;

class Solution {

  static int indexByElement(int[] arr, int v) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      int middleElement = arr[middle];
      if (middleElement == v) {
        return middle;
      } else {
        if (v > middleElement) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int v = in.nextInt();
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    System.out.println(indexByElement(arr, v));
  }
}
