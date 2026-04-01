
// Linear Search
import java.util.*;

public class Q4_LinearSearch {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element does not found");
        }

    }
}
