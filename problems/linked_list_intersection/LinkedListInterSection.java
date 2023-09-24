package problems.linked_list_intersection;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListInterSection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode one = headA;
        ListNode two = headB;

        while (one != two) {
            one = (one != null) ? one.next : headB;
            two = (two != null) ? two.next : headA;
        }

        return one;
    }
}
