package problems.convert_bst;

import java.util.Arrays;

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

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int n = nums.length;
        int mid_index = n / 2;
        TreeNode root = new TreeNode(nums[mid_index]);
        int[] leftSlice = Arrays.copyOfRange(nums, 0, mid_index);
        int[] rightSlice = Arrays.copyOfRange(nums, mid_index + 1, n);
        root.left = sortedArrayToBST(leftSlice);
        root.right = sortedArrayToBST(rightSlice);
        return root;
    }
}
