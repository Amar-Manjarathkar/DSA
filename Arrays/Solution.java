// Necessary imports for common functionalities

import java.util.*;  // For using utilities like Scanner, List, Arrays, etc.
// import java.io.*;    // For handling input/output streams
// import java.math.*;  // For handling large numbers, BigInteger, BigDecimal
// import java.text.*;  // For formatting date, numbers, etc.

public class Solution {

    public static void main(String[] args) {
        try ( // Example of input reading using Scanner
                Scanner reads = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int V = reads.nextInt();
            int W = reads.nextInt();
            // Example of calling a function
            int result = sampleFunction(V, W);
            System.out.println("FW=" + result);
            // Close the reads
        }
    }

    // A sample function
    public static int sampleFunction(int V, int W) {
        // Perform some operations and return a result
        int a;
        int b;

        b = (W / 2) - V;
        a = V - b;
        System.out.println("TW=" + a);

        return b;
    }
}
