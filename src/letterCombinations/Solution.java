package letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        return letterCombinations(digits, "");
    }

    private List<String> letterCombinations(String digits, String head) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            ans.add(head);
            return ans;
        }
        String tmp = digits.substring(1);
        switch (digits.charAt(0)) {
            case '2':
                addAns(tmp, head + 'a', ans);
                addAns(tmp, head + 'b', ans);
                addAns(tmp, head + 'c', ans);
                break;
            case '3':
                addAns(tmp, head + 'd', ans);
                addAns(tmp, head + 'e', ans);
                addAns(tmp, head + 'f', ans);
                break;
            case '4':
                addAns(tmp, head + 'g', ans);
                addAns(tmp, head + 'h', ans);
                addAns(tmp, head + 'i', ans);
                break;
            case '5':
                addAns(tmp, head + 'j', ans);
                addAns(tmp, head + 'k', ans);
                addAns(tmp, head + 'l', ans);
                break;
            case '6':
                addAns(tmp, head + 'm', ans);
                addAns(tmp, head + 'n', ans);
                addAns(tmp, head + 'o', ans);
                break;
            case '7':
                addAns(tmp, head + 'p', ans);
                addAns(tmp, head + 'q', ans);
                addAns(tmp, head + 'r', ans);
                addAns(tmp, head + 's', ans);
                break;
            case '8':
                addAns(tmp, head + 't', ans);
                addAns(tmp, head + 'u', ans);
                addAns(tmp, head + 'v', ans);
                break;
            case '9':
                addAns(tmp, head + 'w', ans);
                addAns(tmp, head + 'x', ans);
                addAns(tmp, head + 'y', ans);
                addAns(tmp, head + 'z', ans);
                break;
        }
        return ans;
    }

    private void addAns(String tmp, String head, List<String> ans) {
        List<String> tmpAns = letterCombinations(tmp, head);
        for (String str : tmpAns) {
            ans.add(str);
        }
    }
}
