package com.company;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        //int length = num.length();
        String test = num;
        for (int l = 0; l < k; l++) {
            int length = test.length();
            int[] inputArray = convertNumtoIntArray(test);
            int currentMin = Integer.MAX_VALUE;
            for (int i = length - 1; i >= 0; i--) {
                int sum = 0;
                int mult = 1;
                for (int j = length - 1; j >= 0; j--) {
                    if (i != j) {
                        sum += (inputArray[j] * mult);
                        mult *= 10;
                    }
                }
                if (currentMin > sum) {
                    currentMin = sum;
                }
            }
            test = String.valueOf(currentMin);
        }

        return String.valueOf(test);
    }

    private int[] convertNumtoIntArray(String num){
        int length = num.length();
        int test = Integer.parseInt(num);
        int [] inputArray = new int[num.length()];
        for (int i=length-1; i >= 0; i--) {
            int remainder = test % 10;
            test = test / 10;
            inputArray[i] = remainder;
        }
        return inputArray;
    }
}
