/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        int f=0;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){ f=1;
                break;}
        }
        if(f==0) return null;
        fast=head;
        while(true){
            if(slow==fast) return slow;
            slow=slow.next;
            fast=fast.next;
        }
    }
}
