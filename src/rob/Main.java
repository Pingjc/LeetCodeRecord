package rob;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = arrayToTree(new int[]{3, 2, 3, 0, 3, 0, 1}, 0);
        System.out.println(solution.rob(root1));

        TreeNode root2 = arrayToTree(new int[]{3, 4, 5, 1, 3, 0, 1}, 0);
        System.out.println(solution.rob(root2));
    }

    private static TreeNode arrayToTree(int[] ints, int location) {
        if (location >= ints.length) {
            return null;
        }
        TreeNode node = new TreeNode(ints[location]);
        node.left = arrayToTree(ints, (location + 1) * 2 - 1);
        node.right = arrayToTree(ints, (location + 1) * 2);
        return node;
    }

}
