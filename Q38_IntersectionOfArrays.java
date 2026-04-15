// Find the intersection of two arrays.

import java.util.*;

class Q38_IntersectionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        int[] b = {2, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int x : b) {
            if (map.containsKey(x) && map.get(x) > 0) {
                res.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        System.out.println(res);
    }
}