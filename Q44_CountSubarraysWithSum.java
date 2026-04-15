// Count number of subarrays with a given sum.

import java.util.*;

class Q44_CountSubarraysWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int x : arr) {
            sum += x;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}