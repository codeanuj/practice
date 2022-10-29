class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        
        int mid;
        while(low<=high){
            mid =low+((high-low)/2);
            
            if(mid>0 && nums[mid-1]==nums[mid]) mid--;
            
            if(mid%2==0) low=mid+2;
            else high=mid-1;
        }
        
        return nums[high];
    }
}
