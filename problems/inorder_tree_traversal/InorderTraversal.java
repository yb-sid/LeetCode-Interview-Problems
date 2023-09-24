package problems.inorder_tree_traversal;

import java.util.List;
import java.util.ArrayList;

class TreeNode {
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

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        // inorder : left , root , right
        List<Integer> order = new ArrayList<>();
        helper(root, order);
        return order;

    }

    private void helper(TreeNode root, List<Integer> order) {
        if (root == null)
            return;
        helper(root.left, order);
        order.add(root.val);
        helper(root.right, order);
    }
}
