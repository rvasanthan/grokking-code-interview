package com.adonis.grokking.leet;

import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        System.out.println("Hello Two summer");
        int[] nums = {3,2,4};
        int target = 6;
        findTwoSum(target, nums);
    }

    public static void findTwoSum(int target, int[] nums) {
        int[] twoSum = {0, 0};
        HashMap<Integer, Integer> onePass = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(onePass.containsKey(nums[i])) {
                twoSum[0] = onePass.get(nums[i]);
                twoSum[1] = i;cd 
            } else {
                onePass.put(target-nums[i], i);
            }
        }
        System.out.println("["+twoSum[0]+","+ twoSum[1]+"]");
    }
}