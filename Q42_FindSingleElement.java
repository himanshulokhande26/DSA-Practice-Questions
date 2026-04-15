// Find the element that appears only once.

class Q42_FindSingleElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 4, 4};

        int res = 0;
        for (int x : arr) {
            res ^= x;
        }

        System.out.println(res);
    }
}