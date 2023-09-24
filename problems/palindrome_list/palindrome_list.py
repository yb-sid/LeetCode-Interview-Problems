from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return True

        stack = []
        curr = head
        while curr is not None:
            stack.append(curr)
            curr = curr.next

        curr = head
        while stack:
            last = stack.pop()
            if curr.val != last.val:
                return False
            curr = curr.next
        return True
