class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        //the process must follow the sliding window concept
        //for that i am going to add all the elements upto k level
        int sum = 0;
        int n = cardPoints.length;
        for(int i = 0 ; i < k ; i++)
        {
            sum += cardPoints[i];
        }
        //assigning this sum to window sum ---> as we found for particular required window length 'k'
        // and final max sum --> to return max sum by checking either by adding from first or last or choosing window one part from 1st and other from last
        int windowSum = sum;
        int maxSum = sum;

        //now checking for the maximum sum by tracing the remaining part of the array by adding other part and removing the window sum part to get maximum.
        //checking using for loop as we added 1st k elements now we try next elements other than k
        for(int i = 0 ; i < k ; i++)
        {
            //cardPoints[k - 1 - i]  --> removing the last element of window of 1st k elements
            //cardPoints[n - 1 -i] --> adding the last element of the array at index i from last
            windowSum = windowSum - cardPoints[k - 1 - i] + cardPoints[n - 1 -i];
            //comparing the current window sum with maximum sum obtained in every iteration and return 
            maxSum = Math.max(windowSum ,maxSum);
        }

        return maxSum;

    }
}