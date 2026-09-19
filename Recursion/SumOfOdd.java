package Recursion;

public class SumOfOdd {
    public static void main(String[] args) {
        int n = 7;
        int res = sum(n);
        System.out.println(res);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            n--;
        }
        return n + sum(n - 1);
    }
}
