package equationsPossible;

public class Solution {
    public boolean equationsPossible(String[] equations) {
        char[] map = new char[26];
        for (int i = 0; i < 26; i++) {
            map[i] = (char) ('a' + i);
        }

        for (int i = 0; i < equations.length; i++) {
            if (equations[i].charAt(1) == '=') {
                char tmp1 = equations[i].charAt(0);
                char tmp2 = equations[i].charAt(3);

                while (tmp1 != map[tmp1 - 'a']) {
                    tmp1 = map[tmp1 - 'a'];
                }
                while (tmp2 != map[tmp2 - 'a']) {
                    tmp2 = map[tmp2 - 'a'];
                }

                if (tmp1 < tmp2) {
                    map[tmp2 - 'a'] = tmp1;
                } else {
                    map[tmp1 - 'a'] = tmp2;
                }
            }
        }

        for (int i = 0; i < equations.length; i++) {
            if (equations[i].charAt(1) == '!') {
                char tmp1 = equations[i].charAt(0);
                char tmp2 = equations[i].charAt(3);

                while (tmp1 != map[tmp1 - 'a']) {
                    tmp1 = map[tmp1 - 'a'];
                }
                while (tmp2 != map[tmp2 - 'a']) {
                    tmp2 = map[tmp2 - 'a'];
                }

                if (tmp1 == tmp2) {
                    return false;
                }
            }
        }

        return true;
    }
}
