package org.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class L1 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (index.containsKey(temp)) {
                res[0] = index.get(temp);
                res[1] = i;
                break;
            } else {
                index.put(nums[i], i);
            }
        }
        return res;
    }
}