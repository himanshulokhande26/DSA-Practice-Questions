// Sort array in Descending Order

import java.util.*;

class Q18_SortArrayDescending {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };

        // Bubble Sort (just reverse condition)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
