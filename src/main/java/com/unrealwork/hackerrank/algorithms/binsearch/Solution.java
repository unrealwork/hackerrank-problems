package com.unrealwork.hackerrank.algorithms.binsearch;

/**
 * Created by shmagrinskii on 7/4/17.
 */
public class Solution {

  public static boolean binarySearchIterative(int[] array, int x) {
    int li = 0;
    int hi = array.length - 1;
    while (li <= hi) {
      int mid = li + ((hi + li) / 2);
      if (array[mid] == x) {
        return true;
      }
      if (x > array[mid]) {
        li = mid + 1;
      } else {
        hi = mid - 1;
      }

    }
    return false;
  }

  public static boolean binarySearchRecursive(int[] array, int x) {
    return binarySearchRecursive(array, x, 0, array.length - 1);
  }

  private static boolean binarySearchRecursive(int[] array, int x, int li, int hi) {
    if (li < hi) {
      return false;
    }
    int mid = li + ((hi + li) / 2);
    if (array[mid] == x) {
      return true;
    }
    return (x > array[mid]) ? binarySearchRecursive(array, x, mid + 1, hi)
        : binarySearchRecursive(array, x, li, mid - 1);
  }
}
