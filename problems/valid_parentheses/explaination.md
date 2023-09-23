# Valid Parentheses Problem

## Overview
The Valid Parentheses problem is a classic coding problem that checks whether a given string containing only parentheses ('(', ')'), square brackets ('[', ']'), and curly braces ('{', '}') is valid. The string is considered valid if the parentheses are closed in the correct order.

## Problem Statement
Given a string containing just the characters '(', ')', '[', ']', '{', and '}', determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

## Examples
### Example 1: Valid Input
Input: "()"  
Output: True
Explanation: The string contains a pair of valid parentheses.

### Example 2: Valid Input
Input: "()[]{}"  
Output: True
Explanation: The string contains valid combinations of parentheses, square brackets, and curly braces.

### Example 3: Invalid Input
Input: "(]"  
Output: False
Explanation: The brackets are not closed in the correct order. 

### Example 4: Invalid Input
Input: "([)]"  
Output: False
Explanation: The closing bracket ']' does not match the opening bracket '('.

## Approach
To solve this problem, we can use a stack data structure to keep track of the opening brackets. We iterate through the string:
- If we encounter an opening bracket ('(', '[', or '{'), we push it onto the stack.
- If we encounter a closing bracket (')', ']', or '}'), we check whether the stack is empty. If it is, the string is not valid because there's no matching opening bracket. If the stack is not empty, we pop the top element from the stack and compare it with the current closing bracket. If they do not match, the string is not valid.

After processing the entire string, if the stack is empty, the string is considered valid; otherwise, it's not.
