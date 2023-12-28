public class TrappedWater{
    public static int TrappingWater(int height[]){
          //Calculate MAX left Boundary
          int leftMax[]=new int[height.length];
          leftMax[0]=height[0];

          for(int i=1;i<height.length;i++){
              leftMax[i]=Math.max(height[i], leftMax[i-1]);
          }
          //Calculate MAX right boundary
          int rightMax[]=new int[height.length];
          rightMax[height.length-1]=height[height.length-1];

          for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
          }
          //Loop
          int TrappedWater=0;
          for(int i=0;i<height.length;i++){
            //Waterlevel=Min(MAX left Boundary,MAX right boundary)
            int Waterlevel=Math.min(leftMax[i],rightMax[i]);

            //Trapped Water =Waterlevel-Height of Bar
            TrappedWater+=Waterlevel-height[i];
          }
           return TrappedWater;
    }
   
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappingWater(height));
    }
}
