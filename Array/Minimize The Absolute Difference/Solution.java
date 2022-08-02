public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        
        int i=0;
        int j=0;
        int k=0;
        int result = Integer.MAX_VALUE;
        
        while(i<A.length && j<B.length && k<C.length){
            int max = Math.max(Math.max(A[i], B[j]), C[k]); 
            int min = Math.min(Math.min(A[i], B[j]), C[k]);
            
            result = Math.min(result, Math.abs(max-min));
            int max_term = Math.max(Math.max(A[i], B[j]), C[k]);
            if(A[i]==max_term) i++;
            else if(B[j]==max_term) j++;
            else k++;
        }        
        return result;
    }
}
