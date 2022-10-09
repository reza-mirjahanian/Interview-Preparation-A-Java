package org.example;

class L7 {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -1 * x;
        }
        long reverseNum = 0;
        while (x >= 1) {
            int lastdigit = x % 10;
            reverseNum = (reverseNum * 10) + lastdigit;
            x = x / 10;
        }
        if (reverseNum > Integer.MAX_VALUE) { //edge case
            return 0;
        }
        if (isNegative) {
            reverseNum = -1 * reverseNum;
        }
        return (int) reverseNum;
    }
}