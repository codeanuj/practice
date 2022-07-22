class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth=0;
        for(int i=0; i<accounts.length; i++){
           int tempWealth=0;
           for(int j=0; j<accounts[0].length; j++){
                tempWealth += accounts[i][j];
            }
         maxWealth = Math.max(maxWealth, tempWealth);
        }
        return maxWealth;
        
    }
}
