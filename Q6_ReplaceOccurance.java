// Replace all the occureance of the element in an array

import java.util.Arrays;
import java.util.Scanner;

public class Q6_ReplaceOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be replaced");
        int key = sc.nextInt();
        System.out.println("Enter the Element");
        int replace = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                arr[i] = replace;
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}