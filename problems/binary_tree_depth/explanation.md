# Maximum Depth of a Binary Tree Problem

## Overview
The Maximum Depth of a Binary Tree problem is a common coding problem that focuses on finding the maximum depth or height of a binary tree. The depth of a tree is defined as the number of nodes along the longest path from the root node to any leaf node.

## Problem Statement
Given a binary tree, find its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Example
### Input
Binary Tree:
             3
            / \
            9 20
           / \
          15 7

### Output
Maximum Depth: 3

### Explanation
The maximum depth of the given binary tree is 3 because the longest path from the root node (`3`) to a leaf node (`15` or `7`) contains 3 nodes.

## Approach (Recursive)
To find the maximum depth of a binary tree, you can use a recursive approach. Here's how it works:

1. Check if the current node is null (empty). If it is, return 0, as there are no nodes in the subtree.
2. Recursively find the maximum depth of the left subtree.
3. Recursively find the maximum depth of the right subtree.
4. Return the maximum of the depths of the left and right subtrees, plus 1 (to account for the current node).
