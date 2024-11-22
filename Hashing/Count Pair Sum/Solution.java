import java.util.*;
public class Solution {
    /**
     * Counts number of pairs that sum to target B
     * 
     * @param A Array of integers
     * @param B Target sum
     * @return Count of valid pairs modulo 10^9+7
     */
    public int solve(int[] A, int B) {
        // HashMap to store frequency of each number
        HashMap<Integer, Integer> hs = new HashMap<>();

        // Count to track pairs, using long to prevent overflow
        long count = 0;
        final int MOD = 1000000007;

        for (int i = 0; i < A.length; i++) {
            int current = A[i];
            int complement = B - current;

            // If complement exists, add its frequency to count
            if (hs.containsKey(complement)) {
                count = (count + hs.get(complement)) % MOD;
            }

            // Update frequency of current number
            hs.put(current, hs.getOrDefault(current, 0) + 1);
        }

        return (int) count;
    }
}