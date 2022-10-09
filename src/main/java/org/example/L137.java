package org.example;

import java.util.HashMap;
import java.util.Map;

class L137 {
    public int singleNumber(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int ans = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                ans = i;
            }
        }
        return ans;
    }
}