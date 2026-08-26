/* Remove all occurrences of the given value from the array
/ and return the number of elements remaining.
Input
arr = [3, 2, 2, 3]
val = 3

Output:
[2, 2]
*/
package TwoPointers;

public class RemoveElement {
    public static void main(String[]args){
        int [] arr = {3,2,3,2,1};
        int target=2;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
