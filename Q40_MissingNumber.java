// Find missing number in sequence from 1 to n.

class Q40_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int sum = n * (n + 1) / 2;

        for (int x : arr) sum -= x;

        System.out.println(sum);
    }
}