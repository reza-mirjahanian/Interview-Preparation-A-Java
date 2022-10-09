package org.example;

import java.util.HashSet;
import java.util.Set;


class L653 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean found = false;

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();

        this.dfs(root, set, k);

        return this.found;
    }

    private void dfs(TreeNode node, Set<Integer> set, int k) {
        if (node == null || this.found)
            return;

        if (set.contains(node.val)) {
            this.found = true;
            return;
        }

        set.add(k - node.val);

        this.dfs(node.left, set, k);
        this.dfs(node.right, set, k);
    }
}