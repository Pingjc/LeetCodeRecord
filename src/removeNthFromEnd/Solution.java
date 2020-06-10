package removeNthFromEnd;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode forward = head;
        for (int i = 0; i < n; i++) {
            forward = forward.next;
        }
        if (forward == null) {
            return head.next;
        }

        ListNode target = head;
        while (forward.next != null) {
            forward = forward.next;
            target = target.next;
        }

        target.next = target.next.next;
        return head;
    }
}
