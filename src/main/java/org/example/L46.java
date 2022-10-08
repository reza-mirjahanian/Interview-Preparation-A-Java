package org.example;

import java.util.ArrayList;
import java.util.List;

class L46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0, nums, list);
        return list;
    }

    private void helper(int ind, int[] nums, List<List<Integer>> list) {

        if (ind == nums.length) {

            // conver the array to list
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            // add the temp list into main list
            list.add(temp);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            // swapping the element in the array
            swap(nums, ind, i);
            // solve the question in forward direction only
            helper(ind + 1, nums, list);
            // backtracking
            swap(nums, ind, i);

        }

    }

    // swap the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}