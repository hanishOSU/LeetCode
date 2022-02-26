package com.company;

public class ShuffleTheArray1470 {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int startIndex1 = 0;
        int startIndex2 = nums.length - n;
        for (int i = 0; i < (2 * n); i = i + 2) {
            ans[i] = nums[startIndex1++];
            ans[i+1] = nums[startIndex2++];
            //int test = i+n;
            //System.out.println(i + "===" + );
        }
        return ans;

    }
}
