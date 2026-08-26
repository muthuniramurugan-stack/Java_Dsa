// to find the largest element in rotated array using binarysearch
package BinarySearch;

public class RotatedMax {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int start = 0;
        int end = arr.length - 1;
        int largest = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > largest) {
                largest = arr[mid];
            }
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("The Largest Element In An Array Is: " + largest);
    }
}
