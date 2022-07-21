class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
      /*taking it as n+1, so prefixSum[0]=0 and you do not have to add extra condition for left side as when you choose all elements from right side */
        int[] prefixSum = new int[n+1];
        int preSum=0;
        
        for(int i=0; i<n; i++){
            preSum += cardPoints[i];           
            prefixSum[i+1] = preSum;
        }
        
        int maxResult = 0;
        n=prefixSum.length;
        int l=k;
        int r=n-1;
        
        while(l>=0){
            int lSum = prefixSum[l];
            int rSum = prefixSum[n-1] - prefixSum[r];
            
            maxResult = Math.max(maxResult, lSum+rSum);
            l--;
            r--;
        }
        
        return maxResult;
  }
