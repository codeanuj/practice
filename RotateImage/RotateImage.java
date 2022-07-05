class Solution {
    public void rotate(int[][] matrix) {
        
      /*
       1  2  3   Transpose of this        1 4 7   reverse this matrix   7 4 1
       4  5  6  ==============>>>>>>>>    2 5 8  ===========>>>>>>>>>>  8 5 2   That's what we have done
       7  8  9                            3 6 9                         9 6 3
      */
      
        int row = 0;
        int col = 0;
                
        while(row<matrix.length){
             int var_row=row;
             int var_col=col;
            while(var_row<matrix.length && var_col<matrix.length){
                int temp = matrix[row][var_col];
                matrix[row][var_col] = matrix[var_row][col];
                matrix[var_row][col] = temp;
                var_row++;
                var_col++;                
            }
            
            row++;
            col++;
        }
        
        int left = 0; 
        int right = matrix.length-1;
        int top = 0;  
        int bottom = matrix.length-1; 
        
        
        while(top<=bottom){
            left =0;
            right = matrix.length-1;
            while(left<=right){
            int temp = matrix[top][left];
            matrix[top][left] = matrix[top][right];
            matrix[top][right] = temp;
            left++;
            right--;
        }
        top++;
      }
        
    }
}
