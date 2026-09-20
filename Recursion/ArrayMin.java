package Recursion;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        int ans = Min(arr, 0);
        System.out.println(ans);
    }

    static int Min(int[] arr, int n) {
        if (n == arr.length - 1) {
            return arr[n];
        }
        int res = Min(arr, n + 1);
        if (arr[n] < res) {
            return arr[n];
        }
        return res;
    }
}
