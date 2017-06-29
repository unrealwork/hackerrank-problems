package com.unrealwork.hackerrank.cci.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

  public static int numberNeeded(String first, String second) {
    int result = 0;
    Map<Character, Integer> firstDict = stringDictionary(first);
    Map<Character, Integer> secondDict = stringDictionary(second);
    for (Map.Entry<Character, Integer> e : firstDict.entrySet()) {
      final Character c = e.getKey();
      if (secondDict.containsKey(c)) {
        result += Math.abs(e.getValue() - secondDict.get(c));
        secondDict.remove(c);
      } else {
        result += e.getValue();
      }
    }
    for (Map.Entry<Character, Integer> e : secondDict.entrySet()) {
      result += e.getValue();
    }
    return result;
  }

  private static Map<Character, Integer> stringDictionary(String s) {
    Map<Character, Integer> dict = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (dict.containsKey(c)) {
        dict.put(c, dict.get(c) + 1);
      } else {
        dict.put(c, 1);
      }
    }
    return dict;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(numberNeeded(a, b));
  }
}
