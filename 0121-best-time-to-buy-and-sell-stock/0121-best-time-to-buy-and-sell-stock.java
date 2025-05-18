class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0 ;
        int max = 0 ;
        for(int i : prices)
        {
            min = Math.min(min, i);
            profit = i - min;
            max = Math.max(max,profit);
        }

return max;


        // int min = prices[0];
        // int profit = 0;
        // int max = 0;

        // for(int i : prices)
        // {
        //     min = Math.min(min, i);
        //     profit = i - min;
        //     max = Math.max(max, profit);
        // }

        // return max;
    }
}