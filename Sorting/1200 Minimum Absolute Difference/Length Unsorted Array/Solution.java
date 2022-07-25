int[] printUnsorted(int[] arr, int n) {
        // code here
        int left=-1;
        int right=-1;
        
  //find the index i which is greater than i+1
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                left = i;
                break;
            }
        }
        
  //find the index i from end which is lesser than i+1
        for(int i=n-1; i>0; i--){
            if(arr[i-1]>arr[i]){
                right = i;
                break;
            }
        }
  //find the max and min of this range left and right
        int max=arr[left];
        int min=arr[left];
        for(int i=left; i<=right; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
  // find element from 0 till left which is greater or equal than min and note down the index
        for(int i=0; i<left; i++){
            if(arr[i]>=min){
                left=i;
                break;
            }
        }
  // find element from right+1 till end which is lesser or equal than max and note down the index
        for(int i=right+1; i<n; i++){
            if(arr[i]<=max){
                right = i;
                break;
            }
        }
        
        return new int[]{left, right};
    }
