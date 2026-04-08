// Shift all the element to the right by one position 

import java.util.*;

public class Q16_RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size cannot be 0 or negative.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
