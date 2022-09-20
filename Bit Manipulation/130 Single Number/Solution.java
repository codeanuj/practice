class Solution {
    public int singleNumber(int[] nums) {
      /**
      * As every number is repeating twice accept one number so we will take xor as all the number will cancel out
      **/
        int xor=nums[0];
        for(int i=1; i<nums.length; i++)
            xor^=nums[i];
        return xor;
    }
}
