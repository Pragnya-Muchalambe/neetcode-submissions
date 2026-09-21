class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0], maxProfit =0;
        int profit =0;

        for(int i=0;i<prices.length;i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            profit = prices[i]-minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
