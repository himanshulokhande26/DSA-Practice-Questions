// Count the frequnecy of each element 
import java.util.*;
public class Q22_CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int fre = n;

        int[] arr = new int[n];
        int[] fArray = new int[fre];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
