package problems.palindrome_list;

import java.util.ArrayDeque;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        curr = head;
        while (!stack.isEmpty()) {
            ListNode last = stack.pop();
            if (curr.val != last.val) {
                return false;
            }
            curr = curr.next;
        }

        return true;

    }
}
