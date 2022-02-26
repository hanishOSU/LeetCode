package com.company;

public class ConcatenationArray1929 {

    //Use two pointers simultaneously - OPTIMIZED
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length *2];

        int n = nums.length;
        for (int i=0;i<n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;

    }
}