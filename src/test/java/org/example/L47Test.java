package org.example;


import org.junit.jupiter.api.Test;

import java.util.List;

class L47Test {
    private L47 permutationsII = new L47();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> results = permutationsII.permuteUnique(nums);
        for (List<Integer> result : results)
            System.out.println(result.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 1, 2, 1};
        List<List<Integer>> results = permutationsII.permuteUnique(nums);
        for (List<Integer> result : results)
            System.out.println(result.toString());
    }
}