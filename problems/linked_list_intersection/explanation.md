# Intersection of Two Linked Lists Problem

## Overview
The Intersection of Two Linked Lists problem is a common coding problem that focuses on finding the node at which two linked lists intersect. In this problem, two linked lists may or may not have an intersection point. If they intersect, they share a common node.

## Problem Statement
Given two linked lists, `listA` and `listB`, find the node at which they intersect. If the two linked lists do not intersect, return `null`.

## Example
### Input
Linked List A:
1 -> 2 -> 3
|
v
6 -> 7
|
v
Linked List B:
4 -> 5

Intersection Node: 6

### Explanation
In the input linked lists, they intersect at node `6`. After that point, both lists share the same nodes.

## Approach (Two-Pointer Technique)
To find the intersection of two linked lists efficiently, you can use a two-pointer technique. Here's how it works:

1. Initialize two pointers, `ptrA` and `ptrB`, initially pointing to the heads of `listA` and `listB`, respectively.
2. Traverse both `listA` and `listB` simultaneously by advancing `ptrA` and `ptrB` one node at a time.
3. If `ptrA` reaches the end of `listA`, set it to the head of `listB` (restarting at the beginning of `listB`).
4. If `ptrB` reaches the end of `listB`, set it to the head of `listA` (restarting at the beginning of `listA`).
5. Continue this process until `ptrA` and `ptrB` meet (intersect) at the same node or reach the end of both lists (no intersection).
6. The node where `ptrA` and `ptrB` meet is the intersection point, or return `null` if they reach the end without intersecting.

## Apprach (Hashset)
Another approach is to use a HashSet.  
Store all the nodes of ListA into set.  
Traverse through ListB and check if Node exists in set. This approach is straight forward bu uses more memory.