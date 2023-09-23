# Remove Duplicates from a Sorted Array

## Overview
The "Remove Duplicates from a Sorted Array" problem is a common coding problem that involves removing duplicate elements from a sorted array in-place. The goal is to modify the array such that each unique element appears only once, and the resulting array is still sorted.

## Problem Statement
Given a sorted array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the new length of the modified array. Do not allocate extra space for another array; you must do this by modifying the input array in-place.

## Example
### Input
Sorted Array: [1, 1, 2, 2, 2, 3, 4, 4, 5]

### Output
Modified Array: [1, 2, 3, 4, 5]
New Length: 5

## Two-Pointer Approach
To solve this problem efficiently, we can use a two-pointer approach:
1. Initialize two pointers: one for the current unique element and another for iterating the array.
2. Iterate through the array, comparing the current element with the previous unique element.
3. If the current element is different from the previous unique element, update the unique element and overwrite the next position with the current element.
4.