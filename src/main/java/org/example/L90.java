package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class L90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(nums);
        findSubsets(nums, 0, new ArrayList(), answer);
        return answer;

    }

    public void findSubsets(int[] nums, int index, List<Integer> curr, List<List<Integer>> answer) {
        answer.add(new ArrayList(curr));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) //avoiding dups
            {
                continue;
            }
            curr.add(nums[i]);
            findSubsets(nums, i + 1, curr, answer);
            curr.remove(curr.size() - 1);

        }
    }

}