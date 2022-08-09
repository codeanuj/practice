public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
      /* The idea for this mark all index of A[i] as negative now if the number is repeating then it will make the index positive so you can find the repeated number
        Then you traverse through the array to dinf missing number and as soon as you find positive value in array which is not equal to repeating number then this index 
        will be your missing number */
        int[] result = new int[2];
        for(int i=0; i<A.length; i++){
            int abs_value = Math.abs(A[i]);
            A[abs_value-1] = -A[abs_value-1];
            if(A[abs_value-1]>0) result[0]=abs_value;
        }

        for(int i=0; i<A.length; i++){
            if(A[i]>0 && result[0] != i+1)
              result[1]=i+1;
        }

        return result;
    }
}
