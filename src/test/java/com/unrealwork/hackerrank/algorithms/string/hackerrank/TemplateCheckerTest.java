package com.unrealwork.hackerrank.algorithms.string.hackerrank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class TemplateCheckerTest {
    @Test(dataProvider = "templateSourceProvider")
    public void testContains(String source, String template, boolean expectedResult) throws Exception {
        assertEquals(TemplateChecker.contains(source, template), expectedResult);
    }


    @DataProvider(name = "templateSourceProvider")
    private Object[][] provideTemplateSourceData() {
        return new Object[][]{
                {"hereiamstackerrank", "hackerrank", true},
                {"hackerworld", "hackerrank", false}
        };
    }
}