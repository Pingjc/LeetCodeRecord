package AddTwoNumbers;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num1={2,4,3};
        int[] num2={5,6,4};
        ListNode l1=new ListNode(num1,0);
        ListNode l2=new ListNode(num2,0);

        ListNode ans=solution.addTwoNumbers(l1,l2);

        print(ans);
    }

    private static void print(ListNode listNode) {
        if (listNode.next==null) {
            System.out.println(listNode.val);
        } else {
            System.out.print(listNode.val+"->");
            print(listNode.next);
        }
    }
}
