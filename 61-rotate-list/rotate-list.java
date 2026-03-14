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
        ListNode temp=head;
        int cnt=1;
        if(head==null || head.next==null || k==0) return head;
        while(temp.next!=null){
            cnt++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%cnt;
        if(k==0) {
            temp.next=null;
            return head;
        }
        int m=cnt-k;
        temp=head;
        while (--m>=1){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;
    }
}