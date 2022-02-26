package com.company;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 1;
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
        }

        for (int i=0; i < nums.length; i++) {
            int secondElement = target - nums[i];
            if (map.containsKey(secondElement) && map.get(secondElement) != i) {
                result[0] = i;
                result[1] = map.get(secondElement);
                return result;
            }
        }
        return new int[0];
    }
}
