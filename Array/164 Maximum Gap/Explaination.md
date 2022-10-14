Basically we will apply pigeon hole principle here , the priciple says that you need to fit n pigeon in n-1 holes. 
here first we will find avg gap that is possible between elements, so gap=max-min/(n-1), if n=4 then there is 3 bucket.

Now next thing we will create the hole(bucket) n-1 bucket.
We will apply normalization to find the index in bucket for element with respect to min. 
   index=nums[i]-min/gap;
   
   then we will just compare the buckets and find the answers.
