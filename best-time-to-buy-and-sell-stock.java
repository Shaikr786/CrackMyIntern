class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE ;
        int profit = 0 ;
        int overall = 0 ;. 
        for(int i = 0 ; i < prices.length ; i++){
           
                min = prices[i] ;
            }
            profit = prices[i] - min ;
            if(overall < profit){

                overall = profit ;
            }

        }return overall ;
    }
}

// another approach of using dp

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int min = prices[0] ;
        int cost = 0, maxProfit = 0;
        for(int i = 0 ; i < n ; i++)
        {
            cost = prices[i] - min;
            maxProfit = Math.max(maxProfit ,cost);
            //dp - remembering the past
            min = Math.min(prices[i] ,min);
        }
        return maxProfit;
    }
}