package org.example;


import java.util.HashSet;
import java.util.Set;

public class L36 {

    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        // Traverse all the elements of all the boxes through loops...
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                // For filled cells only...
                if (board[i][j] == '.')
                    continue;
                final char ch = board[i][j];
                // Check each row, column & 3x3 box...
                if (!set.add(ch + "@row" + i) || !set.add(ch + "@col" + j) || !set.add(ch + "@box" + i / 3 + j / 3))
                    return false;
            }
        return true;
    }
}

//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        if (board == null || board.length != 9 || board[0].length != 9) {
//            throw new IllegalArgumentException("Input is invalid");
//        }
//
//        int rowColBox = 0;
//
//        for (int i = 0; i < 9; i++) { // Index of row, column and box
//            for (int j = 0; j < 9; j++) {
//                // Check ith row
//                rowColBox = validateAndAddCell(board[i][j], 0, rowColBox);
//                if (rowColBox == -1) {
//                    return false;
//                }
//
//                // Check ith column
//                rowColBox = validateAndAddCell(board[j][i], 1, rowColBox);
//                if (rowColBox == -1) {
//                    return false;
//                }
//
//                // Check ith box
//                int boxRow = 3 * (i / 3) + (j / 3);
//                int colRow = 3 * (i % 3) + (j % 3);
//                rowColBox = validateAndAddCell(board[boxRow][colRow], 2, rowColBox);
//                if (rowColBox == -1) {
//                    return false;
//                }
//            }
//            rowColBox = 0;
//        }
//
//        return true;
//    }
//
//    private int validateAndAddCell(char c, int type, int rowColBox) {
//        if (c == '.') {
//            return rowColBox;
//        }
//        if (c < '1' || c > '9') {
//            return -1;
//        }
//
//        int bitIdx = type * 9 + (c - '1');
//        if (((rowColBox >> bitIdx) & 1) == 1) {
//            return -1;
//        }
//
//        return rowColBox | (1 << bitIdx);
//    }
//}