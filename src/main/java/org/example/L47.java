package org.example;

import java.util.ArrayList;
import java.util.List;

class L47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Permutation(result, nums, 0);
        return result;
    }

    public void Permutation(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length)
            result.add(toList(nums));
        for (int i = start; i < nums.length; i++) {
            if (i != start && !Permutate(start, i, nums)) continue;

            swap(i, start, nums);
            Permutation(result, nums, start + 1);
            swap(i, start, nums);
        }
    }

    public List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums)
            res.add(i);
        return res;
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public boolean Permutate(int start, int j, int[] nums) {
        for (int i = start; i < j; i++)
            if (nums[i] == nums[j])
                return false;
        return true;
    }

}