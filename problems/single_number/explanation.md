# Single Number Problem

## Overview
The Single Number problem is a common coding problem that focuses on finding a unique number in an array where all other numbers appear twice. This problem is often encountered when working with arrays and bitwise operations.

## Problem Statement
Given an array of integers, every element appears twice except for one. Find that single unique number.

## Example
### Input
Array: [2, 2, 1]

### Output
Single Unique Number: 1

### Explanation
In the input array, all numbers appear twice except for 1, which appears only once. So, the single unique number is 1.

## Approach
To solve this problem efficiently, we can use the XOR operation. The XOR operation has the property that it returns 0 when applied to two identical numbers and returns the number itself when applied to 0 and any number. Therefore, if we XOR all the numbers in the array, the result will be the single unique number because the duplicate numbers will cancel each other out.

