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
    partition(arr, 0, size - 1);
    Arrays.stream(arr).forEach((e) -> System.out.print(String.format("%d ", e)));
    in.close();
  }

  static final int partition(int[] arr, int l, int r) {
    int i = l;
    int li = l + 1;
    int ri = r;

    while (true) {
      while (arr[li] < arr[i]) {
        li++;
        if (li == r) {
          break;
        }
      }
      while (arr[ri] > arr[i]) {
        ri--;
        if (ri == l) {
          break;
        }
      }

      if (ri < li) {
        break;
      }

      swap(arr, li, ri);
    }

    swap(arr, ri, l);
    return ri;
  }

  private static final void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
