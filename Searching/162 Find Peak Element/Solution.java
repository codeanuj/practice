class Solution {
    public int findPeakElement(int[] nums) {
      //To check if the length is 1
        if(nums.length==1) return 0;
        int n=nums.length;
      //If 1st element and last element are greater than their respective elements(edge case)
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
         
        int low=1;
        int high=n-2;
        int mid;
        
        while(low<=high){
            mid = low+((high-low)/2);
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]<nums[mid-1]) high =mid-1;
            else if(nums[mid]<nums[mid+1]) low=mid+1;
        }
        return -1;
    }
}
