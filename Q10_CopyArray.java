
//Copy element from one array to another
import java.util.*;

public class Q10_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[arr.length]; // int[] arr2 = Arrays.copyOf(arr, arr.lenth); this will copy arr into arr2 using built-in function.
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Array one is copied to array two ");
        System.out.println("Array 1 = " + Arrays.toString(arr));
        System.out.println("Array 2 = " + Arrays.toString(arr2));
        sc.close();
    }
}
