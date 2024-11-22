import java.util.*;

public class Solution {
    /**
     * Counts number of unique elements in an array using HashSet
     * 
     * @param A Input array of integers
     * @return Number of unique elements
     *         Time Complexity: O(n) - where n is length of array
     *         Space Complexity: O(n) - to store unique elements in HashSet
     */
    public int solve(int[] A) {
        // Create HashSet to store unique elements
        HashSet<Integer> hs = new HashSet<>();

        // Add all elements to HashSet (duplicates will be automatically handled)
        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }

        // Return size of HashSet which represents count of unique elements
        return hs.size();
    }
}