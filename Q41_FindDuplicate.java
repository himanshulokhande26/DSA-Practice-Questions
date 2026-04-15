// Find duplicate number in array.

import java.util.*;

class Q41_FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(x)) {
                System.out.println(x);
                return;
            }
            set.add(x);
        }
    }
}