package Recursion;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        int res = sum(arr, 0);
        System.out.println(res);
    }

    static int sum(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sum(arr, n + 1);
    }
}
