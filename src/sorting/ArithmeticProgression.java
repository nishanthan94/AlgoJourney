package sorting;

import java.util.Collections;
import java.util.List;

public class ArithmeticProgression {
    public int solution(final List<Integer> A) {
        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for (int i = 2; i < A.size(); i++) {
           int temp = A.get(i) - A.get(i-1);
           if(diff != temp){
               return 0;
           }
            diff = temp;
        }
        return 1;
    }
}
