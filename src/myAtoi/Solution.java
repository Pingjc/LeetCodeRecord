package myAtoi;

public class Solution {
    public int myAtoi(String str) {
        int ans = 0, sig = 1;

        int i = 0;
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }

            if (ch == '-') {
                sig = -1;
                break;
            }
            if (ch == '+') {
                sig = 1;
                break;
            }

            if ((ch >= '0') && (ch <= '9')) {
                sig = 1;
                ans = ch - '0';
                break;
            }

            return 0;
        }

        i++;
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= '0') && (ch <= '9')) {
                if (checkOverflow(ans, ch - '0', sig)) {
                    ans = ans * 10 + ch - '0';
                } else {
                    if (sig > 0) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
            } else {
                return ans * sig;
            }
        }

        return ans * sig;
    }

    private boolean checkOverflow(int high, int low, int sig) {
        if (sig > 0) {
            if (high > Integer.MAX_VALUE / 10) {
                return false;
            } else {
                return (high != Integer.MAX_VALUE / 10) || (low <= Integer.MAX_VALUE % 10);
            }
        } else {
            if (high * -1 < Integer.MIN_VALUE / 10) {
                return false;
            } else {
                return (high * -1 != Integer.MIN_VALUE / 10) || (low * -1 > Integer.MIN_VALUE % 10);
            }
        }
    }
}
