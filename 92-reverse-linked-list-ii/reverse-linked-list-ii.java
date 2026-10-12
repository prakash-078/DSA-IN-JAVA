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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        {
            return head;
        }
        ListNode dummyhead=new ListNode(0);
        dummyhead.next=head;
        ListNode prevleft=dummyhead;
        for(int i=1;i<left;i++)
        {
            prevleft=prevleft.next;
        }

        ListNode prev=null;
        ListNode curr=prevleft.next;
        for(int i=0;i<=right-left;i++)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode x=prevleft.next;
        x.next=curr;
        prevleft.next=prev;
        return dummyhead.next;
    }
}