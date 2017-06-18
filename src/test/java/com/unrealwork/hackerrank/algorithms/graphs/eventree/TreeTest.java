package com.unrealwork.hackerrank.algorithms.graphs.eventree;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class TreeTest {
    @Test
    public void testIsTerminal() throws Exception {
    }

    @Test(dataProvider = "childrenCountDataprovider")
    public void testChildrenCount(Tree t, int node, int expectedResult) throws Exception {
        final int actualResult = t.childrenCount(node);
        String assertMessage = String.format(
                "Node %d of  the tree %s should have %d children not %d",
                node, t, expectedResult, actualResult
        );
        assertEquals(actualResult, expectedResult, assertMessage);
    }

    @DataProvider(name = "childrenCountDataprovider")
    private Object[][] provideChildrenCountData() {
        final int[] tree = {0, 0, 0, 2, 1, 0, 1, 5, 7, 7};
        final Tree t = new Tree(tree);
        return new Object[][]{
                {t, 0, 9},
                {t, 5, 3},
                {t, 1, 2},
                {t, 6, 0}
        };
    }
}