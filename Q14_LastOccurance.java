// Find the index of the last occurance of the given element 

import java.util.Scanner;

public class Q14_LastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose last occurance you want to find");
        int key = sc.nextInt();
        int lastOccurance = -1;
        for (int i = arr.length - 1; i >= 0; i--) { // Traversing the array backward so the first occurance will become the last occurance
            if (arr[i] == key) {
                lastOccurance = i;
                break;
            }
        }
        if (lastOccurance != -1) {
            System.out.println("The last occurance of element " + key + " is at the index " + lastOccurance);
        } else {
            System.out.println("Element is not present in the array");
        }
        sc.close();
    }
}
