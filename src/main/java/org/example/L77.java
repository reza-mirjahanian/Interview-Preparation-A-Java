package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class L77 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> tmp = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        back(n, k, 1);
        return res;
    }

    public void back(int n, int k, int start) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i <= n - (k - tmp.size()) + 1; i++) {
            tmp.add(i);
            back(n, k, i + 1);
            tmp.removeLast();
        }
    }
}