class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        //Find xor of all number which contains xor of these two numbers
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        //find the first position where bit is set in this xor as set bit represent two different bit for xor
        int pos=0;
        for(int i=0; i<32; i++){
            if((xor &(1<<i)) >=1){
                pos=i;
                break;
            }
        }
        //take the element of array and find which bit is set and unset to get the number
        int num1=0;
        int num2=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]&(1<<pos)) >=1){
                num1^=nums[i];              
            }else{
                num2^=nums[i];
            }
        }
        
        return new int[]{num1, num2};
    }
}
