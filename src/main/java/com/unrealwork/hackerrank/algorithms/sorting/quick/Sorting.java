package com.unrealwork.hackerrank.algorithms.sorting.quick;

import java.util.Scanner;


public class Sorting {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    sort(arr);
    in.close();
  }

  static final void sort(int[] arr) {
    sort(arr, new int[arr.length], 0, arr.length - 1);
  }

  private static void sort(int[] arr, int[] temp, int li, int hi) {
    if (li >= hi) {
      return;
    }
    int j = partition(arr, temp, li, hi);
    sort(arr, temp, li, j - 1);
    sort(arr, temp, j + 1, hi);
    for (int i = li; i <= hi; i++) {
      System.out.print(String.format("%d ", arr[i]));
    }
    System.out.println();
  }

  static final int partition(int[] arr, int[] temp, int l, int r) {
    int pivot = arr[l];
    int j = l;
    for (int i = l + 1; i <= r; i++) {
      if (arr[i] <= pivot) {
        temp[j] = arr[i];
        j++;
      }
    }
    int result = j;
    temp[j] = pivot;
    j++;
    for (int i = l + 1; i <= r; i++) {
      if (arr[i] > pivot) {
        temp[j] = arr[i];
        j++;
      }
    }
    System.arraycopy(temp, l, arr, l, r - l + 1);
    return result;
  }

  private static final void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
