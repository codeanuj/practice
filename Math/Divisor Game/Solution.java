public class Solution {
    public int solve(int A, int B, int C) {
            long a=A;
            long b=B;
            long c=C;
            int D=findGCD(B, C);
            long lcm = (b*C)/D;

            return (int)(a/lcm);

    }

    private int findGCD(int B, int C){
        if(B>C){
            int temp=B;
            B=C;
            C=temp;
         }
        while(B>0){
            C=C%B;
            if(B>C){
            int temp=B;
            B=C;
            C=temp;
          }
        }

        return C;
    }
}
