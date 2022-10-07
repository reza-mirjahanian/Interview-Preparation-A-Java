package org.example;


public class L11 {


    public int maxArea(int[] height) {
//        int maxArea = 0;
//        int start = 0;
//        int end = height.length - 1;
//        while (start < end) {
//            int area = (end - start) * Integer.min(height[start], height[end]);
//            if (area > maxArea) {
//                maxArea = area;
//            }
//
//            if (height[start] > height[end]) {
//                end--;
//            } else {
//                start++;
//            }
//        }
//        return maxArea;

        int a = 0, b = height.length - 1;
        int maxArea = 0;
        while (a < b) {
            int tempArea = Math.min(height[a], height[b]) * (b - a);
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }

            if (height[a] == height[b]) {
                int hA = height[a], tempA = a;
                while (height[tempA] <= hA && tempA < b) {
                    tempA++;
                }
                int hB = height[b], tempB = b;
                while (height[tempB] <= hB && tempB > a) {
                    tempB--;
                }
                if (tempA - a >= b - tempB) {
                    b = tempB;
                } else {
                    a = tempA;
                }
            } else if (height[a] > height[b]) {
                int hB = height[b];
                while (height[b] <= hB && b > a) {
                    b--;
                }
            } else {
                int hA = height[a];
                while (height[a] <= hA && a < b) {
                    a++;
                }
            }
        }
        return maxArea;
    }
}