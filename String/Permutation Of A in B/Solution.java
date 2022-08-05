public class Solution {
    public int solve(String A, String B) {
     /** The solution for this 
     first we need to think what are properties of permutaion , it will have similar length
     and it will also have similar frequency.
     **/
     int n = A.length(); 
     int m = B.length();
     int count=0;

     if(n>m) return count;

     int[] freqA = new int[26];
     int[] freqB = new int[26];

     for(int i=0; i<n; i++)
         freqA[A.charAt(i)-'a']++;
    
     for(int i=0; i<n; i++)
         freqB[B.charAt(i)-'a']++;

     count+=isSame(freqA, freqB);
     int l=1;
     int r=n;

     while(r<m){
         freqB[B.charAt(r)-'a']++;
         freqB[B.charAt(l-1)-'a']--;
         count+=isSame(freqA, freqB);
         l++;
         r++;
     }
     return count;
    }
   private int isSame(int[] freqA, int[] freqB){
       for(int i=0; i<26; i++){
           if(freqA[i]!=freqB[i]) return 0;
       }
       return 1;
   }
}
