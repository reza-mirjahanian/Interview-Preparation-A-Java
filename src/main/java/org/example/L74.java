package org.example;

class L74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int m = 0;
        int mid;
        int end = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][end] && target >= matrix[i][0]) {
                m = i;
                break;
            }

        }
        mid = (start + end) / 2;
        while (start <= end) {
            if (matrix[m][mid] == target)
                return true;
            else if (matrix[m][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }
}