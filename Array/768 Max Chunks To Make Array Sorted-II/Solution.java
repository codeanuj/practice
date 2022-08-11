class Solution {
    public int maxChunksToSorted(int[] A) {
        
      /* Here we also use chaining technique but in different way we will calculate a right minimum array and as we iterate we will find our left max and at any point 
         leftmax is greater than or equal to right minimum i.e we found one chunk as left max can make impact till this point only.*/
      
        int rightMin[] = new int[A.length+1];
        rightMin[rightMin.length-1] =Integer.MAX_VALUE;
        for(int i=rightMin.length-2; i>=0; i--){
            rightMin[i] = Math.min(A[i],rightMin[i+1]);
        }
        
        int chunks=0;
        int leftMax =A[0];
        for(int i=0; i<A.length; i++){
            leftMax = Math.max(leftMax, A[i]);
            if(leftMax<=rightMin[i+1]) chunks++;
        }
        return chunks;
    }
}
