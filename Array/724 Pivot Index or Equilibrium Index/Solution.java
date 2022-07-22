class Solution {
    public int pivotIndex(int[] nums) {
        
      /* idea is simple get the sum of whole array
         calculate leftSum as you travel in array 
         subtract cuur_element from sum this will be your rightSum compare
         leftSum and rightSum if equal then return otherwise add curr_element 
         to leftSum */
        int sum=0;
        int leftSum=0;
        
        for(int num:nums)
            sum+=num;
        
        for(int i=0; i<nums.length; i++){
            sum-=nums[i];
            if(sum == leftSum) return i;
            
            leftSum+=nums[i];
        }
        
        return -1;
            
    }
}
