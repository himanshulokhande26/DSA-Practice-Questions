// Sort array in Ascending Order

import java.util.*;

class Q17_SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Simple Bubble Sort (student-style)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}