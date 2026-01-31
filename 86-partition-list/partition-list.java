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
    public ListNode partition(ListNode head, int x) {
        ListNode smallerDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);
        ListNode small = smallerDummy;
        ListNode great = greaterDummy;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                great.next = head;
                great = great.next;
            }
            head = head.next;
        }
        great.next = null;
        small.next = greaterDummy.next;

        return smallerDummy.next;
    }
}
