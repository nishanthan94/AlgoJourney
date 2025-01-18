package Hashing;

import java.util.HashMap;

public class FrequencyOfElementQuery {
    /**
     * Finds frequency of elements from array B in array A
     *
     * @param A Array containing participant IDs
     * @param B Array of learners to check frequency for
     * @return Array containing frequencies of elements from B in A
     */
    public int[] solve(int[] A, int[] B) {
        // Store frequency counts of elements in array A
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequencies of all elements in A
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        // Look up frequencies for elements in B
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            ans[i] = hm.getOrDefault(B[i], 0);
        }
        return ans;
    }
}
