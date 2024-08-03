import java.util.* ;
import java.io.*;



public class Solution {
    public static int frogJump(int n, int heights[]) {

       //recursive solution 
        return minJumps(n-1 ,heights);
    }

    public static int minJumps(int index ,int heights[])
    {
        if(index == 0)
        {
            return 0;
        }

        int left = minJumps(index -1 , heights) + Math.abs(heights[index] - heights[index -1]);

        int right = Integer.MAX_VALUE;
        if(index > 1)
        {
            right = minJumps(index -2 ,heights) + Math.abs(heights[index] - heights[index -2]);
        }
        
        return left > right ? right : left;
    }

}


//using dynamic programming


import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..

        int[] dp = new int[n +1];
        for(int i = 0 ; i < n ; i++)
        {
            dp[i] = -1;
        }
        return minJumps(n-1 ,heights ,dp);
    }

    public static int minJumps(int index ,int heights[] , int[] dp)
    {
        if(index == 0)
        {
            return 0;
        }

        if(dp[index] != -1)
        {
            return dp[index];
        }

        int left = minJumps(index -1 , heights ,dp) + Math.abs(heights[index] - heights[index -1]);

        int right = Integer.MAX_VALUE;
        if(index > 1)
        {
            right = minJumps(index -2 ,heights ,dp) + Math.abs(heights[index] - heights[index -2]);
        }

        dp[index]=(left > right) ? right : left;
        
        return dp[index];
    }
}

//tabulation method

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..

        int[] dp = new int[n +1];

        dp[0] = 0;
        for(int i = 1 ; i < n ; i++)
        {
            int first = dp[i -1] + Math.abs(heights[i] - heights[i -1]);

            int second = Integer.MAX_VALUE;
            if(i > 1)
            {
                second = dp[i -2] + Math.abs(heights[i] - heights[i -2]);
            }
            dp[i] = Math.min(first ,second);
        }

        return dp[n -1];

        
    }
}

//space optimizaiton

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..

        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1 ; i < n ; i++)
        {
            int first = prev1 + Math.abs(heights[i] - heights[i -1]);

            int second = Integer.MAX_VALUE;
            if(i > 1)
            {
                second = prev2 + Math.abs(heights[i] - heights[i -2]);
            }
            int current = Math.min(first ,second);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;

        
    }
}