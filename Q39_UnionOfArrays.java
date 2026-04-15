// Find the union of two arrays.

import java.util.*;

class Q39_UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) set.add(x);
        for (int x : b) set.add(x);

        System.out.println(set);
    }
}