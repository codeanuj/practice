class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<Integer>();
        
        int index=0;
      
      /* here the catch is you should insert all the potential candidate that can be your answer and remove those 
         which can not be your answer */
        
        for(int i=0; i<nums.length; i++){
          /* if the element in the queue are out of window throw them out of the queue */
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1)
                deque.removeFirst();
          /* If queue elements are not potential candidate */
            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
                deque.removeLast();
          /*Every candidate is a potential candidate because you don't know the further element */
            deque.addLast(i);
            if(i>=k-1)
                result[index++]=nums[deque.peekFirst()];
        }
        
        return result;
        
    }
}
