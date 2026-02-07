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
    public ListNode reverseList(ListNode head) {
        // ArrayList<Integer> list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=list.size()-1; i>=0; i--){
        //     temp.val=list.get(i);
        //     temp=temp.next;
        // }
        // return head;
        ListNode temp=head;
        ListNode front, prev=null;
        while(temp!=null){
            front= temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}