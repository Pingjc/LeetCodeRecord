package maxArea;

public class Solution {
    public int maxArea(int[] height) {
        int tmp, ans = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                tmp = (j - i) * ((height[i] < height[j])?height[i]:height[j]);
                ans = (ans < tmp)?tmp:ans;
            }
        }
        return ans;
    }
}
