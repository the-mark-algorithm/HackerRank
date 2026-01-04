package recursion.medium.recursiveDigitSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    /*
    * We define super digit of an integer  using the following rules:
    *
    * Given an integer, we need to find the super digit of the integer.
    *
    * If x has only 1 digit, then its super digit is itself.
    * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
    * 
    * This program executes a specific implementation of the solution.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        // Modify this to select the implementation to run
        RecursiveDigitSum implementation = new Impl1();
        int result = implementation.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
