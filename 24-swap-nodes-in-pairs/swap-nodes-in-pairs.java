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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode dummyhead=new ListNode(0);
        dummyhead.next=head;
        ListNode prev=dummyhead;
        while(head!=null && head.next!=null)
        {
            ListNode next1=head.next;
            ListNode next2=head.next.next;
            next1.next=head;
            prev.next=next1;
            head.next=next2;
            prev=head;
            head=head.next;
        }
        return dummyhead.next;
        
    }
}