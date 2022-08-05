class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        
        boolean result=false;
        if(n>m) return result;
        /** calculate the frequency of s1 and then do sliding window on s2 with frequency array of B*/
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        
        for(int i=0; i<n; i++)
            freqS1[s1.charAt(i)-'a']++;
        
        int l=0;
        int r=0;
        
        
        while(r<m){
            freqS2[s2.charAt(r)-'a']++;
            
            if(r-l+1>=n){
                result=isFound(freqS1, freqS2);
                if(result) return result;
                freqS2[s2.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        
        return result;      
    }
    
    private boolean isFound(int[] freqS1, int[] freqS2){
        for(int i=0; i<26; i++){
            if(freqS1[i]!=freqS2[i]) return false;
        }
        return true;
    }
}
