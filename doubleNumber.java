You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.

Return the head of the linked list after doubling it.

class Solution {
    
    int car;
    
    public void doubleUtil(ListNode head) {
        if (head == null) return;
        
        doubleUtil(head.next);
        
        int cur = 2 * head.val + car;
        car = cur / 10;
        
        head.val = cur % 10;
    }
    
    public ListNode doubleIt(ListNode head) {
        car = 0;
        doubleUtil(head);

        return (car == 0) ? head : new ListNode(car, head);
    }
}