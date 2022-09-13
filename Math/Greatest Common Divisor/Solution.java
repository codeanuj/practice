public class Solution {
    public int gcd(int A, int B) {
        if(A>B){
            int temp=B;
            B=A;
            A=temp;
        }
        while(A>0){
            B=B%A;
            if(A>B){
            int temp=B;
            B=A;
            A=temp;
         }
        }
        return B;
    }

    private void swap(int A, int B){
        if(A>B){
            int temp=B;
            B=A;
            A=temp;
        }
    }
}
