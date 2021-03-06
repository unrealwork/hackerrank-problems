package com.unrealwork.hackerrank.algorithms.sorting.quick;


import java.util.Arrays;
import java.util.Scanner;

class Partition {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }
    partition(arr, new int[arr.length], 0, size - 1);
    Arrays.stream(arr).forEach((e) -> System.out.print(String.format("%d ", e)));
    in.close();
  }


  static final int partition(int[] arr, int[] temp, int l, int r) {
    int pivot = arr[l];
    int j = 0;
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
