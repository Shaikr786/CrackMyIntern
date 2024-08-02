class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int maxIndex = -1;
        long maxValue = Long.MIN_VALUE;
         int minIndex = -1;
        long minValue = Long.MAX_VALUE;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] <= x && maxValue < arr[i])
            {
                maxIndex = i;
                maxValue = arr[i];
            }
            if(arr[i] >= x && minValue > arr[i])
            {
                minIndex = i;
                minValue = arr[i];
            }
            
        }
        return maxIndex;
        return minIndex;
    }
}