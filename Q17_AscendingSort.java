import java.util.*;

public class Q17_AscendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size cannot be zero or negative");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
