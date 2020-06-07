package longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int len = 0;
            for (int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {
                if (ans.charAt(j) == strs[i].charAt(j)) {
                    len++;
                } else {
                    break;
                }
            }
            ans = strs[i].substring(0, len);
        }

        return ans;
    }
}
