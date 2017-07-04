package com.unrealwork.hackerrank.algorithms.sorting.merge;


public class MergeSort {

  public static void mergesort(int[] array) {
    mergesort(array, new int[array.length], 0, array.length - 1);
  }

  private static void mergesort(int[] array, int[] temp, int li, int ri) {
    if (li >= ri) {
      return;
    }
    int middle = (li + ri) / 2;
    mergesort(array, temp, li, middle);
    mergesort(array, temp, middle + 1, ri);
    mergeHalves(array, temp, li, ri);
  }

  private static void mergeHalves(int[] array, int[] temp, int li, int ri) {
    int leftEnd = (ri + li) / 2;
    int rightStart = leftEnd + 1;
    int size = ri - li + 1;

    int left = li;
    int right = rightStart;
    int index = li;

    while (left <= leftEnd && right <= ri) {
      if (array[left] < array[right]) {
        temp[index] = array[left];
        left++;
      } else {
        temp[index] = array[right];
        right++;
      }
      index++;
    }
    System.arraycopy(array, left, temp, index, leftEnd - left + 1);
    System.arraycopy(array, right, temp, index, ri - right + 1);
    System.arraycopy(temp, li, array, li, size);
  }
}
