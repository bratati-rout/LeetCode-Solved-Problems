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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=head;
        if(head==null || head.next==null)
            return true;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverseList(slow.next);
        slow=slow.next;
        while(dummy!=null && slow!=null)
        {
            if(slow.val==dummy.val)
            {
                dummy=dummy.next;
                slow=slow.next;
            }
            else
                return false;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head)
    {
        ListNode pre=null;
        ListNode next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}