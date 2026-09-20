package Recursion;

public class CountOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int res = odd(arr, 0);
        System.out.print(res);
    }

    static int odd(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        int count = odd(arr, n + 1);
        if (arr[n] % 2 != 0) {
            count++;
        }
        return count;
    }
}
