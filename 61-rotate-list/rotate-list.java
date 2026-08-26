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

        if(head==null || head.next ==null || k==0){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
int length=1;
        while(fast.next!=null){
            fast=fast.next;
            length++;
        }
        k=k%length;
        if(k==0){
            return head;
        }
fast.next=slow;

for(int i=0;i<length-1-k;i++){
    slow=slow.next;
}
head=slow.next;
slow.next=null;
return head;

    }
}