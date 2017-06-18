package com.unrealwork.hackerrank.algorithms.string.hackerrank;


public class TemplateChecker {
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

