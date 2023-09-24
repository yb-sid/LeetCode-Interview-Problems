package problems.binary_tree_depth;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = 1 + maxDepth(root.left);
        int rightDepth = 1 + maxDepth(root.right);

        return Math.max(leftDepth, rightDepth);
    }
}
