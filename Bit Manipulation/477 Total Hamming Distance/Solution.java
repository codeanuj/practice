class Solution {
    public int totalHammingDistance(int[] nums) {
        
        int C0;
        int C1;;
        int hammingDistance=0;
        /**
        * Idea is to calculate the number of set bit and unset bit on each bit position as they're contributing in hamming distance
        **/
        for(int i=0; i<32; i++){
            C0=0;
            C1=0;
            for(int j=0; j<nums.length; j++){
                if(checkSetBit(nums[j], i)) C1++;
                else C0++;
            }
            hammingDistance+=(C0*C1);
        }
        return hammingDistance;
    }
    
    private boolean checkSetBit(int num, int pos){
        if((num&(1<<pos))<1) return false;
        return true;
    }
}

Time Complexity - (n * Max bit size of data type)
