class Solution {
    public int sumSubseqWidths(int[] nums) {
        
      /**
      * The catch here is sort the array and find out how many times this can be max and min in subsequence
      **/
        Arrays.sort(nums);        
        long[] pow = new long[nums.length];
        pow[0] =1;
        int MOD = 1000000007;
        for(int i=1; i<nums.length; i++){
            pow[i] =(pow[i-1]*2)%MOD;
        }
        
        long answer =0;
        for(int i=0; i<nums.length; i++){
            long maxTime = pow[i];
            long minTime = pow[nums.length-i-1];
            
            long diff = maxTime-minTime;
            answer = (answer%MOD  + (nums[i]*diff)%MOD)%MOD;
        }
        return (int)answer%MOD;
    }
}
