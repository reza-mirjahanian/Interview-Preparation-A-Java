package org.example;

import java.util.LinkedList;
import java.util.List;

class L22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        rec("", list, 0, 2 * n, 0);
        return list;
    }

    void rec(String s, List<String> list, int opens, int n, int ends) {
        if (s.length() == n) {
            list.add(new String(s));
            return;
        }
        if (opens < n / 2) rec(s + "(", list, opens + 1, n, ends);
        if (opens > ends) rec(s + ")", list, opens, n, ends + 1);
    }
}