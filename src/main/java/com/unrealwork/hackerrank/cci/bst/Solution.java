package com.unrealwork.hackerrank.cci.bst;

/**
 * Created by shmagrinskii on 7/3/17.
 */
public class Solution {


  static boolean checkBST(Node root) {
    return checkBST(root, null, null);
  }

  private static boolean checkBST(Node root, Integer lowLimit, Integer upLimit) {
    if (root == null) {
      return true;
    }
    if (root.left != null) {
      if (root.data <= root.left.data) {
        return false;
      }
    }
    if (root.right != null) {
      if (root.data >= root.right.data) {
        return false;
      }
    }
    if (lowLimit != null) {
      if (root.data <= lowLimit) {
        return false;
      }
    }
    if (upLimit != null) {
      if (root.data >= upLimit) {
        return false;
      }
    }
    return checkBST(root.left, lowLimit, root.data) && checkBST(root.right, root.data, upLimit);
  }
}
