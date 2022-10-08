package org.example;

//    public void nextPermutation(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//
//        int max = nums[nums.length - 1];
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (nums[i] >= max) {
//                max = nums[i];
//            } else {
//                Arrays.sort(nums, i + 1, nums.length);
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] < nums[j]) {
//                        exchange(nums, i, j);
//                        return;
//                    }
//                }
//            }
//        }
//        Arrays.sort(nums);
//    }
//
//    private void exchange(int[] nums, int i, int j) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;

//    }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L31 {
    private void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length < 2) {
            return;
        }
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

}