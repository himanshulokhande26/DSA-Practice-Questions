// Find the length of the longest subarray with all distinct elements.

import java.util.*;

class Q45_LongestSubarrayDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 2, 2};

        HashSet<Integer> set = new HashSet<>();

        int left = 0, max_len = 0;

        for (int right = 0; right < arr.length; right++) {
            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[right]);
            max_len = Math.max(max_len, right - left + 1);
        }

        System.out.println(max_len);
    }
}