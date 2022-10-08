package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length - 3; i++) {
//            if (i == 0 || nums[i] != nums[i - 1]) {
//                for (int j = i + 1; j < nums.length - 2; j++) {
//                    if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
//                        int start = j + 1, end = nums.length - 1;
//
//                        while (start < end) {
//                            long sum = (long) nums[start] + (long) nums[i] + (long) nums[j] + (long) nums[end];
//
//                            if (sum == target) {
//                                ans.add(Arrays.asList(nums[i], nums[start], nums[end], nums[j]));
//                                while (start < end && nums[start] == nums[start + 1]) start++;
//                                while (start < end && nums[end] == nums[end - 1]) end--;
//                                start++;
//                                end--;
//                            } else if (sum < target)
//                                start++;
//                            else
//                                end--;
//                        }
//                    }
//                }
//            }
//        }
//        return ans;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // If the largest possible value of 4Sum is smaller than the target, break
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;

            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                if ((long) nums[j] + nums[j + 1] + nums[j + 2] > target - nums[i]) break;

                if ((long) nums[j] + nums[n - 2] + nums[n - 1] < target - nums[i]) continue;

                int tempTarget = target - (nums[i] + nums[j]);

                int low = j + 1;
                int high = n - 1;

                while (low < high) {
                    int curSum = nums[low] + nums[high];

                    if (curSum == tempTarget) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[low]);
                        tempList.add(nums[high]);
                        result.add(tempList);
                        low++;
                        high--;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                        while (low < high && nums[high] == nums[high + 1]) high--;
                    } else if (curSum < tempTarget) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return result;
    }
}