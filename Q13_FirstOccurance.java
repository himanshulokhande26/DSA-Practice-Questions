
// Find the index of first occurance of a given element
import java.util.*;

public class Q13_FirstOccurance {

    static int firstOccurence(int[] arr, int key) {
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

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose first occurance you want to find");
        int key = sc.nextInt();
        int result = firstOccurence(arr, key);
        if (result != -1) {
            System.out.println("The first occurance of element " + key + " is at index " + result);
        } else {
            System.out.println("Element is not in the array");
        }
        sc.close();

    }
}
