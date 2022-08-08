class Solution {
    public int maxSubArray(int[] nums) {
        
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        /* The idea for the solution is when you start getting negative sum then the sum can not be added in your result so you reset the curr_sum.
           If all the numbers are negative , we are covering this while comparing max_sum and curr_sum */
      
        for(int i=0; i<nums.length; i++){
            curr_sum+=nums[i];
            max_sum=Math.max(max_sum, curr_sum);
            if(curr_sum<0) curr_sum=0;
        }
        return max_sum;
    }
}
