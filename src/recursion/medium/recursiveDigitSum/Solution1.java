package recursion.medium.recursiveDigitSum;

/*
 * We define super digit of an integer  using the following rules:
 *
 * Given an integer, we need to find the super digit of the integer.
 *
 * If x has only 1 digit, then its super digit is itself.
 * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
 */

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n - a string representation of an integer.
     *  2. INTEGER k - the times to concatenate n to itself to create the number whose 
     *  super digit will be calculated
     */

    public static int superDigit(String n, int k) {
        if (k < 0) {
            throw new IllegalArgumentException("Number of concatenations cannot be negative.");
        }

        // First calculate sum of concatenated digits
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int currNum = n.charAt(i) - '0'; // char arithmetic of their ascii values
            sum += currNum;
        }

        // the same sum of initial digits will be computed for each concatenation
        sum = sum * (k + 1);

        // Base Case: Sum of digits is a single digit - super digit found
        if (sum < 10) {
            return sum;
        }

        // Resursive Case: Sum of digits is multi-digit
        return superDigit(sum.toString, 0);
    }

    public static String concat(String str, int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            builder.append(str);
        }

        return builder.toString();
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
