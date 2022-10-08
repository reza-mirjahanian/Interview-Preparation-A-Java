package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class L33Test {
    private L33 searchInRotatedSortedArray;
    

    @BeforeEach
    public void setup() {
        searchInRotatedSortedArray = new L33();
    }


    @Test
    void testSearchFound() {
        int[] nums = {8, 4, 5, 6, 7};
        assertEquals(1, searchInRotatedSortedArray.search(nums, 4));

        nums = new int[]{4, 5, 6, 7};
        assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

        nums = new int[]{4, 5, 6, 7, 1};
        assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, searchInRotatedSortedArray.search(nums, 0));

        nums = new int[]{4};
        assertEquals(0, searchInRotatedSortedArray.search(nums, 4));

        nums = new int[]{5, 1, 3};
        assertEquals(0, searchInRotatedSortedArray.search(nums, 5));

        nums = new int[]{8, 9, 2, 3, 4};
        assertEquals(1, searchInRotatedSortedArray.search(nums, 9));
    }


}