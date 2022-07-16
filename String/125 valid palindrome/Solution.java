class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>=48 && c<=57){
                sb.append(c-'0');
            }else if(c>=65 && c<=90){
                sb.append(Character.toLowerCase(c));
            }else if(c>=97&& c<=122){
                sb.append(c);
            }else{
                continue;
            }
        }
        
        String str= sb.toString();
        
            if(str.equals(sb.reverse().toString())) return true;
        
        return false;
    }
}
