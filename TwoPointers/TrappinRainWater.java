package TwoPointers;

public class TrappinRainWater {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        int first = 0;
        int last = arr.length - 1;
        int max = arr[first];
        int min = arr[last];
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                min = max;
                max = arr[i];
            }
        }
        while (first <= last) {
            int temp = min - arr[first];
            if (temp > 0) {
                water += temp;
            }
            first++;
        }
        System.out.println(water);
    }
}
