package com.unrealwork.hackerrank.cci.balancedbrackets;

import java.util.Scanner;
import java.util.Stack;

public class Solution {


  public static boolean isBalanced(String expression) {
    Stack<Character> brackets = new Stack<>();
    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);
      if (isClosingBracket(c)) {
        if (brackets.isEmpty()) {
          return false;
        } else {
          char lastUnclosedBracket = brackets.peek();
          if (isClosingBracket(lastUnclosedBracket)) {
            return false;
          } else {
            if (isAppropriateBrackets(lastUnclosedBracket, c)) {
              brackets.pop();
            } else {
              brackets.push(c);
            }
          }
        }
      } else {
        brackets.push(c);
      }
    }
    return brackets.isEmpty();
  }

  private static boolean isAppropriateBrackets(char lastUnclosedBracket, char c) {
    return (lastUnclosedBracket == '(' && c == ')' ||
        lastUnclosedBracket == '[' && c == ']' ||
        lastUnclosedBracket == '{' && c == '}');
  }

  private static boolean isClosingBracket(char c) {
    return c == '}' || c == ']' || c == ')';
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      String expression = in.next();
      System.out.println((isBalanced(expression)) ? "YES" : "NO");
    }
  }
}
