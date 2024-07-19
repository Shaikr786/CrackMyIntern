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