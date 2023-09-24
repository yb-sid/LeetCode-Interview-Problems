# Happy Number Problem

## Overview
The Happy Number problem is a coding problem that focuses on determining whether a given positive integer is a "happy number" or not. Happy numbers are defined by a specific process involving repeated digit square sums.

## Problem Statement
A happy number is defined as follows:
1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (which is a happy number) or it loops endlessly in a cycle that does not include 1 (which is not a happy number).

Given a positive integer, determine if it is a happy number.

## Example
### Input
Input Integer: 19

### Output
Is Happy Number: True

### Explanation
Starting with 19:
- 1^2 + 9^2 = 1 + 81 = 82
- 8^2 + 2^2 = 64 + 4 = 68
- 6^2 + 8^2 = 36 + 64 = 100
- 1^2 + 0^2 + 0^2 = 1 + 0 + 0 = 1

The process ends with 1, so 19 is a happy number.

## Approach (Floyd's Cycle Detection Algorithm)
To determine if a positive integer is a happy number, you can use Floyd's Cycle Detection Algorithm. Here's how it works:

1. Initialize two pointers, `slow` and `fast`, to the input integer.
2. In each iteration, calculate the next number for `slow` by computing the sum of the squares of its digits, and calculate the next number for `fast` by doing the same operation twice.
3. If `slow` eventually reaches 1, the number is a happy number.
4. If there is a cycle (i.e., `slow` and `fast` meet without reaching 1), the number is not a happy number.


