package dailyTemperatures;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];

        for (int i = T.length - 1; i >= 0; i--) {
            int tar = i + 1;
            while (tar < T.length) {
                if (T[tar] > T[i]) {
                    ans[i] = tar - i;
                    break;
                } else {
                    if (ans[tar] > 0) {
                        tar += ans[tar];
                    } else {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
