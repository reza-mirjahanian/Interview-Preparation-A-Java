package org.example;

class L122 {
    public int maxProfit(int[] prices) {
        // O(n) time | O(1) space

        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }
        return max;

    }
}