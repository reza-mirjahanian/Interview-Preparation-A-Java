package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;


class L40Test {
    @Test
    public void test01() {
        int[] nums = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        L40 combinationSum = new L40();
        List<List<Integer>> resultList = combinationSum.combinationSum2(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 5, 2, 1, 2};
        int target = 5;
        L40 combinationSum = new L40();
        List<List<Integer>> resultList = combinationSum.combinationSum2(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }
}