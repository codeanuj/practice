class Solution{
    static int trailingZeroes(int N){
        //
        int powerOf5 = 5;
        int result=0;
        while(powerOf5<=N){
            result+=N/powerOf5;
            powerOf5*=5;
        }
        return result;
    }
}
