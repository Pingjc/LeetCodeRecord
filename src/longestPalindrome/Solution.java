package longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();

        if (length == 0) {
            return "";
        }

        boolean [][] map = new boolean[length][length + 1];
        int start, maxLength;

        for (int i = 0; i < length; i++) {
            map[i][0] = true;
            map[i][1] = true;
        }

        start = 0;
        maxLength = 1;

        for (int i = 2; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {
                if ((map[j + 1][i - 2]) && (s.charAt(j) == s.charAt(j + i - 1))) {
                    map[j][i] = true;
                    if (i > maxLength) {
                        start = j;
                        maxLength = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
