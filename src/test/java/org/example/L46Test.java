package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class L46Test {
    private L46 permutations = new L46();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2};
        List<List<Integer>> lists = permutations.permute(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        for (List<Integer> list : lists)
            System.out.println(list.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> lists = permutations.permute(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        for (List<Integer> list : lists)
            System.out.println(list.toString());
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1, 2, 3, 4};
        List<List<Integer>> lists = permutations.permute(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        for (List<Integer> list : lists)
            System.out.println(list.toString());
    }
}