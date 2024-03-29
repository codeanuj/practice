class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i=0;
      /**
      *here the catch is if element is not fixed to its correct position keep swapping until first if condition meets
      **/
        while(i<nums.length){
            if(nums[i]==i+1 || nums[i]<=0 || nums[i]>nums.length) i++;
            else if(nums[nums[i]-1] != nums[i]) swap(nums, nums[i]-1, i);
            else i++;
        }
         
        i=0;  
        while(i<nums.length && nums[i] == i+1) i++;
        return i+1;        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
