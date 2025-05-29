package com.adonis.grokking.leet;

public class BinarySearch {

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {-1,0,3,5,9,12};
        int target = 2;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    public static int search(int[] nums, int target, int start, int end) {
        int midpoint = 0;
        int resultIndex = -1;
        if(start+end+1 % 2 == 0) {
            midpoint = (start+end+1) / 2;     
        } else {
            midpoint = (start+end) / 2;
        }
        if(midpoint < start || midpoint > end) {
            return -1; // Base case: target not found
        }
        if(nums[midpoint] == target) {
            resultIndex = midpoint;
        } else if(nums[midpoint] < target) {
            resultIndex = search(nums, target, midpoint + 1, end);
        } else {
            resultIndex = search(nums, target, start, midpoint - 1);
        }
        return resultIndex;
    }

}
