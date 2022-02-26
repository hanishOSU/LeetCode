package com.company;

public class Solution {
    public int countDigitOne(int n) {

        int quotient = 0;
        int remainder = 0;
        int result = 0;
        for (int i=1; i <=n; i++ ) {
            int number = i;
            while (number != 0)
            {
                remainder = number % 10;
                quotient = number/10;
                if (remainder == 1) {
                    result++;
                }
                number = quotient;
                System.out.println(number);
            }
        }

        return result;

    }
}