# Symmetric Tree Problem

## Overview
The Symmetric Tree problem is a common coding problem that focuses on determining whether a binary tree is symmetric, meaning it is a mirror image of itself when you flip it. This problem is often encountered when working with binary trees and tree traversal.

## Problem Statement
Given a binary tree, determine if it is symmetric around its center. In other words, check if the left subtree is a mirror image of the right subtree.

## Example
### Input
Binary Tree:

     1
    / \
   2   2
  / \  /\
 3  4 4  3

 ### Output
Is Symmetric: True

### Explanation
The binary tree is symmetric because its left subtree (2, 3, 4) is a mirror image of its right subtree (2, 4, 3).

## Approach (Recursive)
To determine if a binary tree is symmetric, you can use a recursive approach. Here's how it works:

1. Check if the root is null (empty). If it is, return `True` because an empty tree is symmetric.
2. Create a helper function that takes two nodes as arguments (one from the left subtree and one from the right subtree).
3. In the helper function:
   a. If both nodes are null, return `True` because they match.
   b. If one of the nodes is null but the other is not, return `False` because they don't match.
   c. Compare the values of the two nodes. If they are not equal, return `False` because they don't match.
   d. Recursively call the helper function on the left subtree's left and the right subtree's right nodes, and on the left subtree's right and the right subtree's left nodes.
4. Return the result of the helper function when called on the root's left and right nodes.
