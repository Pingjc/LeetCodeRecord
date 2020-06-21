package maxPathSum;

public class Solution {
    public int maxPathSum(TreeNode root) {
        AnsNode ansNode = calculate(root);
        return ansNode.nodeMax;
    }

    private class AnsNode {
        int nodeMax;
        int chainMax;
    }

    private AnsNode calculate(TreeNode node) {
        AnsNode ansNode = new AnsNode();
        if (node == null) {
            ansNode.nodeMax = -1000;
            ansNode.chainMax = 0;
            return ansNode;
        }

        AnsNode leftAns = calculate(node.left);
        AnsNode rightAns = calculate(node.right);

        ansNode.chainMax = Math.max(Math.max(leftAns.chainMax, rightAns.chainMax) + node.val, 0);
        ansNode.nodeMax = max(node.val + leftAns.chainMax + rightAns.chainMax, leftAns.nodeMax, rightAns.nodeMax);

        return ansNode;
    }

    private int max(int a, int b, int c) {
        if (a > b) {
            return Math.max(a, c);
        } else {
            return Math.max(b, c);
        }
    }
}
