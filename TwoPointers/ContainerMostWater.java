package TwoPointers;

public class ContainerMostWater {
    public static void main(String[]args){
        int [] height={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right =height.length-1;
        int maxWater =0;
        while(left<right){
            int width=right-left;
            int minheight=Math.min(height[left],height[right]);
            int water=width*minheight;
            maxWater=Math.max(maxWater,water);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("Maximum water =" +maxWater);
     }
}
