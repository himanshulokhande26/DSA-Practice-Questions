import java.util.Arrays;
import java.util.Scanner;

public class Q9_SeperateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] even = new int[countEven];
        int[] odd = new int[countOdd];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                even[j] = arr[i];
                j++;
            } else {

                odd[k] = arr[i];
                k++;
            }
        }
        System.out.println("Even Array");
        System.out.println(Arrays.toString(even));
        System.out.println("Odd Array");
        System.out.println(Arrays.toString(odd));
        System.out.println(countEven);
        System.out.println(countOdd);
        sc.close();

    }
}
