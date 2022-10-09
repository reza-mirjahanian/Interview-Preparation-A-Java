package org.example;

class L121 {
    public int maxProfit(int[] prices) {
        int n = prices.length; //Number of days

        int minStockPrice = Integer.MAX_VALUE; //buy at min
        int maxProfit = 0; //sell at max

        for (int price : prices) {
            minStockPrice = Math.min(minStockPrice, price); //comparing minStockPrice with everyday stock price
            maxProfit = Math.max(maxProfit, price - minStockPrice); //comparing maxProfit=everyday stockPrice - minStockPrice
        }

        return maxProfit;
    }
}