package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class L1Test {


    final int[] ARRAY_A = { 2, 7, 11, 15 };
    final int TARGET_A = 9;
    final int[] EXPECTED_A = { 0, 1 };


    final int[] ARRAY_B = { 3, 2, 4 };
    final int TARGET_B = 6;
    final int[] EXPECTED_B = { 1, 2 };


    final int[] ARRAY_C = { 3, 3 };
    final int TARGET_C = 6;
    final int[] EXPECTED_C = { 0, 1 };

    // インスタンス
    final L1 twoSum = new L1();

    @Nested
    class twoSum {
        @Test
        void EXPECTED_A() {
            assertArrayEquals(EXPECTED_A, twoSum.twoSum(ARRAY_A, TARGET_A));
        }

        @Test
        void EXPECTED_B() {
            assertArrayEquals(EXPECTED_B, twoSum.twoSum(ARRAY_B, TARGET_B));
        }

        @Test
        void EXPECTED_C() {
            assertArrayEquals(EXPECTED_C, twoSum.twoSum(ARRAY_C, TARGET_C));
        }
    }

}
