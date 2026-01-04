package recursion.medium.recursiveDigitSum;

public class Impl1 implements RecursiveDigitSum {

    @Override
    public int superDigit(String n, int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Number of concatenations must be at least 1.");
        }

        // First calculate sum of concatenated digits
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int currNum = n.charAt(i) - '0'; // char arithmetic of their ascii values
            sum += currNum;
        }

        // the same sum of initial digits will be computed for each concatenation
        sum = sum * k;

        // Base Case: Sum of digits is a single digit - super digit found
        if (sum < 10) {
            return sum;
        }

        // Resursive Case: Sum of digits is multi-digit
        String digits = Integer.valueOf(sum).toString();
        return superDigit(digits, 1);
    }
    
}
