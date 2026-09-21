package Recursion;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int target = 10;
        int res = find(arr, 0, target);
        System.out.println(res);
    }

    static int find(int[] arr, int index, int target) {
        if (index == arr.length) {
            return 0;
        }
        if (arr[index] == target) {
            return index;
        }
        return find(arr, index + 1, target);
    }
}
