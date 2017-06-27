package com.unrealwork.hackerrank.algorithms.sorting.insertion;

import java.io.*;
import java.util.*;

public class RunningTime {

  public static int insertIntoSorted(int[] ar) {
    // Fill up this function
    int res = 0;
    for (int i = ar.length - 1; i > -1; i--) {
      boolean isShifted = false;
      for (int j = i; j < ar.length - 1; j++) {
        if (ar[j] > ar[j + 1]) {
          res++;
          int tmp = ar[j + 1];
          ar[j + 1] = ar[j];
          ar[j] = tmp;
        }
      }
    }
    return res;
  }


  /* Tail starts here */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int[] ar = new int[s];
    for (int i = 0; i < s; i++) {
      ar[i] = in.nextInt();
    }
    final int times = insertIntoSorted(ar);
    System.out.println(times);
  }


}