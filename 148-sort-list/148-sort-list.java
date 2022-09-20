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
    public ListNode sortList(ListNode head) {
      
    
        if(head==null || head.next==null)
            return head;
        ListNode left=head;
        ListNode right=getMid(head);
        ListNode temp=right.next;
        right.next=null;
        right=temp;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode getMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left, ListNode right)
    {
        if(left == null)
            return right;
        if(right == null)
            return left;
        if(left.val < right.val)
        {
            left.next = merge(left.next, right);
            return left;
        }
        else
        {
            right.next = merge(left, right.next);
            return right;
        }
        
    }
}