package removeLinkedListElements;

public class removeLinkedListElements {
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        // ListNode prev = null;
        ListNode next = null;
        while(temp != null) {
            // temp = temp.next;
            // if(temp != null && temp.val == val) {
            //     prev.next = temp.next;
            //     temp.next = null;
            //     temp = prev;
            // } else if(temp == null && prev.val == val) {
            //     head = null;
            //     temp = null;
            // }
            // prev = temp;
            if(temp != null && temp.val == val) {
                next = temp.next;
                temp = null;
                temp = next;
            } else {
                temp = temp.next;

            }
        }
        return head;
    }
}
}
