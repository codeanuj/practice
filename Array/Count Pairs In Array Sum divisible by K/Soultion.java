class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        long result =0;
        
        for(int i=0; i<n; i++){
            int remainder = arr[i]%k;
            int neededRemainder = (k-remainder);
           
            if(map.containsKey(neededRemainder)){
                result+=map.get(neededRemainder);
            } else if(remainder == 0 && map.containsKey(remainder)){
                result += map.get(0);
            }
           
            if(map.containsKey(remainder)){
                map.put(remainder, map.get(remainder)+1);
            }else{
                map.put(remainder, 1);
            }
    
        }
        
        return result;
    }
}
