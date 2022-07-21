class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int leftSum =0;
        int rightSum =0;
        int max =0;
        int n = cardPoints.length;
        
        for(int i=0; i<k; i++){
            leftSum += cardPoints[i];
        }
        
        max = leftSum;
        
        for(int i=0; i<k; i++){
            leftSum -= cardPoints[k-1-i];
            rightSum += cardPoints[n-1-i];
            
            max = Math.max(max, leftSum+rightSum);
        }
        
        return max;
    }
}

//SC O(1)
