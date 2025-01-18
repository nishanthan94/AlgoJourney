package Hashing;

import java.util.*;

public class CheckPairSum {
    /**
     * Checks if there exists a pair in array B that sums to target A
     *
     * @param A Target sum to find
     * @param B Input array of integers
     * @return 1 if pair exists, 0 otherwise
     *         Time: O(n), Space: O(n)
     */
    public int solve(int A, int[] B) {
        // HashSet to store visited numbers
        HashSet<Integer> seen = new HashSet<>();

        // Check each number in array
        for (int num : B) {
            // If (A - num) exists in set, we found a pair
            if (seen.contains(A - num)) {
                return 1;
            }
            // Add current number to set
            seen.add(num);
        }

        // No pair found
        return 0;
    }
}
