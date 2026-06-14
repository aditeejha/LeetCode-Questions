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
    public int pairSum(ListNode head) {
        // ListNode temp1=head;
        // ListNode temp2=head;
        // int n=0;
        // int sum=0; 
        // while(temp1!=null){
        //     n++;
        //     temp1=temp1.next;
        // }
        // temp1=head;
        // int cnt=0;
        // while(cnt<n/2 && temp1.next!=null){
        //     temp2=head;
        //     int curr=0;
        //     while(curr!=n-1-cnt && temp2.next!=null){
        //         temp2=temp2.next;
        //         curr++;
        //     }
        //     //temp2=temp2.next;
        //     int currSum=temp1.val+temp2.val;
        //     sum=Math.max(sum,currSum);
        //     temp1=temp1.next;
        //     cnt++;
        // }
        // return sum;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        int max=0;
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            max=Math.max(max,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return max;
    }
}