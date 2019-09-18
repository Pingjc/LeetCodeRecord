package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode((l1.val+l2.val)%10);
        ListNode tmpNode=ans;
        int upper=(l1.val+l2.val)/10;
        l1=l1.next;
        l2=l2.next;

        while (l1!=null && l2!=null) {
            tmpNode.next=new ListNode(0);
            tmpNode=tmpNode.next;
            int tmp=upper+l1.val+l2.val;
            tmpNode.val=tmp%10;
            upper=tmp/10;
            l1=l1.next;
            l2=l2.next;
        }

        while (l1!=null) {
            tmpNode.next=new ListNode(0);
            tmpNode=tmpNode.next;
            int tmp=upper+l1.val;
            tmpNode.val=tmp%10;
            upper=tmp/10;
            l1=l1.next;
        }

        while (l2!=null) {
            tmpNode.next=new ListNode(0);
            tmpNode=tmpNode.next;
            int tmp=upper+l2.val;
            tmpNode.val=tmp%10;
            upper=tmp/10;
            l2=l2.next;
        }

        while (upper>0) {
            tmpNode.next=new ListNode(upper%10);
            tmpNode=tmpNode.next;
            upper/=10;
        }

        return ans;
    }
}
