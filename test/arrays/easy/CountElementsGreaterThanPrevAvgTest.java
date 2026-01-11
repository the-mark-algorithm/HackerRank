package test.arrays.easy;

import arrays.easy.countElementsGreaterThanPrevAvg.*;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountElementsGreaterThanPrevAvgTest {
    CountElementsGreaterThanPrevAvg implementation;

    @Before
    public void setUp() {
        // Modify to select the implementation to test
        implementation = new Impl1();
    }

    // Edge Cases
    @Test
    public void emptyArray() {
        Assert.assertEquals(0, implementation.countResponseTimeRegressions(java.util.Collections.emptyList()));
    }

    @Test
    public void singleElementArray() {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);

        Assert.assertEquals(0, implementation.countResponseTimeRegressions(numList));
    }

    @Test
    public void strictlyDecreasingArray() {
        ArrayList<Integer> decreasingArr = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            decreasingArr.add(i);
        }

        Assert.assertEquals(0, implementation.countResponseTimeRegressions(decreasingArr));
    }

    @Test
    public void strictlyIncreasingArray() {
        ArrayList<Integer> increasingArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            increasingArr.add(i);
        }

        Assert.assertEquals(increasingArr.size() - 1, implementation.countResponseTimeRegressions(increasingArr));
    }
    
}