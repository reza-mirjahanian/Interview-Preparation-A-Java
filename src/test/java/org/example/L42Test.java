package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class L42Test {
    @Test
    public void test01() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(6, trap);
    }

    @Test
    public void test02() {
        int[] height = new int[]{0, 0, 0};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(0, trap);
    }

    @Test
    public void test03() {
        int[] height = new int[]{2, 0, 0, 4};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(4, trap);
    }

    @Test
    public void test04() {
        int[] height = new int[]{5, 4, 1, 2};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(1, trap);
    }

    @Test
    public void test05() {
        int[] height = new int[]{5, 2, 1, 2, 1, 5};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(14, trap);
    }

    @Test
    public void test06() {
        int[] height = new int[]{4, 2, 0, 3, 2, 5};
        L42 trappingRainWater = new L42();
        int trap = trappingRainWater.trap(height);
        Assertions.assertEquals(9, trap);
    }
}