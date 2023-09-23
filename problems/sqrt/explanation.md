# Square Root Problem

## Overview
The Square Root problem is a classic coding problem that focuses on finding the square root of a non-negative integer. This problem is often encountered when dealing with numerical operations and mathematical calculations.

## Problem Statement
Given a non-negative integer `x`, compute and return the square root of `x`. Since the result may be a floating-point number, return it as an integer part only. In other words, return the largest integer `ans` where `ans * ans` is less than or equal to `x`.

## Example
### Input
Integer: 16

### Output
Square Root: 4

### Explanation
The square root of 16 is 4. We return the largest integer `ans` such that `ans * ans` is less than or equal to 16.

## Approach
To solve this problem, we can use various algorithms, but one of the most common methods is the binary search approach. Here's how it works:
1. Initialize two pointers, `left` and `right`, to represent the search range. Set `left` to 0 and `right` to `x`.
2. While `left` is less than or equal to `right`, do the following:
   a. Compute the middle value `mid` as `(left + right) // 2`.
   b. Check if `mid * mid` is less than `x`. If it is, update `left` to `mid + 1` because the square root is on the right side of `mid`.
   c. If `mid * mid` is greater than `x`, update `right` to `mid - 1` because the square root is on the left side of `mid`.
   d. If `mid * mid` is equal to `x`, return `mid` as the square root.
3. After the loop, return `right` as the integer part of the square root.

