public class Solution {
    public int solve(int[][] A, int B) {
        
        int n = A.length, m = A[0].length;
        long d[] = new long[n*m];
        int mod = A[0][0] % B;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(A[i][j] % B != mod) {
                    return -1;
                }   d[i*m + j] = A[i][j];
            }
        }
        Arrays.sort(d);
        int mid = (n * m) >> 1;
        long ans = 0;
        for(long x : d) ans += Math.abs(x - d[mid]);
        if(n*m % 2 == 0) {
            mid--;
            long ans2 = 0;
            for(long x : d) ans2 += Math.abs(x - d[mid]);
            ans = Math.min(ans, ans2);
        }
        return (int)ans/B;
    }
}
