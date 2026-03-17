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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        for(int i=0; i<k; i++){
            fast=fast.next;
        }
        ListNode slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=head;
        int c=0;
        while(--k !=0){
            temp=temp.next;
        }
        c=temp.val;
        temp.val=slow.val;
        slow.val=c;
        return head;
    }
}