package com.company;

public class MaximumSubarray53 {
    //O(n3)
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int k=0; k < nums.length; k++) {
            for (int i=k; i < nums.length; i++) {
                int sum = 0;
                for (int j=k; j <= i; j++) {
                    sum += nums[j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
           }
        }
        return maxSum;
    }
    //O(n2)
    public int maxSubArrayOpt(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j=i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
