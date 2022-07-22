public class Solution {
    public int solve(int[] A) {
       
      /* Idea behind this if you remove any element then for right side of array of that element index gets changed(odd to even and even to odd)
         we will calculate two prefix array oddIndex and evenIndex
         Now till currrent element index is not changed but after that index is changed
         
         1. sum of even index even[i-1]         2. sum of even Index even[n-1]-even[i]
         ----------------------------------|i|----------------------------------------------
         3. sum of odd Index odd[i-1]           4. sum of odd Index odd[n-1]-odd[i]
         
         so after i index gets changed 
         
         IF 1+4==3+2
         
      */
        int evenSum[] = new int[A.length];
        int oddSum[] = new int[A.length];
        
        int n= A.length;
        
        int evenIndexSum=0;
        int oddIndexSum=0;
        
        int count = 0;
        
        for(int i=0; i<A.length; i++){
            if(i%2==0){
                evenIndexSum += A[i];
            }else{
                oddIndexSum += A[i];
            }
            evenSum[i] = evenIndexSum;
            oddSum[i] = oddIndexSum;
        }
        
        int evenSumLeft = 0;
        int evenSumRight = 0;
        int oddSumLeft = 0;
        int oddSumRight = 0;
            
        for(int i=0; i<A.length; i++){
            
            
            if(i>0){
               evenSumLeft = evenSum[i-1];
               oddSumLeft = oddSum[i-1];
            }
            evenSumRight = evenSum[n-1]-evenSum[i];
            oddSumRight = oddSum[n-1]-oddSum[i];
            
            if(evenSumLeft+oddSumRight == oddSumLeft+evenSumRight) count++;
            
        }
        
        return count;
    }
}
