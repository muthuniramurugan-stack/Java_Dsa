package TwoPointers;

public class MoveZeros {
    public static void main(String[]args){
        int arr[]={1,2,0,0,2,};
        int fast=0;
        int last = arr.length-1;
        while(fast<last){
            if(arr[fast]==0){
                int temp=arr[fast];
                arr[fast]=arr[last];
                arr[last]=temp;
                last--;
            }else{
                fast++;
            }
        }
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
