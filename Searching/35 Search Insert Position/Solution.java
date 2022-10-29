class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target) return nums.length;
        
        int low = 0;
        int high = nums.length-1;
        int mid;
        int ans=0;
        while(low<=high){
            mid=low+((high-low)/2);
            if(nums[mid] == target){
                ans=mid;
                break;
            }
            else if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
