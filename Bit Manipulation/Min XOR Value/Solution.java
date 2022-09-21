public class Solution {
    public int findMinXor(int[] A) {
        //basically if you observe the problem  xor between two number is subtraction of two number
        // we need to find minimum difference of two number
        
        Arrays.sort(A);
        int result=Integer.MAX_VALUE;
        int number=0;
        
        for(int i=1; i<A.length; i++){
           
                number = A[i]^A[i-1];
                if(result>number){
                    result=number;
                }
            }
        return result;
        
    }
}
