Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=head.val;
            head=head.next;
        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum+=Math.pow(2,(count-i)-1)*arr[i];
           // System.out.println(count);
        }
        return sum; 
    }
}