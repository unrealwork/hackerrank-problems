package com.unrealwork.hackerrank.algorithms.warmup.timeconversion;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

  static String timeConversion(String s) {
    String[] splitted = s.split(":");
    String half = splitted[2].replaceAll("\\d", "");
    int hour = Integer.valueOf(splitted[0]);
    int m = Integer.valueOf(splitted[1]);
    int sec = Integer.valueOf(splitted[2].replaceAll("[PMA]", ""));
    hour %= 12;
    if (half.equals("PM")) {
      hour += 12;
    }
    return Stream.of(hour, m, sec).map(n -> (n < 10) ? "0" + n : "" + n)
        .collect(Collectors.joining(":"));
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
  }
}
