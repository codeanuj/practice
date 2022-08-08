class Solution {
    public int trap(int[] height) {
      
      /* The idea nd observation for this problem is-
         if you are on any building, you see the leftmax of the building and rightmax of the building, The minimum of these two will be the water trapped on
         building ground and you want to find it on building roof then subtract the building height. So first solution you can calculate leftmax array and rightmax
         array, and on any index or building check the leftmax and rightmax find the minimum and subtract from height add it in ans.
      */
      
      /* One more observation is if you find the tallest building of all then if you are moving from left till tallest building the all the buildings are in less 
      height then this tallest building so as you move left the rightmax is tallest building to calculate leftmax on the go you take one variable and calculate the leftmax
      and subtract it from height and same can be done when you start from end the tallest builing will be the leftmax from right so calculate the same
      */
      
        int ans=0;
        int tallestBuilding=0;
        int max=height[0];
        int tallestBuildingIndex=0;
        
        for(int i=0; i<height.length; i++){
            if(tallestBuilding<height[i]){
                tallestBuilding=height[i];
                tallestBuildingIndex=i;
            }
        }
        
        for(int i=0; i<tallestBuildingIndex; i++){
            max = Math.max(max,height[i]);
            ans+=(max-height[i]);
        }
        max = height[height.length-1];
        for(int i=height.length-1; i>tallestBuildingIndex; i--){
            max = Math.max(max,height[i]);
            ans+=(max-height[i]);
        }
        
        return ans;
    }
}
