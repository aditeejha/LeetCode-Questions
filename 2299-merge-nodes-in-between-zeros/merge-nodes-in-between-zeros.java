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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        ListNode temp2=head.next;
        while(temp2!=null){
            int sum=0;
            while(temp2!=null && temp2.val!=0){
            sum+=temp2.val;
            temp2=temp2.next;
            }
            //if(temp2!=null){
            ListNode n=new ListNode(sum);
            dummy.next=n;
            dummy=dummy.next;
            temp2=temp2.next;
            //}
        }
        return res.next;
    }
}