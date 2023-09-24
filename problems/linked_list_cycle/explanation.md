# Linked List Cycle Problem

## Overview
The Linked List Cycle problem is a common coding problem that focuses on determining whether a linked list has a cycle or not. A cycle in a linked list occurs when a node's next pointer points to a node that is already in the list, creating a loop. Detecting cycles in linked lists is essential for preventing infinite loops and other issues.

## Problem Statement
Given a linked list, determine if it contains a cycle. A cycle in the linked list is defined by having at least one node's `next` pointer point to a node that is already in the list, creating a loop.

## Example
### Input
Linked List:
1 -> 2 -> 3 -> 4
     |         |
     |_________|


### Output
Has Cycle: True

### Explanation
In the input linked list, there is a cycle where node `4` points back to node `2`, creating a loop.

## Approach (Floyd's Tortoise and Hare Algorithm)
To detect a cycle in a linked list, you can use Floyd's Tortoise and Hare Algorithm, which uses two pointers moving at different speeds. Here's how it works:

1. Initialize two pointers, `slow` and `fast`, both initially pointing to the head of the linked list.
2. Move `slow` one step at a time (i.e., advance `slow` by one node).
3. Move `fast` two steps at a time (i.e., advance `fast` by two nodes).
4. If there is no cycle, `fast` will reach the end of the linked list, and you can return `False`.
5. If there is a cycle, `fast` will eventually catch up to `slow` within the loop, and you can return `True`.
