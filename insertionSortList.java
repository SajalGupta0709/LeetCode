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
    public ListNode insertionSortList(ListNode head) {
        ListNode pseudoHead = new ListNode();
        ListNode curr = head, prevNode, nextNode;

        while (curr != null) {
            prevNode = pseudoHead;
            nextNode = pseudoHead.next;
            while (nextNode != null) {
                if (curr.val < nextNode.val)
                    break;
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
            ListNode nextIter = curr.next;
            curr.next = nextNode;
            prevNode.next = curr;
            curr = nextIter;
        }

        return pseudoHead.next;
    }
}
