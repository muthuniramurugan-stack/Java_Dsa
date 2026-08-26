// to find the minimum element in an rotated array using binary search
package BinarySearch;

public class RotatedMin {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 0,1, 2, 3 };
        int start = 0;
        int end = arr.length - 1;
        int min = arr[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < min) {
                min = arr[mid];
            }
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(min);
    } 
}
