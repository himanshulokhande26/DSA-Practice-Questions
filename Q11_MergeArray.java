// Mearge two array into third
import java.util.*;

public class Q11_MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int x = sc.nextInt();
        int[] arr1 = new int[x];
        System.out.println("Enter the elements of 1st array");
        for (int i = 0; i < x; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array");
        int y = sc.nextInt();
        int[] arr2 = new int[y];
        System.out.println("Enter the elements of 2nd array");
        for (int i = 0; i < y; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[x + y];

        // copy arr1
        for (int i = 0; i < x; i++) {
            arr3[i] = arr1[i];
        }

        // copy arr2 (clean indexing)
        for (int i = 0; i < y; i++) {
            arr3[x + i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
        sc.close();
    }
}