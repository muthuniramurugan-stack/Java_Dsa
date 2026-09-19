package Recursion;

public class ArrayMax {
    public static void main(String[] args) {
        int [] arr = {2,9,4,7};
        int res = max(arr,0);
        System.out.println(res);
    }
    static int max(int[]arr,int n){
        if(n==arr.length){
            return 0;
        }
        int restmax=max(arr,n+1);
        if(arr[n]>restmax){
            return arr[n];
        }
        return restmax;

    }
}
