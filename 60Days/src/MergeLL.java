 class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
public class MergeLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode head = null;
        ListNode tail = null;

        while (list1 != null && list2 != null) {

            if (head == null) {

                if (list1.val < list2.val) {
                    head = tail = list1;
                    list1 = list1.next;
                } else {
                    head = tail = list2;
                    list2 = list2.next;
                }

            } else {

                if (list1.val < list2.val) {
                    tail.next = list1;
                    tail = tail.next;
                    list1 = list1.next;
                } else {
                    tail.next = list2;
                    tail = tail.next;
                    list2 = list2.next;
                }

            }
        }

        while (list1 != null) {
            tail.next = list1;
            tail=tail.next;
            list1=list1.next;
        }
        while (list2!=null) {
            tail.next = list2;
            tail=tail.next;
            list2=list2.next;
        }

        return head;
    }

}
