
// Check equality of two string
import java.util.*;

public class Q12_CheckEqualityOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array");
        int y = sc.nextInt();
        int[] arr2 = new int[y];
        System.out.println("Enter the elements of 2nd array");
        for (int i = 0; i < y; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.equals(arr1, arr2));
        sc.close();
    }
}
