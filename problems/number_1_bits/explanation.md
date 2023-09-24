# Number of 1 Bits Problem

## Overview
The Number of 1 Bits problem is a common coding problem that focuses on counting the number of '1' bits in the binary representation of an unsigned integer. It's also known as the "Hamming Weight" problem.

## Problem Statement
Given an unsigned integer, return the number of '1' bits it has in its binary representation.

## Example
### Input
Input Integer: 11 (binary: 1011)

### Output
Number of '1' Bits: 3

### Explanation
The binary representation of the input integer is 1011, which contains three '1' bits.

## Approach
To count the number of '1' bits in the binary representation of an unsigned integer, you can use the following algorithm:

1. Initialize a variable, `count`, to 0 to keep track of the number of '1' bits.
2. Iterate through each bit of the input integer.
3. For each bit, check if it is '1' (by performing a bitwise AND operation with 1).
4. If the bit is '1', increment the `count` by 1.
5. Right-shift the input integer by one position to check the next bit.
6. Continue this process for all bits.
7. The final `count` is the number of '1' bits.