package com.unrealwork.hackerrank.algorithms.string.hackerrank;

import java.util.Scanner;

public class Solution {
    private static final String DEFAULT_TEMPLATE = "hackerrank";

    public static class TemplateChecker {
        public static boolean contains(String source, String template) {
            int j = 0;
            final int sourceLength = source.length();
            for (int i = 0; i < sourceLength; i++) {
                char cSource = source.charAt(i);
                char cTemplate = template.charAt(j);
                if (cSource == cTemplate) {
                    j++;
                }
                final int templateLength = template.length();
                if (j == templateLength) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            System.out.println((TemplateChecker.contains(s, DEFAULT_TEMPLATE)) ? "YES" : "NO");
        }
    }
}
