class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int xor1 =0;
        
        for(int i=1;i<=n; i++){
            xor1^=i;
        }
        
        int xor2 =0;
        for(int i=0; i<array.length; i++){
            xor2^=array[i];
        }
        
        return xor1^xor2;
        
    }
}
