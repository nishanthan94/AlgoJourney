package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> list) {
        Collections.sort(list);
        int n = list.size();

        for (int i = 0; i < n; i++) {
            // Check if current number equals count of greater elements
            if (list.get(i) == (n - i - 1)) {
                // Ensure it is the last occurrence of the current number or the only one
                if (i == n - 1 || !list.get(i).equals(list.get(i + 1))) {
                    return 1;
                }
            }
        }
        return -1;
    }
}