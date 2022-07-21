public class Solution {
    public int solve(int[] A) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int posMax = -1;
        int posMin = -1;
        int result = A.length;

        for(int num:A){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
       
        for(int i=0; i<A.length; i++){

            if(max == A[i])
              posMax = i;
            
            if(min == A[i])
              posMin = i;

            if(posMax != -1 && posMin != -1)
               result = Math.min(result, Math.abs(posMax-posMin)+1);
        }

        return result;
    }
}
