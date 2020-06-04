package productExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}
