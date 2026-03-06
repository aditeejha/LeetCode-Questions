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
        if(head==null || head.next==null) return head;
        // ListNode dummy=new ListNode(0);
        // ListNode t1=head;
        // ListNode t2=head.next;
        // ListNode t3=head.next.next;
        // while(t2!=null){
        //     t2.next=t1;
        //     t1.next=t3;
        //     dummy=t1;
        //     t1=t3;
        //     t2=t1.next;
        //     dummy.next=t3;
        //     t3=t2.next;
        // }
        // return head.next;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode a=prev.next;
            ListNode b=a.next;
            a.next=b.next;
            b.next=a;
            prev.next=b;
            prev=a;
        }
        return dummy.next;
    }
}