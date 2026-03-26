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
    public int getDecimalValue(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null) {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        temp=prev;
        int ans=0;
        int pow=1;
        while(temp!=null){
            ans+=temp.val*pow;
            pow*=2;
            temp=temp.next;
        }
        return ans;
    }
}