package removeNthFromEnd;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] num = {1, 2, 3, 4, 5};
        ListNode root = generateChain(num, 0);
        print(solution.removeNthFromEnd(root, 2));
    }

    private static void print(ListNode node) {
        System.out.print(node.val);
        if (node.next != null) {
            System.out.print("->");
            print(node.next);
        } else {
            System.out.println();
        }
    }

    private static ListNode generateChain(int[] num, int i) {
        if (i >= num.length) {
            return null;
        }
        ListNode node = new ListNode(num[i]);
        node.next = generateChain(num, i + 1);
        return node;
    }
}
