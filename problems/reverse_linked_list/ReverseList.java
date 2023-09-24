package problems.reverse_linked_list;

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

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return null;
        ArrayDeque<ListNode> stack = new ArrayDeque<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode reverseHead = stack.pop();
        ListNode curr = reverseHead;
        while (!stack.isEmpty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null; // set final node's next as null
        // System.out.println(reverse.val);
        return reverseHead;
    }
}
