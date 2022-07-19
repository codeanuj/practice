class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        /* The idea is from railway clock like 21 store 9 and PM both info
           how 21%12 =9 , 21/12 =1 if 1 then PM so here also we need to store
           two value at one place */
           
        /* multiply the array with n */
       for(int i=0; i<n; i++){
           arr[i] = n*arr[i];
       }
       
       for(int i=0; i<n; i++){
           
           /*get the index */
           int indexToGo = (int) arr[i]/n;
           /*find the original value on Index*/
           int originalValue = (int) arr[indexToGo]/n;
          
           arr[i] = arr[i] + originalValue;
       }
       
       for(int i=0; i<n; i++){
           arr[i] = arr[i]%n;
       }
    }
}
