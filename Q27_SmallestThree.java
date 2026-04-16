// Find the smallest three element in an array
import java.util.*;

public class Q27_SmallestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Smallest 3 elements:");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}