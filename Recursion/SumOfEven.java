package Recursion;

public class SumOfEven {
    public static void main(String[] args) {
        int n = 6;
        int res = Sum(n);
        System.out.print(res);
    }

    static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            n--;
        }
        return n + Sum(n - 2);
    }
}
