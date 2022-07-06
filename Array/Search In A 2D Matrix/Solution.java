class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int top = 0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        
        int i=bottom;
        int j=left;
        /* Always start from bottom left or top right this way you will get one direction only*/
        if(matrix[0][0] >target || matrix[bottom][right]<target) return false;
        
        while(i>=top && i<=bottom && j>=left && j<=right){
            
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) i--;
            else j++;
        }
        
        
        return false;
    }
}
