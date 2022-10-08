package org.example;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L16 {

    public int threeSumClosest(int[] nums, int target) {

//        int maxSum = Integer.MIN_VALUE;
//        Arrays.sort(nums);
//        int sum = 0;
//        int minDiff = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length - 2; i++) {
//            int l = i + 1;
//            int r = nums.length - 1;
//            while (l < r) {
//                sum = nums[i] + nums[l] + nums[r];
//                int diff = Math.abs(sum - target);
//                if (diff == 0)
//                    return sum;
//                else if (diff < minDiff) {
//                    maxSum = sum;
//                    minDiff = diff;
//                }
//                if (sum < target) {
//                    l++;
//                } else if (sum > target)
//                    r--;
//            }
//        }
//        return maxSum;

        int n = nums.length;
        int res = 0;
        int m = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            if (nums[i] * 3 >= target) {
                int s = nums[i] + nums[i + 1] + nums[i + 2];
                if (s - target < m) {
                    return s;
                }
                break;
            }
            int t = nums[i] + nums[n - 1] + nums[n - 2];
            if (t == target) {
                return t;
            }
            if (t < target) {
                if (t - target < m) {
                    m = target - t;
                    res = t;
                }
                continue;
            }
            int a = i + 1;
            int b = n - 1;
            while (a < b) {
                t = nums[i] + nums[a] + nums[b];
                if (t == target) {
                    return t;
                }
                if (Math.abs(t - target) < m) {
                    res = t;
                    m = Math.abs(t - target);
                }
                if (t > target) {
                    b--;
                } else {
                    a++;
                }
            }
        }
        return res;

    }
}