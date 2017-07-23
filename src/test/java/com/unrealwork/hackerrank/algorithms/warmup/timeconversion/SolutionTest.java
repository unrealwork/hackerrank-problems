package com.unrealwork.hackerrank.algorithms.warmup.timeconversion;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SolutionTest {

  @Test(dataProvider = "provideTimeConversionData")
  public void testTimeConversion(String time, String expectedResult) throws Exception {
    assertEquals(Solution.timeConversion(time), expectedResult);
  }

  @DataProvider
  private Object[][] provideTimeConversionData() {
    return new Object[][]{
        {"07:05:45PM", "19:05:45"},
        {"12:00:00AM", "00:00:00"},
        {"12:00:00PM", "12:00:00"},
    };
  }

}