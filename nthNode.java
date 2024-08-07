Given the head of a linked list, remove the nth node from the end of the list and return its head.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode current = head;
        // Node previous to the one to be removed
        ListNode prev = null;
        while (current != null) {
            // If we are n-steps ahead of the "head" node
            if (++count > n) {
                // Initialize previous node/move the pointer
                prev = prev == null ? head : prev.next;
            }
            current = current.next;
        }

        if (prev != null) {
            // Remove nth node if the previous node found
            prev.next = prev.next.next;
        } else {
            // Otherwise the removed node is "head"
            head = head.next;
        }

        return head;
    }
}