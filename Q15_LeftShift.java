// Shift all element to the left by one position 

import java.util.*;

public class Q15_LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}