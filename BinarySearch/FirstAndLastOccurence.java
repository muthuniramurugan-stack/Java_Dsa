// to find the first and last occurence of the element
package BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        int first = -1;
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        // to find the first occurence of the element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // to find the last occurence of the element
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("FirstElement: " + first);
        System.out.println("LastElement: " + last);
    }
}
