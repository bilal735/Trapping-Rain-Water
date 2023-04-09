import java.util.*;
class RainWater{
    public static int trap(int[] height) {
      int left[]=new int[height.length];
      int right[]=new int[height.length];
      left[0]=height[0];
      right[height.length-1]=height[height.length-1];
      for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
      } 
      for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
      }  
      int sum=0;
      for(int i=0;i<height.length;i++){
          sum+= -height[i]+Math.min(left[i],right[i]);
      }
      return sum;
    }
    public static void main(String [] arg){
      int a[]=new int[(new Scanner(System.in)).nextInt()];
      for(int i=0;i<a.length;i++){
          a[i]=(new Scanner(System.in)).nextInt();
      }
      System.out.println(trap(a));
      
    }
}
