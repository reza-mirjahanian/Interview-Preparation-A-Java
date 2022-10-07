package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class L11Test {

    private L11 containerWithMostWater;

    @BeforeEach
    public void setup() {
        this.containerWithMostWater = new L11();
    }

    @Test
    public void testMaxArea0() throws Exception {
        //setup
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        //test
        int maxArea = this.containerWithMostWater.maxArea(height);

        //verify
        assertEquals(maxArea, 49);
    }

    @Test
    public void testMaxArea1() throws Exception {
        //setup
        int[] height = new int[]{0, 0};

        //test
        int maxArea = this.containerWithMostWater.maxArea(height);

        //verify
        assertEquals(maxArea, 0);
    }

    @Test
    public void testMaxArea2() throws Exception {
        //setup
        int[] height = new int[]{0, 100};

        //test
        int maxArea = this.containerWithMostWater.maxArea(height);

        //verify
        assertEquals(maxArea, 0);
    }

    @Test
    public void testMaxArea3() throws Exception {
        //setup
        int[] height = new int[]{1, 1, 1, 5, 5, 1, 1, 1, 1};

        //test
        int maxArea = this.containerWithMostWater.maxArea(height);

        //verify
        assertEquals(maxArea, 8);
    }

    @Test
    public void testMaxArea4() throws Exception {
        //setup
        int[] height = new int[]{1, 2, 2, 2, 1, 10, 10};

        //test
        int maxArea = this.containerWithMostWater.maxArea(height);

        //verify
        assertEquals(maxArea, 10);
    }
}
