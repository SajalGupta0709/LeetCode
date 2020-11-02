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
        if(head==null||head.next==null) return head;
        ListNode fast=head;
        int l=0;
        while(fast.next!=null){
            l++; fast=fast.next;
        }
        l++; 
        fast.next=head;
        int rp=l-k%l;
        fast=head;
        while(rp-->1)
            fast=fast.next;
        head=fast.next;
        fast.next=null;
        return head;
    }
        
}
