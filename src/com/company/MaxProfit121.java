package com.company;

public class MaxProfit121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i=0; i < prices.length - 1; i++) {
            for (int j=i+1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    if (maxProfit < prices[j] - prices[i]) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
        }
        return maxProfit;
    }
}
