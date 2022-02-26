package com.company;

public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int ptr1 = 0;
        int ptr2 = 1;
        int result [] = new int[2];
        while (ptr1 < numbers.length-1 && ptr2 < numbers.length) {
            int searchValue = target - numbers[ptr1];
            for (int j= ptr2; j < numbers.length; j++) {
                if (searchValue == numbers[j]) {
                    result[0] = ++ptr1;
                    result[1] = ++j;
                    return result;
                } else if (numbers[j] > searchValue){
                    //ptr1++;
                    //ptr2++;
                    break;
                }
                //ptr2++;
            }
            ptr1++;
            ptr2++;
        }
        return result;
    }
}
