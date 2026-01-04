package arrays.easy.countElementsGreaterThanPrevAvg;

import java.util.List;

public class Impl1 implements CountElementsGreaterThanPrevAvg {

    @Override
    public int countResponseTimeRegressions(List<Integer> responseTimes) {
        if (responseTimes == null || responseTimes.size() < 2) return 0;

        int count = 0;

        long currentAverage = responseTimes.get(0);
        for (int i = 1; i < responseTimes.size(); i++) {
            int currentValue = responseTimes.get(i);
            if (currentValue > currentAverage) {
                count++;
            }
            currentAverage = (currentAverage * i + currentValue) / (i + 1);
        }   
        return count;
    }

}
