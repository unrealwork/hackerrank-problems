package com.unrealwork.hackerrank.algorithms.sorting.intro;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SolutionTest {

  @Test(dataProvider = "provideIntroData")
  public void testIndexByElement(int[] arr, int v, int expectedResult) throws Exception {
    assertEquals(Solution.indexByElement(arr, v), expectedResult);
  }

  @DataProvider
  private Object[][] provideIntroData() {
    return new Object[][]{
        {
            new int[]{1, 4, 5, 7, 9, 12}, 4,
            1
        },
        {
            new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23}, 23,
            11
        }
    };
  }
}