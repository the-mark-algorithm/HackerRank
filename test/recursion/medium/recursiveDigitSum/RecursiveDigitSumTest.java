package test.recursion.medium.recursiveDigitSum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import recursion.medium.recursiveDigitSum.*;;

public class RecursiveDigitSumTest {

    RecursiveDigitSum impl;

    @Before
    public void setUp() {
        // Modify to select the implementation to test
        impl = new Impl1();
    }
    
    // Edge Cases
    @Test
    public void emptyString() {
        Assert.assertThrows(IllegalArgumentException.class, () -> { impl.superDigit("", 1); });
    }

    @Test
    public void zeroConcatenations() {
        Assert.assertThrows(IllegalArgumentException.class, () -> { impl.superDigit("123", 0); });
    }

    @Test
    public void singleDigit() {
        final Random rand = new Random();
        final int digit = rand.nextInt(10);
        final String digitString = Integer.toString(digit);

        Assert.assertEquals(digit, impl.superDigit(digitString, 1));
    }

    @Test
    public void testLargeInputs() {
        try {
            final BufferedReader br = new BufferedReader(new FileReader("test/recursion/medium/recursiveDigitSum/testCases.txt"));
            final String[] line = br.readLine().trim().split(" ");
            br.close();

            final String digitString = line[0];
            final int numConcats = Integer.valueOf(line[1]);
            final int expected = 7;
            Assert.assertEquals(expected, impl.superDigit(digitString, numConcats));
        } catch (IOException e) {
            Assert.fail("Failed to retrieve test case data.");
        }
    }

}
