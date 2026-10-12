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
        if(head==null)
        {
            return head;
        }
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        k=k%list.size();

        reverse(list,0,list.size()-1);
        reverse(list,0,k-1);
        reverse(list,k,list.size()-1);

        curr=head;
        int index=0;
        while(curr!=null)
        {
            curr.val=list.get(index++);
            curr=curr.next;
        }
        return head;

    }
    public static void reverse(List<Integer> list,int left,int right)
    {
        while(left<right)
        {
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
}