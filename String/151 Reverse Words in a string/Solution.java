class Solution {
    public String reverseWords(String s) {
        
        String result = new String();
        
        int i=0;
        int j=0;
        int n=s.length();
        while(i<n){
            /* Ignore Spaces */
            while(i<n && s.charAt(i) == ' ') i++;
            if(i>=n) break;
            j=i+1;
            /*Get the word*/
            while(j<n && s.charAt(j) != ' ') j++;
            String sub = s.substring(i, j);
            i=j+1;
            if(result.length() == 0) result = sub;
            else result = sub + " " + result;
        }
        
        return result;
    }
}
