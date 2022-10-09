package org.example;

import java.util.HashMap;
import java.util.Map;

class L3 {
    public int lengthOfLongestSubstring(String s) {
        int[] c = new int[128]; //To keep count of character in strings
        int[] cIndex = new int[128]; // To keep track of index of character in strings
        int startingWindow = 0;
        int currLen;
        int maxLen = 0;
        int i = 0;
        while (i < s.length()) {
            c[s.charAt(i)] += 1;
            while (c[s.charAt(i)] > 1) {
                startingWindow = Math.max(startingWindow, cIndex[s.charAt(i)] + 1);
                c[s.charAt(i)] -= 1;
            }
            cIndex[s.charAt(i)] = i;
            currLen = i - startingWindow + 1;
            maxLen = Math.max(currLen, maxLen);
            i++;
        }
        return maxLen;


    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length() <= 1) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int length = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {

//             to ensure that the current character is not within the current substring we are tracking
            if (!map.containsKey(s.charAt(i)) || i - map.get(s.charAt(i)) > length) {
                length++;
            } else {
                length = i - map.get(s.charAt(i));
            }

//             always update max because length may be modified
            max = Math.max(max, length);

//             add the current character to map for later duplicates checking or updating to the latest position
            map.put(s.charAt(i), i);
        }
        return max;


    }
}