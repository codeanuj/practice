class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<Integer>();

        if(p.length()>s.length()) return list;
        
        int[] freqP=new int[26];
        int[] freqS=new int[26];
        
        for(int i=0; i<p.length(); i++)
            freqP[p.charAt(i)-'a']++;
        int l=0;
        int r=0;
        
        while(r<s.length()){
            freqS[s.charAt(r)-'a']++;
            if(r-l+1==p.length()){
                if(isAnagramFound(freqS, freqP)) list.add(l);
                freqS[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return list;
    }
    private boolean isAnagramFound(int[] freqS, int[] freqP){
        for(int i=0; i<26; i++){
            if(freqS[i]!=freqP[i]) return false;
        }
        return true;
    }
}
