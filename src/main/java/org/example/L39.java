package org.example;

import java.util.ArrayList;
import java.util.List;

class L39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        findcomb(0, candidates, target, out, temp);
        return out;
    }

    public void findcomb(int i, int[] arr, int target, List<List<Integer>> out, List<Integer> temp) {
        if (i == arr.length) {
            if (target == 0) {
                out.add(new ArrayList<>(temp));

            }
            return;
        }
        if (arr[i] <= target) {
            temp.add(arr[i]);
            findcomb(i, arr, target - arr[i], out, temp);
            temp.remove(temp.size() - 1);
        }
        findcomb(i + 1, arr, target, out, temp);

    }
}