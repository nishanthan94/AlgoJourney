package sorting;

import java.util.Collections;
import java.util.List;

public class KthSmallest {
    public int solution(final List<Integer> A, int B) {
        Collections.sort(A);
        System.out.println(A);
        return A.get(B);
    }
}
