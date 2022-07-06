class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int length = 0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            
            if(map.containsKey(sum)){
                int prev_index= map.get(sum);
                length = Math.max(length, i-prev_index);
            }else map.put(sum, i);
        }
        
        return length;
    }
}
