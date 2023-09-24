# Majority Element Problem

## Overview
The Majority Element problem is a common coding problem that focuses on finding an element in an array that appears more than n/2 times, where n is the length of the array. This problem is often encountered when working with arrays and data manipulation.

## Problem Statement
Given an array of integers, find the majority element. The majority element is the element that appears more than n/2 times in the array, where n is the length of the array. You may assume that the majority element always exists in the array.

## Example
### Input
Array: [3, 2, 3]

### Output
Majority Element: 3

### Explanation
In the input array, the element 3 appears twice, which is more than half of the array's length (3/2 = 1.5), so it is the majority element.

## Approach (Boyer-Moore Voting Algorithm)
To find the majority element efficiently, you can use the Boyer-Moore Voting Algorithm, which has a time complexity of O(n). Here's how it works:

1. Initialize two variables: `candidate` and `count`. Set `candidate` to the first element of the array and `count` to 1.
2. Iterate through the array from the second element to the end.
3. For each element:
   a. If the element is equal to the current `candidate`, increment `count`.
   b. If the element is different from the current `candidate`, decrement `count`.
   c. If `count` becomes zero, set the current element as the new `candidate` and reset `count` to 1.
4. After the iteration, the `candidate` variable should hold the majority element.


