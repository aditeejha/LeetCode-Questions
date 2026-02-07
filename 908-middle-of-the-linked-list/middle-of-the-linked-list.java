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
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        while(temp.next!=null){
            cnt++;
            temp=temp.next;
        }
        int mid;
        if(cnt%2==0) mid=cnt/2;
        else mid=cnt/2 +1;
        int k=0;
        temp=head;
        while(k!=mid){
            k++;
            temp=temp.next;
        }
        return temp;
    }
}