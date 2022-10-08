package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class L45Test {
    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        L45 jumpGameII = new L45();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(2, minJump);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 2, 4, 0, 0, 5};
        L45 jumpGameII = new L45();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(2, minJump);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0};
        L45 jumpGameII = new L45();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(0, minJump);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{1, 0};
        L45 jumpGameII = new L45();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(1, minJump);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{1, 1, 1, 1};
        L45 jumpGameII = new L45();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(3, minJump);
    }
}