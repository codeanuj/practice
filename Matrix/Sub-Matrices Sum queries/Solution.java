public class Solution {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int prefixSum[][] =  new int[A.length][A[0].length];
        int mod = 1000000007;
        
        for(int i=0; i<A.length; i++){
            prefixSum[i][0] = A[i][0];
            for(int j=1; j<A[0].length; j++){
                prefixSum[i][j]=(prefixSum[i][j-1]%mod+A[i][j]%mod)%mod;
            }
        }

        for(int j=0; j<A[0].length; j++){
            for(int i=1; i<A.length; i++){
                prefixSum[i][j]= (prefixSum[i][j]%mod+prefixSum[i-1][j]%mod)%mod;
            }
        }

        int top; 
        int left;
        int bottom;
        int right;
        int[] result=new int[B.length];
        for(int i=0;i<B.length; i++){
            top = B[i]-1;
            left = C[i]-1;
            bottom = D[i]-1;
            right = E[i]-1;
            long sum = prefixSum[bottom][right];
            if((top-1)>=0) sum= ((sum%mod)-(prefixSum[top-1][right]%mod)+mod)%mod;
            if((left-1)>=0) sum= ((sum%mod) -(prefixSum[bottom][left-1]%mod)+mod)%mod;
            
            if((top-1)>=0 && (left-1)>=0) sum=((sum%mod)+ (prefixSum[top-1][left-1]%mod))%mod;
            if(sum<0) sum+=mod;
        
            result[i] = (int)sum;
        }
        return result;

    }
}
