package org.example;


public class L33 {
    public int search(int[] nums, int target) {
        // we will apply simple binary search in it and some
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (nums[mid] == target) {
                return mid;
            }
// if the left part including the mid is sorted or not
            else if (nums[low] <= nums[mid]) {
// now we will check that our target element is in the range of the left half
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
// if left part is not sorted then we know that right part will be 100% sorted
            else {
// we will look the target in the range or not
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}