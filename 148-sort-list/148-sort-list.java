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
      
    
        if(head==null || head.next == null){
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);
        ListNode res = merge(left , right);
        return res;
    }
    public ListNode findMiddle(ListNode head)
    {
      ListNode slow=head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode temp = new ListNode(0);
        ListNode sorted = temp;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                sorted.next = head1;
                head1 = head1.next;
            }
            else{
                sorted.next = head2;
                head2 = head2.next;
            }
            sorted = sorted.next;
        }
        while(head1!=null){
            sorted.next = head1;
            sorted = sorted.next;
            head1 = head1.next;
        }
        while(head2!=null){
            sorted.next = head2;
            sorted = sorted.next;
            head2 = head2.next;
        }
        return temp.next;
    }
}