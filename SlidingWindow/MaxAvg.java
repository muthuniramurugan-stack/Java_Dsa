// to find the maximum average subarray
package SlidingWindow;

public class MaxAvg {
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum=windowsum;
        for(int i=k;i<arr.length;i++){
            windowsum=windowsum+arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        double maxaverage = (double) maxsum/k;
        System.out.print("Maximum Average= "+maxaverage);
    }
}
