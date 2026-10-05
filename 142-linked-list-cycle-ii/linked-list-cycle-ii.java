/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        {
            return null;
        }
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            ListNode newhead=head;
            while(slow!=newhead)
            {
                slow=slow.next;
                newhead=newhead.next;
            }
            return newhead;
        }
       }
       return null;
    }
}