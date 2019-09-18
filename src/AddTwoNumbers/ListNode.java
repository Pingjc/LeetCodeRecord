package AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    ListNode(int[] num, int i) {
        val=num[i];
        if (i+1<num.length) {
            next=new ListNode(num,i+1);
        } else {
            next=null;
        }
    }

    public void put(int i) {
        if (next==null) {
            next=new ListNode(i);
        } else {
            next.put(i);
        }
    }

}
