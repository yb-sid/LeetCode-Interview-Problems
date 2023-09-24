# Palindrome Linked List Problem

## Overview
The Palindrome Linked List problem is a common coding problem that focuses on determining whether a linked list is a palindrome or not. A linked list is considered a palindrome if its elements read the same forward and backward.

## Problem Statement
Given a singly linked list, determine if it is a palindrome. A palindrome linked list is one where elements read the same when traversed from the beginning to the end and from the end to the beginning.

## Example
### Input
Linked List: 1 -> 2 -> 2 -> 1

### Output
Is Palindrome: True

### Explanation
In the input linked list, the elements read the same when traversed from left to right and from right to left, so it is a palindrome.

## Approach (Using Stack)
One approach to determine if a linked list is a palindrome is to use a stack. Here's how it works:

1. Traverse the linked list and push each element onto a stack.
2. After reaching the end of the list, pop elements from the stack while traversing the linked list again.
3. Compare the popped elements with the elements in the linked list.
4. If all elements match, the linked list is a palindrome.

## Complexity Analysis
Time Complexity: O(n), where n is the number of nodes in the linked list. We traverse the list twice: once to push elements onto the stack and once to compare them.
Space Complexity: O(n), as we use a stack to store all elements in the linked list.
This approach efficiently determines whether a linked list is a palindrome using a stack.
