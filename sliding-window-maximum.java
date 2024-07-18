class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length; //length of the array
        int[] result = new int[n-k+1]; //result array of length -> no of subarrays always will be n-k
        int r = 0;//index for the new array
        //for storing the elements in decreasing fasion we r using deque ds
        Deque<Integer> q = new ArrayDeque<>(); 
        for(int i = 0 ; i < n ; i++)
        {
            //if the q is not empty and checking for the window out of bound
            if(!q.isEmpty() && q.peek() == i - k)
            {
                q.poll();
            }
            //removing el from  q if the curr el is > than the prev one 
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i])
            {
                q.pollLast();
            }
           
            q.offer(i);//this should be added & this is ok at first index i.e when q is empty

            if(i >= k - 1)// if we got the window size then place the max element in result array.
            {
                result[r++] = nums[q.peek()];
            }
        
        } 
        return result;
    }
}