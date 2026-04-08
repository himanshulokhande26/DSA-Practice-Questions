
// Find the second smallest element in an array.
import java.util.*;

public class Q20_SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second smallest not possible");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE; // Initialised with Largest possible value an integer can have so even if
                                          // array is of negative integers it give correct output.
        int second_smallest = Integer.MAX_VALUE; // Integer.MAX_VALUE = 2,147,483,647

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }

        if (second_smallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest = " + second_smallest);
        }
    }
}
