class Solution {
    static int maxValue(int[] arr, int N) {
        // code here
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
      /*|Ai-Aj|+|i-j| we are assuming that i is always greater than j
      so |Ai-Aj|+i-j
      if Ai>Aj -> (Ai+i)-(Aj+j)
      if Aj>Ai -> (Aj-j)-(Ai-i)
      */
        for(int i=0; i<N; i++){
            int valueWithIndex = arr[i]+i;
            
            max1 = Math.max(max1, valueWithIndex);
            min1 = Math.min(min1, valueWithIndex);
        }
        
        int maxWithAdd = max1-min1;
         for(int i=0; i<N; i++){
            int valueWithIndex = arr[i]-i;
            
            max2 = Math.max(max2, valueWithIndex);
            min2 = Math.min(min2, valueWithIndex);
        }
        int maxWithSub = max2-min2;
        
        return Math.max(maxWithAdd, maxWithSub);
    }
};
