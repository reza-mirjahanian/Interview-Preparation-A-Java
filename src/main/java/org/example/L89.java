package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class L89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0));
        for (int i = 0; i < n; ++i) {
            List<Integer> res1 = result;
            List<Integer> res2 = new ArrayList<>(res1);
            Collections.reverse(res2);
            // prepend "1"
            int prependVal = (1 << i);
            for (int j = 0; j < res2.size(); ++j) {
                res2.set(j, res2.get(j) + prependVal);
            }
            res1.addAll(res2);
        }
        return result;
    }
}