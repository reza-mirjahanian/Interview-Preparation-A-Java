package org.example;

class L152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int max_p = Integer.MIN_VALUE;
        int p = 1;

        for (int num : nums) {
            p *= num;
            max_p = Math.max(max_p, p);
            if (num == 0)
                p = 1;

        }
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            p *= nums[i];
            max_p = Math.max(max_p, p);
            if (nums[i] == 0)
                p = 1;
        }
        return max_p;
    }
}