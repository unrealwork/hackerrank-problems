package com.unrealwork.hackerrank.algorithms.sorting.merge;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import org.testng.annotations.Test;


public class SolutionTest {

  @Test
  public void testMergesort() throws Exception {
    Random random = new Random();
    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(20);
    }
    Arrays.stream(a).map(random::nextInt).close();
    int[] b = Arrays.copyOf(a, a.length);
    Solution.mergesort(b);
    Arrays.sort(a);
    assertArrayEquals(a, b);
  }

}