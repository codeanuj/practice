class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        long max=0;
        long sum=0;
      /* calculate the sum till k element*/
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        
        max =sum;
        int j=0;
      /* start the window and slide it to find max sum*/
        for(int i=k; i<nums.length; i++){
            
            sum+=nums[i];
            sum-=nums[j];
            max = Math.max(max, sum);
            j++;
        }
        
        return max/1.0/k;
        
    }
}
