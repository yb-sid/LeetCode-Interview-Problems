# Merge Sorted Array Problem

## Overview
The Merge Sorted Array problem is a common coding problem that focuses on merging two sorted arrays into a single sorted array. This problem is often encountered when working with arrays and data manipulation.

## Problem Statement
Given two sorted arrays, `nums1` and `nums2`, where `nums1` has enough empty space at the end to accommodate `nums2`, merge `nums2` into `nums1` as a single sorted array. The final sorted array should be stored in `nums1`.

## Example
### Input
Array 1 (`nums1`): [1, 2, 3, 0, 0, 0]
Array 2 (`nums2`): [2, 5, 6]

### Output
Merged Array (`nums1`): [1, 2, 2, 3, 5, 6]

### Explanation
We merge `nums2` into `nums1`, and the resulting merged array is sorted.

## Approach
To solve this problem efficiently, we can use a two-pointer approach starting from the end of both arrays:
1. Initialize two pointers, `p1` and `p2`, to the last elements of `nums1` and `nums2`, respectively.
2. Initialize a pointer `p` to the last empty position in `nums1`.
3. Compare the elements pointed to by `p1` and `p2`.
4. If the element at `p1` is greater than the element at `p2`, copy it to `p` in `nums1` and decrement `p1` and `p`.
5. If the element at `p2` is greater than or equal to the element at `p1`, copy it to `p` in `nums1` and decrement `p2` and `p`.
6. Repeat steps 3-5 until either `p1` or `p2` becomes less than 0.
7. Copy any pending elements from nums1 and nums2 to nums1