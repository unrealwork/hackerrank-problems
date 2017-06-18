package com.unrealwork.hackerrank.algorithms.sorting.insertion.part1;

import java.util.Scanner;

public class Solution {


    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        for (int i = ar.length - 1; i > -1; i--) {
            for (int j = i; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j + 1];
                    ar[j + 1] = ar[j];
                    printArray(ar);
                    ar[j] = tmp;
                }
            }
        }
        printArray(ar);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }


}
