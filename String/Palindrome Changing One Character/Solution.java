class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        int count = 0;
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                count++;
                if(count>1) return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
