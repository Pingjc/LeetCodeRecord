package rob;

public class Solution {
    public int rob(TreeNode root) {
        return Math.max(rob(root, 0), rob(root, 1));
    }

    private int rob(TreeNode root, int robFlag) {
        if (root == null) {
            return 0;
        }
        if (robFlag == 1) {
            return root.val + rob(root.left, 0) + rob(root.right, 0);
        } else {
            return Math.max(rob(root.left, 0), rob(root.left, 1)) + Math.max(rob(root.right, 0), rob(root.right, 1));
        }
    }
}
