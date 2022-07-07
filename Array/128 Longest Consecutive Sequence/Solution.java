class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        int result =1;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(set.contains(nums[i]-1)) continue;
            else{
                int temp_length=nums[i];
                while(set.contains(temp_length))
                    temp_length++;
                
                result = Math.max(result, temp_length-nums[i]);
            }
            
            
        }
        
        return result;
    }
}

// TC O(2N)
// SC O(N)
