package romanToInt;

public class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char lastChar = s.charAt(0);
        int ans = romanToInt(lastChar);

        for (int i = 1; i < s.length(); i++) {
            char tmp = s.charAt(i);
            ans += romanToInt(tmp);
            if (romanToInt(lastChar) < romanToInt(tmp)) {
                ans -= romanToInt(lastChar) * 2;
            }
            lastChar = tmp;
        }

        return ans;
    }

    private int romanToInt(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
