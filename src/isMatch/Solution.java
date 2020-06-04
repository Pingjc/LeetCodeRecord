package isMatch;

public class Solution {
    public boolean isMatch(String s, String p) {
        if ((s.length() == 0) && (p.length() == 0)) {
            return true;
        }

        if ((s.length() != 0) && (p.length() == 0)) {
            return false;
        }

        if ((p.length() >= 2) && (p.charAt(1) == '*')) {
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            int index = 0;
            while ((index < s.length()) && charMatch(s.charAt(index), p.charAt(0))) {
                if (isMatch(s.substring(index + 1), p.substring(2))) {
                    return true;
                }
                index++;
            }
        } else if ((s.length() > 0) && charMatch(s.charAt(0), p.charAt(0))) {
            return isMatch(s.substring(1), p.substring(1));
        }

        return false;
    }

    private boolean charMatch(char c, char p) {
        if (p == '.') {
            return true;
        }
        return c == p;
    }
}
