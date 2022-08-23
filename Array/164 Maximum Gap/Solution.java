class Solution {
    public int maximumGap(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        
        for(int num:nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        int interval = (int)Math.ceil((max-min+0.0)/(nums.length-1));
        
        int[] bucketMin = new int[nums.length-1];
        int[] bucketMax = new int[nums.length-1];
        
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        
        for(int i=0; i<nums.length; i++){
            
            if(max==nums[i] || min==nums[i]) continue;
            int magicIndex = (nums[i]-min)/interval;
            
            bucketMin[magicIndex] = Math.min(bucketMin[magicIndex], nums[i]);
            bucketMax[magicIndex] = Math.max(bucketMax[magicIndex], nums[i]);
        }
        
        int prev = min;
        int maxGap = 0;
        
        for(int i=0; i<bucketMin.length; i++){
            if(bucketMin[i] == Integer.MAX_VALUE || bucketMax[i] == Integer.MIN_VALUE)
                continue;
            maxGap = Math.max(maxGap, bucketMin[i]-prev);
            prev=bucketMax[i];
        }
        maxGap = Math.max(maxGap, max-prev);
        
        return maxGap;
    }
}
