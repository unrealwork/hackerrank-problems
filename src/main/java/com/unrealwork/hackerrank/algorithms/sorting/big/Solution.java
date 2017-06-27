package com.unrealwork.hackerrank.algorithms.sorting.big;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {

  private static String[] readData(InputStream is) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
      Scanner scanner = new Scanner(reader);
      int n = scanner.nextInt();
      String[] unsorted = new String[n];
      for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
        unsorted[unsorted_i] = scanner.next();
      }
      return unsorted;
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  private static String[] solve(String[] strings) {
    Arrays.sort(strings, (s1, s2) -> {
      final int length1 = s1.length();
      final int length2 = s2.length();
      if (length1 > length2) {
        return 1;
      } else {
        if (length1 == length2) {
          for (int i = 0; i < length1; i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
              return 1;
            } else {
              if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
              }
            }
          }
          return 0;
        }
      }
      return -1;
    });
    return strings;
  }

  private static void printResult(OutputStream os, String[] sorted) {
    try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os))) {
      StringBuilder sb = new StringBuilder();
      for (String num : sorted) {
        sb.append(String.format("%s%n", num));
      }
      bufferedWriter.write(sb.toString());
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  public static void main(String[] args) {
    printResult(System.out, solve(readData(System.in)));
  }
}

