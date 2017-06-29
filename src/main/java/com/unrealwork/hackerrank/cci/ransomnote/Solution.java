package com.unrealwork.hackerrank.cci.ransomnote;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  Map<String, Integer> magazineMap;
  Map<String, Integer> noteMap;

  public Solution(String magazine, String note) {
    magazineMap = dict(magazine);
    noteMap = dict(note);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();

    // Eat whitespace to beginning of next line
    scanner.nextLine();

    Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
    scanner.close();

    boolean answer = s.solve();
    if (answer) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  public boolean solve() {
    for (Map.Entry<String, Integer> e : noteMap.entrySet()) {
      if (magazineMap.containsKey(e.getKey())) {
        if (e.getValue() > magazineMap.get(e.getKey())) {
          return false;
        }
      } else {
        return false;
      }
    }
    return true;
  }

  private Map<String, Integer> dict(String s) {
    Map<String, Integer> dict = new HashMap<>();
    Arrays.stream(s.split(" ")).forEach(word -> {
      if (dict.containsKey(word)) {
        dict.put(word, dict.get(word) + 1);
      } else {
        dict.put(word, 1);
      }
    });
    return dict;
  }
}

