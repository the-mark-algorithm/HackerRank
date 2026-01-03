import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class Solution1Test {
    // Edge Cases
    @Test
    public void emptyArray() {
        Assert.assertEquals(0, Result.countResponseTimeRegressions(java.util.Collections.emptyList()));
    }

    @Test
    public void singleElementArray() {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);

        Assert.assertEquals(0, Result.countResponseTimeRegressions(numList));
    }

    @Test
    public void strictlyDecreasingArray() {
        ArrayList<Integer> decreasingArr = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            decreasingArr.add(i);
        }

        Assert.assertEquals(0, Result.countResponseTimeRegressions(decreasingArr));
    }

    @Test
    public void strictlyIncreasingArray() {
        ArrayList<Integer> increasingArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            increasingArr.add(i);
        }

        Assert.assertEquals(increasingArr.size() - 1, Result.countResponseTimeRegressions(increasingArr));
    }
    
}