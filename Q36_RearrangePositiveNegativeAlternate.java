// Rearrange array so that positive and negative numbers alternate.

import java.util.*;

class Q36_RearrangePositiveNegativeAlternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3};

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0) pos.add(x);
            else neg.add(x);
        }

        int i = 0, p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }

        while (p < pos.size()) arr[i++] = pos.get(p++);
        while (n < neg.size()) arr[i++] = neg.get(n++);

        System.out.println(Arrays.toString(arr));
    }
}