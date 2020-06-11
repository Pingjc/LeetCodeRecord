package mergeTwoLists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode1 = getListNode(new int[]{1, 2, 4});
        ListNode listNode2 = getListNode(new int[]{1, 3, 4});
        print(solution.mergeTwoLists(listNode1, listNode2));
    }

    private static ListNode getListNode(int[] ints) {
        ListNode last = null;
        ListNode current = null;
        for (int i = ints.length - 1; i >= 0; i--) {
            current = new ListNode(ints[i], last);
            last = current;
        }

        return last;
    }

    private static void print(ListNode listNode) {
        if (listNode.next != null) {
            System.out.print(listNode.val + "->");
            print(listNode.next);
        } else {
            System.out.println(listNode.val);
        }
    }
}
