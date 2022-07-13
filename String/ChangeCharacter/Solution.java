public class Solution {
    public int solve(String A, int B) {
           
           int[] freq = new int[26];

           for(int i=0; i<A.length(); i++){
               int index = A.charAt(i) - 'a';
               freq[index]++;
           }

           int initialDistinct=0;
           for(int i=0; i<freq.length; i++){
               if(freq[i]!=0) {
                   initialDistinct++;
               }
           }
           Arrays.sort(freq);
          
           for(int i=0; i<freq.length; i++){
               while(freq[i]==0) i++;
               B = B-freq[i];

               if(B<0) return initialDistinct;
               initialDistinct--;
           }

           return initialDistinct;
           
        
    }
}
