# Move Zeroes Problem

## Overview
The Move Zeroes problem is a common coding problem that focuses on rearranging the elements in an array such that all the zeros are moved to the end of the array while preserving the relative order of the non-zero elements.

## Problem Statement
Given an array of integers, rearrange the elements such that all the zeros are moved to the end of the array, and the relative order of the non-zero elements remains the same.

## Example
### Input
Array: [0, 1, 0, 3, 12]

### Output
Modified Array: [1, 3, 12, 0, 0]

### Explanation
In the input array, the zeros are moved to the end while preserving the order of the non-zero elements.

## Approach (Two-Pointer Technique)
One approach to solving the Move Zeroes problem is to use a two-pointer technique. Here's how it works:

1. Initialize two pointers, `left` and `right`, both initially pointing to the beginning of the array.
2. Traverse the array with the `right` pointer. When you encounter a non-zero element, swap it with the element pointed to by the `left` pointer.
3. Increment both `left` and `right` pointers.
4. Continue this process until the `right` pointer reaches the end of the array. At this point, all the non-zero elements are in the correct positions, and all the zeros are at the end.

## Complexity Analysis
Time Complexity: O(n), where n is the number of elements in the array. We traverse the array once.
Space Complexity: O(1), as we use only a constant amount of extra space.
This approach efficiently moves all the zeros to the end of the array while preserving the order of the non-zero elements.
