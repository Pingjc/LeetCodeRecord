package generateParenthesis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis(n, n, "");
    }

    private List<String> generateParenthesis(int left, int right, String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (left > 0) {
            ans.addAll(generateParenthesis(left - 1, right, str + "("));
        } else {
            StringBuffer stringBuffer = new StringBuffer(str);
            for (int i = 0; i < right; i++) {
                stringBuffer.append(')');
            }
            ans.add(stringBuffer.toString());
            return ans;
        }

        if (right > left) {
            ans.addAll(generateParenthesis(left, right - 1, str + ")"));
        }

        return ans;
    }
}
