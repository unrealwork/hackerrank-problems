package com.unrealwork.hackerrank.algorithms.string.anagrams;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SolutionTest {

  @Test(dataProvider = "provideMakingAnagramsData")
  public void testNumberNeeded(String s, String t, int expectedResult) throws Exception {
    assertEquals(Solution.numberNeeded(s, t), expectedResult);
  }


  @DataProvider
  private Object[][] provideMakingAnagramsData() {
    return new Object[][]{
        {"", "", 0},
        {"abc", "cde", 4}
    };
  }
}