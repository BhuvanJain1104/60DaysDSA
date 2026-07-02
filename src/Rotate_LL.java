
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
}
public class Rotate_LL {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k %= len;

        if (k == 0)
            return head;

        tail.next = head; // make circular

        int steps = len - k - 1;

        ListNode newTail = head;

        for (int i = 0; i < steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }
}
