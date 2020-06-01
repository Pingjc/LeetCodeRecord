package reverse;

public class Solution {
    public int reverse(int x) {
        int tmp, ans = 0;
        int sig;

        if (x >= 0) {
            sig = 1;
        } else {
            sig = -1;
        }

        tmp = Math.abs(x);

        while (tmp > 0) {
            if (!checkOverflow(ans, tmp % 10, sig)) {
                return 0;
            }
            ans = ans * 10 + (tmp % 10);
            tmp /= 10;
        }
        ans *= sig;

        return ans;
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
