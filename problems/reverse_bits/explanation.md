# Reverse Bits Problem

## Overview
The Reverse Bits problem is a common coding problem that focuses on reversing the order of bits in a 32-bit unsigned integer. In this problem, you are given an input integer, and you need to reverse its binary representation.

## Problem Statement
Given a 32-bit unsigned integer, reverse its binary representation, and return the resulting integer.

## Example
### Input
Input Integer: 43261596 (binary: 00000010100101000001111010011100)

### Output
Reversed Integer: 964176192 (binary: 00111001011110000010100101000000)

### Explanation
The binary representation of the input integer is reversed to obtain the output integer.

## Approach
To reverse the bits of a 32-bit unsigned integer, you can use the following algorithm:

1. Initialize a variable, `result`, to 0 to accumulate the reversed bits.
2. Iterate through each bit of the input integer from right to left (i.e., from the least significant bit to the most significant bit).
3. For each bit, right-shift the input integer by one position to obtain the current bit (0 or 1).
4. Left-shift the `result` by one position to make room for the current bit.
5. Set the least significant bit of `result` to the current bit.
6. Continue this process for all 32 bits.
7. The final `result` is the reversed integer.


