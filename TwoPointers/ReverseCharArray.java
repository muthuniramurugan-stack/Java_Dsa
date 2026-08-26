package TwoPointers;

public class ReverseCharArray {
     public static void main(String[] args) {
        char arr[] = {'m','u','t','h','u'};
        int left=0;
        int right = arr.length-1;
        while(left<right){
            char temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
