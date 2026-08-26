package BinarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 2, 3 };
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Target Found At: " + mid);
                break;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
    }
}
