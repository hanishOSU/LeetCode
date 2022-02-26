package com.company;

//Use two pointers. increment pointer1 to ptr2 and ptr2 by 1 if ptr1 value > ptr2 and update max if required
public class Stock121 {
    public int maxProfit(int[] prices) {
        int ptr1 = 0;
        int ptr2 = 1;
        int max = 0;
        while (ptr1 != prices.length && ptr2 != prices.length) {
            if (prices[ptr1] > prices[ptr2] ) {
                ptr1 = ptr2;
            } else if (prices[ptr1] < prices[ptr2]){
                if (max < (prices[ptr2] - prices[ptr1]))
                    max = prices[ptr2] - prices[ptr1];
            }
            ptr2++;
        }
        return max;
    }
}
