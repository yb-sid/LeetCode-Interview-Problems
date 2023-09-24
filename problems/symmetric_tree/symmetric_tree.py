from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        return self.isSymmetricHelper(root.left, root.right)

    def isSymmetricHelper(
        self, one: Optional[TreeNode], two: Optional[TreeNode]
    ) -> bool:
        if not one or not two:
            return one == two

        return (
            one.val == two.val
            and self.isSymmetricHelper(one.left, two.right)
            and self.isSymmetricHelper(one.right, two.left)
        )
