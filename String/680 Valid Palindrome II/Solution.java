class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
              /* || condition introduce as we need to delete either ith char or jth char so if deleleting anyone string is palindrome that's okay*/
              return checkPalindrome(s, i+1, j) || checkPalindrome(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean checkPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
