package org.example;


public class L4 {
    /*
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
     * the median of the two sorted arrays.

     * The overall run time complexity should be O(log (m+n)). nums1.length == m ;
     * nums2.length == n 0 <= m <= 1000 ; 0 <= n <= 1000 1 <= m + n <= 2000
     * #CAREFULLY! -10e6 <= nums1[i], nums2[i] <= 10e6
     *
     */


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        if (size1 < size2) return findMedianSortedArrays(nums2, nums1);    // Make sure A2 is the shorter one.

        int lo = 0, hi = size2 * 2;
        while (lo <= hi) {
            int mid2 = (lo + hi) / 2;   // Try Cut 2
            int mid1 = size1 + size2 - mid2;  // Calculate Cut 1 accordingly

            double L1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];    // Get L1, R1, L2, R2 respectively
            double L2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = (mid1 == size1 * 2) ? Integer.MAX_VALUE : nums1[(mid1) / 2];
            double R2 = (mid2 == size2 * 2) ? Integer.MAX_VALUE : nums2[(mid2) / 2];

            if (L1 > R2) lo = mid2 + 1;        // A1's lower half is too big; need to move C1 left (C2 right)
            else if (L2 > R1) hi = mid2 - 1;    // A2's lower half too big; need to move C2 left.
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;    // Otherwise, that's the right cut.
        }
        return -1;
    }
}