public class Solution {
    public int solve(int[][] A) {
        
        //Intution is to find the number of submatrices an element can part of
        int result=0;
        int n=A.length;
        for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
              result+= (i+1)*(j+1)*(n-i)*(n-j)*A[i][j];
           }
        }
        return result;
    }
}
