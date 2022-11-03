class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
        int mid;
        //Try to make this matrix as sorted array the formula will give us the index number
        while(low<=high){
            mid = low +((high-low)/2);
            int num = matrix[mid/col][mid%col];
            if(num==target) return true;
            else if(num>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
