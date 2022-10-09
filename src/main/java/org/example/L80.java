package org.example;

class L80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (i < 2 || nums[j] > nums[i - 2]) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        return i;
    }

}