import java.util.*;

public class Q26_LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("Largest 3 elements:");
        for (int i = n - 1; i >= n - 3; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}