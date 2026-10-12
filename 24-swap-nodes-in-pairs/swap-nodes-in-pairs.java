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

        List<ListNode> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr);
            curr=curr.next;
        }
        ListNode dummyhead=new ListNode(0);
        dummyhead.next=head;
        ListNode prev=dummyhead;
        for(int i=0;i<list.size()-1;i=i+2)
        {
            ListNode next=list.get(i+1).next;
            list.get(i+1).next=list.get(i);
            list.get(i).next=next;
            prev.next=list.get(i+1);
            prev=list.get(i);
        }
        return dummyhead.next;
    }
}