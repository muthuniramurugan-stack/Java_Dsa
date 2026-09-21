package Recursion;

public class Findelement {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 8;
        boolean res = find(arr, 0, target);
        System.out.println(res);
    }

    static boolean find(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, index + 1, target);
    }
}
