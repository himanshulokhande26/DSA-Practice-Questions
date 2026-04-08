
// Remove duplicate from an array

//Solution 1: Time complexity - O(n log n)
import java.util.*;

public class Q21_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j = 0; // Unique pointer
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, j + 1)));
        sc.close();
    }
}

// Solution 2: Using HashMap, Time complexity: O(n)
// import java.util.*;

// public class Q21_RemoveDuplicate_HashSet {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the size of an array");
// int n = sc.nextInt();

// int[] arr = new int[n];

// System.out.println("Enter the elements of the array");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// HashSet<Integer> set = new HashSet<>();

// // Add elements to set
// for (int i = 0; i < n; i++) {
// set.add(arr[i]); **HashMap only contain unique value it by default ignore
// dulpicate value**
// }

// // Print unique elements
// System.out.println("Array after removing duplicates:");
// System.out.println(set);
// }
// }
