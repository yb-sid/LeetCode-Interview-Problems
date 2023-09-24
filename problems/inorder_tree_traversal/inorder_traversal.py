from typing import Optional, List


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        order = []
        self.helper(root, order)
        return order

    def helper(self, root: Optional[TreeNode], order):
        if not root:
            return
        self.helper(root.left, order)
        order.append(root.val)
        self.helper(root.right, order)
