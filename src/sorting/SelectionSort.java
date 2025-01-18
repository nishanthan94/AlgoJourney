package sorting;

/**
 * in place soring algorithm
 * when we modify same array without creating new array
 */
public class SelectionSort {
    public int[] solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            System.out.println(minIndex);
            // swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
