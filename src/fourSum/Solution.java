package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> ansList =new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((i > 0) && (nums[i] == nums[i - 1])) {
                continue;
            }
            List<List<Integer>> tmp = threeSum(nums, i + 1, nums[i], target - nums[i]);
            ansList.addAll(tmp);
        }

        return ansList;
    }

    public List<List<Integer>> threeSum(int[] nums, int start, int head, int target) {
        List<List<Integer>> ansList =new ArrayList<>();

        for (int i = start; i < nums.length; i++) {
            if ((nums[i] > target) && (nums[i] > 0)) {
                break;
            }
            if ((i > start) && (nums[i] == nums[i - 1])) {
                continue;
            }
            int j, k;
            j = i + 1;
            k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    ansList.add(Arrays.asList(head, nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                }
            }
        }
        return ansList;
    }
}
