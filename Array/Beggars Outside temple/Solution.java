public class Solution {
    public int[] solve(int A, int[][] B) {
        
        int[] beggerMoney = new int[A];
        
        for(int i=0; i<B.length; i++){
            beggerMoney[B[i][0]-1]+= B[i][2];
            if(B[i][1]<A)
                beggerMoney[B[i][1]]-= B[i][2];
        }
        int presum=0;
        for(int i=0; i<A; i++){
            presum+=beggerMoney[i];
            beggerMoney[i] = presum;
        }
		
        return beggerMoney;
    }
}
