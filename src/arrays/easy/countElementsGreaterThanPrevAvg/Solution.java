package arrays.easy.countElementsGreaterThanPrevAvg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* 
* Problem: Given an array of positive integers, return the number of elements that are
* strictly greater than the average of all previous elements. Skip the first element.
*
* This program executes a specific implementation of the solution.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int responseTimesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> responseTimes = IntStream.range(0, responseTimesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        // Modify this to select the implementation to run
        CountElementsGreaterThanPrevAvg implementation = new Impl1();
        int result = implementation.countResponseTimeRegressions(responseTimes);

        System.out.println(result);

        bufferedReader.close();
    }
}
