class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks =0;
        int max=0;
      /* Here we will chaining technique to resolve this as question says array element is from 0 to n-1. We will catch the max element while iterating and see till 
      when the max can make its impact if anytime max is equal to i , means that's boundry till it can make impact so we will increment the value of chunk
      because it can be of one chunk */
      
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            if(max==i) chunks++;
        }
        return chunks;
    }
}
