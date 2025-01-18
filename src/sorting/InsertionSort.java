package sorting;

/**
 * in place soring algorithm
 * in best case the time complexity was O(N) (1,2,3,4,5)
 */
public class InsertionSort {
    public int[] solve(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                System.out.println(j);
                if (arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
