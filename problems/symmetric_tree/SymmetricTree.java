package problems.symmetric_tree;

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

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode one, TreeNode two) {
        if (one == null || two == null)
            return one == two;

        return one.val == two.val && helper(one.left, two.right) && helper(one.right, two.left);
    }
}
