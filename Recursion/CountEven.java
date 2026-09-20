package Recursion;

public class CountEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int res = even(arr, 0);
        System.out.print(res);
    }

    static int even(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        int count = even(arr, n + 1);
        if (arr[n] % 2 == 0) {
            count++;
        }
        return count;
    }
}
