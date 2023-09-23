# Climbing Stairs Problem

## Overview
The Climbing Stairs problem is a classic coding problem that focuses on finding the number of distinct ways to climb a staircase with a given number of steps. This problem is often encountered when working with dynamic programming and combinatorial problems.

## Problem Statement
You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you reach the top?

## Example
### Input
Number of Steps: 4

### Output
Distinct Ways: 5

### Explanation
To climb a staircase with 4 steps, you have the following distinct ways:
1. 1 step + 1 step + 1 step + 1 step = 4 steps
2. 1 step + 2 steps + 1 step = 4 steps
3. 2 steps + 1 step + 1 step = 4 steps
4. 1 step + 1 step + 2 steps = 4 steps
5. 2 steps + 2 steps = 4 steps

So, there are 5 distinct ways to reach the top.

## Approach
To solve this problem efficiently, we can use dynamic programming using memoization.
Define a map `memo` where key is some unique value for each `n` and value is it's answer.

Recurrance relation : 

answer[key] = answer(n-1) + answer(n-2)
