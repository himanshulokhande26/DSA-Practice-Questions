import java.util.*;

public class Q28_SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }

        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
        sc.close();
    }
    
}