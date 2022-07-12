class Solution {
    public boolean isPalindrome(String s) {
        
        String str = new String();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                char c = s.charAt(i);
                c=Character.toLowerCase(c);
                str = str+ c; 
            } 
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){               
                str = str + s.charAt(i);
            }else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                str  = str + s.charAt(i);
            }else{
                continue;
            }
        }
        int p=0;
        int q = str.length()-1;
        while(p<=q){
            if(str.charAt(p)!=str.charAt(q)) return false;
            p++;
            q--;
        }
        return true;
    }
}
