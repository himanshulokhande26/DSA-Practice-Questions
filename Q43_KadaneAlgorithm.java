// Find the subarray with maximum sum (Kadane's algorithm).

class Q43_KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max_sum = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max_sum = Math.max(max_sum, curr);
        }

        System.out.println(max_sum);
    }
}