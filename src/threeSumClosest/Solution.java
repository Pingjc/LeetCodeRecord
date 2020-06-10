package threeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if ((i > 0) && (nums[i] == nums[i - 1])) {
                continue;
            }
            int j, k;
            j = i + 1;
            k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < diff) {
                    ans = sum;
                    diff = Math.abs(sum - target);
                }
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                }
                if (sum == target) {
                    return target;
                }
            }
        }

        return ans;
    }
}
