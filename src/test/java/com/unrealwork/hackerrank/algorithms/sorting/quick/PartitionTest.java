package com.unrealwork.hackerrank.algorithms.sorting.quick;


import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import java.util.Arrays;
import org.testng.annotations.Test;


public class PartitionTest {

  @Test
  public void testPartition() throws Exception {
    int[] a = new int[]{4, 5, 3, 7, 2};
    Partition.partition(a, 0, a.length - 1);
    int[] expectedResult = new int[]{3, 2, 4, 5, 7};
    String assertMessage = String
        .format("%s should equals to  %s", Arrays.toString(a), Arrays.toString(expectedResult));
    assertArrayEquals(assertMessage, a, expectedResult);
  }

}