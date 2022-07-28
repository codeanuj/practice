class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum=0;
        int length=0;
        for(int i=0; i<N; i++){
            int num = (arr[i]==0)?-1:1;
            sum+=num;
            
            if(map.containsKey(sum)){
                length = Math.max(length, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
            
        }
        
        return length;
    }
}
