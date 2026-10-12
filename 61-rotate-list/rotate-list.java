/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        {
            return head;
        }

        int size=0;
        ListNode curr=head;
        ListNode prev=head;;
        while(curr!=null)
        {
            size++;
            prev=curr;
            curr=curr.next;
        }
        prev.next=head;
        curr=head;
        k=k%size;
        for(int i=0;i<size-k-1;i++)
        {
            curr=curr.next;
        }
        ListNode newhead=curr.next;
        curr.next=null;
        return newhead;

    }
}