package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class L36Test {

    @Test
    public void isValidSudoku1() throws Exception {
        L36 solution = new L36();
        assertTrue(solution.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        }));
    }

    @Test
    public void isValidSudoku2() throws Exception {
        L36 solution = new L36();
        assertFalse(solution.isValidSudoku(new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        }));
    }

    @Test
    public void isValidSudoku3() throws Exception {
        L36 solution = new L36();
        assertFalse(solution.isValidSudoku(new char[][]{
                {'.', '.', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '8', '.', '.', '.', '3', '.'},
                {'.', '5', '.', '.', '2', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '4', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '7'},
                {'.', '1', '.', '.', '.', '.', '.', '.', '.'},
                {'2', '4', '.', '.', '.', '.', '9', '.', '.'}
        }));
    }
}