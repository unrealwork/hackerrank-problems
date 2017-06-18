package com.unrealwork.hackerrank.cci.arraylist;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int a_i = 0; a_i < n; a_i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < k; i++) {
            int head = list.removeFirst();
            list.add(head);
        }
        for (Integer e : list) {
            System.out.print(String.format("%d ", e));
        }
    }
}