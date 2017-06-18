package com.unrealwork.hackerrank.algorithms.graphs.eventree;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static class Tree {
        private int[] tree;
        private int treeSize;

        public Tree(int[] tree) {
            this.tree = tree;
            this.treeSize = tree.length;
        }

        public boolean isTerminal(int node) {
            for (int n : tree) {
                if (n == node) {
                    return false;
                }
            }
            return true;
        }

        public boolean isRoot(int node) {
            return node == 0;
        }

        public int childrenCount(int node) {
            if (isTerminal(node)) {
                return 0;
            } else {
                int childrenCount = 0;
                for (int i = 0; i < tree.length; i++) {
                    if (tree[i] == node && tree[i] != i) {
                        childrenCount++;
                        childrenCount += childrenCount(i);
                    }
                }
                return childrenCount;
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(tree);
        }

        public int getTreeSize() {
            return treeSize;
        }
    }


    private static Tree readData(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            Scanner scanner = new Scanner(reader);
            int treeSize = scanner.nextInt();
            int edgeCount = scanner.nextInt();
            int[] result = new int[treeSize];
            for (int i = 0; i < edgeCount; i++) {
                result[scanner.nextInt() - 1] = scanner.nextInt() - 1;
            }
            return new Tree(result);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int solve(Tree t) {
        int result = 0;
        final int treeSize = t.getTreeSize();
        for (int i = 0; i < treeSize; i++) {
            if (t.childrenCount(i) % 2 == 1 && !t.isRoot(i)) {
                result++;
            }
        }
        return result;
    }

    private static void printResult(OutputStream os, int forestSize) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os))) {
            bufferedWriter.write(String.format("%d%n", forestSize));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static InputStream resourceFile(String name) {
        return Solution.class.getClassLoader().getResourceAsStream(name);
    }

    public static void main(String[] args) {
        Tree t = readData(System.in);
        printResult(System.out, solve(t));
    }
}
