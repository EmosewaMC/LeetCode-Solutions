package addTwoNumbers;

public class AddTwoNumbers {
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
    public static void main(String[] args) {
        ListNode l1 = new ListNode(433);
        ListNode l2 = new ListNode(177);
        ListNode temp = addTwoNumbers(l1, l2);
        while(temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Value = 0;
        int l2Value = 0;
        int total;
        int carry = 0;
        ListNode newNode;
        ListNode head = new ListNode();
        ListNode tail = head;
        boolean firstNumber = true;
        while((l1 != null || l2 != null) || (carry > 0 || firstNumber)) {
            if(l1 != null) {
                l1Value = l1.val;
                l1 = l1.next;
            } else {
                l1Value = 0;
            }
            if(l2 != null) {
                l2Value = l2.val;
                l2 = l2.next;
            } else {
                l2Value = 0;
            }
            total = l1Value + l2Value + carry;
            carry = 0;
            if(firstNumber) {
                head = new ListNode(total % 10);
                tail = head;
                firstNumber = false;
            } else {
                newNode = new ListNode(total % 10);
                tail.next = newNode;
                tail = tail.next;
            }
            while(total >= 10) {
                carry = carry + 1;
                total = total - 10;
            }
        }
        return head;
    }
}
