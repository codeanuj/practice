public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
          //  map.put(A[i], map.getOrDefault(A[i], 1)+1);
            map.merge(A[i], 1, Integer::sum);
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        while(B!=0 && max>min){
            int  cmin = map.get(min);
            int  cmax = map.get(max);
         if(cmin<=cmax){
             if( cmin>B) break;
                 B-=cmin;
                 min++;
                 map.merge(min, cmin, Integer::sum);
                 
         }else{
             if(cmax>B) break;
                 B-=cmax;
                 max--;
                 map.merge(max, cmax, Integer::sum);
         }

     }
        return max-min;
    }
}



// With the frequency array
public class Solution {
    public int solve(int[] A, int B) {
        
        if(A.length==1)
          return 0;
        
        //Firstfind the max and min of array
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        
        for(int i=0; i<A.length; i++){
            max=Math.max(max, A[i]);
            min=Math.min(min, A[i]);
        }
        
        
        //calculate a frequency array
        
        int[] freq = new int[max+1];
        
        for(int i=0; i<A.length; i++){
            freq[A[i]]++;
        }
        
        //when we left with no moves or min cross the max we will stop
        while(B>0 && min<max){
            //if freq of min is less than freq of max then the answer can be changes 
            if(freq[min]<freq[max]){
                //freq[min] is bigger than B then the answer can not be changed by any mean
                if(freq[min]>B){
                    break;
                }
                //otherwise add freq[min] in min+1 and subtract freq[min] from  B update your min
                freq[min+1]+=freq[min];
                B-=freq[min];
                min++;
            }else{
                //freq[max] is bigger than B then the answer can not be changed by any mean
                if(freq[max]>B){
                    break;
                }
                  //otherwise add freq[max] in max-1 and subtract freq[max] from  B update your max
                freq[max-1]+=freq[max];
                B-=freq[max];
                max--;
            }
            
        }
        
        return max- min;
    }
}

