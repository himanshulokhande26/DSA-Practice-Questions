
// Q22 - Count the frequency of each element
import java.util.*;

public class Q22_CountFrequency {
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
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(frequency);
        sc.close();
    }
}
