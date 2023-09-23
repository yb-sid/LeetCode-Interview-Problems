# Merge Two Sorted List(Recursive Approach)

## Overview
The "Merge Two Sorted Lists" problem is a common coding problem that involves merging two sorted linked lists into a single sorted linked list. This problem is often encountered in the context of data structures and algorithm interviews.

## Problem Statement
Given two sorted linked lists, `l1` and `l2`, merge them into a new sorted linked list and return the merged list.

## Example
### Input
List 1: 1 -> 2 -> 4  
List 2: 1 -> 3 -> 4

### Output
Merged List: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## Recursive Approach
The recursive approach to solving this problem involves breaking down the merging task into smaller subproblems. Here's how it works:

1. Base Case: If either `l1` or `l2` is null, return the other list because there's no need to merge.

2. Compare the values of the current nodes in `l1` and `l2`.

3. Take the smaller value as the current node for the merged list and recursively call the `mergeTwoLists` function with the remaining nodes.

4. Repeat this process until one of the input lists becomes null.

5. Finally, return the merged list.