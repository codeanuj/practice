public class Solution {
    public int solve(int[] A) {
        
        Arrays.sort(A);
        
        int min=Integer.MAX_VALUE;
        for(int i=0; i<A.length-1; i++)
        {
            int diff = A[i+1] - A[i];
            
            if(min>diff)
               min= diff;
        }
        return Math.abs(min);
    }
}
