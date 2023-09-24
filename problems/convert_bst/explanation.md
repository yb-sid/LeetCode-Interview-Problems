# Convert Sorted Array to Binary Search Tree

## Overview
The "Convert Sorted Array to Binary Search Tree" problem is a common coding problem that involves converting a sorted array into a binary search tree (BST). This problem is often encountered when working with trees and data structures.

## Problem Statement
Given a sorted array of unique integers, create a binary search tree (BST) from the elements in the array. A BST is a binary tree where for each node:
- All nodes in its left subtree have values less than the node's value.
- All nodes in its right subtree have values greater than the node's value.
- The left and right subtrees are also BSTs.

## Approach (Recursive)
To convert a sorted array into a BST, you can use a recursive approach:

1. If the input array is empty, return `None`, as there are no elements to create nodes from.
2. Find the middle element of the array. This element will become the root of the BST.
3. Create a new tree node with the middle element as its value.
4. Recursively build the left subtree using the elements to the left of the middle element in the array.
5. Recursively build the right subtree using the elements to the right of the middle element in the array.
6. Return the root node of the BST.