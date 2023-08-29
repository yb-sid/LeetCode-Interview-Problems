### Problem Description : 
https://leetcode.com/problems/two-sum/

**Note: assume there always is one solution 

Assume an array = `[2,7,11,15]` and `target` = 9

Code needs to return indices of two numbers that if exists should add up to target.

For above example , solution should return `[0,1]` as index of `[2,7]` which adds up to 9

# 

Elementary / Naive Solution:

As a basic approach , it is pretty straightforeword to use a nested loop to solve the problem with N<sup>2</sup>  

#

Optimized Solution:

Use a Map/Dictionary data-structure to store (value,index).

Loop through the array and check if a complement of existing number exists.

if a match is found return indices.

