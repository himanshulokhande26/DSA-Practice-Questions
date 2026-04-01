
// Find the max  & min of the array
import java.util.*;

public class Q3_findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min element is " + arr[0] + " and max element is " + arr[n - 1]);

    }
}