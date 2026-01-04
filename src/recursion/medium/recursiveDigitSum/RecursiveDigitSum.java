package recursion.medium.recursiveDigitSum;

public interface RecursiveDigitSum {

    /*
    * We define super digit of an integer  using the following rules:
    *
    * Given an integer, we need to find the super digit of the integer.
    *
    * If x has only 1 digit, then its super digit is itself.
    * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. STRING n - a string representation of an integer.
    *  2. INTEGER k - the times to concatenate n to itself to create the number whose 
    *  super digit will be calculated
    */
    public int superDigit(String n, int k);
}
