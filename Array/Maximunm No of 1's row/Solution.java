class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        
        int count =0;
        int result =0;
        int row = 0;
        int temp_count;
        int col =M-1;
        
      while(row<N && col>=0){
          temp_count=count;
        while(col>=0 && Mat[row][col] ==1){
            temp_count++;
            col--;
        }
        if(temp_count>count){
               count = temp_count;
               result = row;
            }
        row++;
      } 
        
     return result;
        
    }
}
