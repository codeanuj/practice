class Solution {
public int singleNumber(int[] nums) {
//These two variables will store the value which is repeated ones or twice
// we are not storing the value which is repeating thrice
int ones =0;
int twos=0;

    for(int i=0; i<nums.length; i++){
	//Take xor with element of array and then take & with compliment of twos repeat the same process for twos 
        ones^=nums[i];
        ones&=(~twos);
        twos^=nums[i];
        twos&=(~ones);
    }
    return ones;
}
}
