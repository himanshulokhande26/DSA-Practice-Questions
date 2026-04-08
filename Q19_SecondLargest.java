// Find the second largest element in an array.
import java.util.*;

public class Q19_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest not possible");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE; // Initialised with smallest possible value an integer can have so even if
                                         // array is of negative integers it give correct output.
        int second_largest = Integer.MIN_VALUE; // Integer.MIN_VALUE = -2,147,483,648

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest = " + second_largest);
        }
        sc.close();
    }
}