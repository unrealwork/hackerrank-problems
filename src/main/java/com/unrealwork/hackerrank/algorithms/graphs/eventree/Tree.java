package com.unrealwork.hackerrank.algorithms.graphs.eventree;


import java.util.Arrays;

public class Tree {
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
